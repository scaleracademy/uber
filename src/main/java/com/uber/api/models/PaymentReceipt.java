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
@Table(name = "paymentreceipt")
@Getter
@Setter
public class PaymentReceipt extends Auditable {
    @OneToOne
    private Booking booking;
    private Double amount;
    @ManyToOne
    private PaymentGateway paymentGateway;
}
