package com.uber.api.controllers;

import com.uber.api.models.Booking;
import com.uber.api.models.BookingStatus;
import com.uber.api.models.Passenger;
import com.uber.api.repositories.AccountRepository;
import com.uber.api.repositories.BookingRepository;
import com.uber.api.repositories.PassengerRepository;
import com.uber.api.services.BookingService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    AccountRepository accountRepository;
    BookingRepository bookingRepository;
    PassengerRepository passengerRepository;
    BookingService bookingService;
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    private Passenger fromPhone(String phoneNumeber) {
        return passengerRepository.findFirstByAccount_PhoneNumber(phoneNumeber).orElseThrow();
    }

    @PostMapping("/{phoneNumber}/bookings")
    public void requestBooking(@PathVariable(name="phoneNumber") String phoneNumber,
                               @RequestBody Booking data) {
        Passenger passenger = fromPhone(phoneNumber);

        // exception
        // your exception should be as specific as possible
        // throw new Exception(); // puppies die
        // this passenger is authenticated

        Booking booking = Booking.builder()
                .passenger(passenger)
                .bookingStatus(BookingStatus.REQUESTED)
                .bookingType(data.getBookingType())
                .build();
        bookingRepository.save(booking);
        bookingService.requestBooking(booking);
    }


/*
REST APIs to create
-------------------

min(y, min(x, min(x, y)))
x + y != x + x + y

Safe (Read only) & Idempotent (multiple applications dont change) - GET
Idempotent - PUT, PATCH
POST - neither safe, nor idempotent

GET /bookings
- return all bookings of this passenger

GET /booking/id
- make sure that that booking actually belongs to this passenger
- return the details of the booking

PUT /booking/id
- make sure that that booking actually belongs to this passenger
- update the booking
- return 200 status

POST /bookings
- Request a booking for the user

PUT /booking/id/cancel
- make sure that that booking actually belongs to this passenger
- cancel the booking

PUT /
- update the user details


Banking application
/send-money?amount=1000  # Disaster
PUT /transactionRequest - unique code - amount-to-transfer


Swiggy - place the same order twice, an automatic call comes to you


 */


}
// /passenger
