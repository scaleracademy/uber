package com.uber.api.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "location")
@Getter
@Setter
public class Location extends Auditable {
    String latitude;
    String longitude;
    String city;
    String state;
    String country;
    String zipCode;
}
