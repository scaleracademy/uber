package com.uber.api.models;

public enum BookingStatus {
    REQUESTED, // driver not assigned
    SCHEDULED, // driver is assigned, but for future
    CAB_ARRIVED, // driver has reached your place
    ONGOING, // ride is in progress
    COMPLETED,
    CANCELLED // passenger/driver cancelled the booking
}
