package com.uber.api.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
@Getter
@Setter
public class Car extends Auditable {
    private String licensePlateNumber;

    private String model;

    private String brand;

    @OneToOne
    private Driver driver;

    @ManyToOne
    private Color color;

    private CarType carType;
}
