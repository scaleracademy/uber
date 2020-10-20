package com.uber.api.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "otp")
@Getter
@Setter
public class OTP extends Auditable {
    private String code;

    private String sentToNumber;

    @Builder.Default
    private Integer attemptsMade = 0;

    @Builder.Default
    private Boolean isValid = true;

    public static OTP randomOTP(String sentToNumber) {
        return OTP.builder()
                .code("0000")
                .sentToNumber(sentToNumber)
                .build();
    }
}

// 1. Disk is cheap
// 2. Premature optimization is the root of all evil
