package com.uber.api.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paymentgateway")
@Getter
@Setter
public class PaymentGateway extends Auditable{
    private String name;
}
