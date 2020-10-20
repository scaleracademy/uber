package com.uber.api.models;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
@Getter
@Setter
public class Booking extends Auditable {
    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Driver driver;

    private BookingStatus bookingStatus;

    private BookingType bookingType;

    @OneToOne
    private OTP rideStartOTP;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private PaymentReceipt paymentReceipt;

    @ManyToMany
    private List<Location> route;
}
