package com.uber.api.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "driver")
@Getter
@Setter
public class Driver extends Auditable {
    private Gender gender;

    @OneToOne
    private Car car;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings;

    @OneToOne
    private Booking currentlyActiveBooking;

    @Builder.Default
    private Boolean isAvailable = true;

    @ManyToOne
    private Location location;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
}

// inheritance is an OOP concept - objects and relations
// DBs don't have inheritance - tables/rows and relations

/*

User:
    id
    password

Passenger(User):
    name

Driver(User):
    age

# Per table inheritance
Passenger
id password name

Driver
id password name

User
id password

Driver
name user_id

Passenger
name user_id
 */