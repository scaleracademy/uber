package com.uber.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/driver")
@RestController
public class DriverController {
/*

REST APIs for Driver
--------------------

GET /bookings - get all the bookings for this driver
GET/booking/id - similar
PUT /booking/id/arrived - mark the booking-status as cab-arrived
PUT /booking/id/start-ride - mark the booking-status as started, verify the otp
PUT /booking/id/end-ride
PUT /update-location
PUT /booking/id/cancel - cancel the booking
PUT /booking/id/accept - accept the booking that doesnt currently belong to this driver

// make sure that this driver is compatible with this bookings




PUT /turn-off-availability - turn off the driver availability
PUT /turn-on-availability - turn off the driver availability
PUT /update-status
PUT /toggle-availability  // No, because not idempotent
 */


}
