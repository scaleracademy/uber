package com.uber.api.models;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// constructor private
// java reflection API
// expose a public constructor

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="passenger")
@Getter @Setter
public class Passenger extends Auditable {
    private String name;

    private Gender gender;

    @ManyToOne
    private Location location;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
}
