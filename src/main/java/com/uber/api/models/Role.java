package com.uber.api.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
@Getter
@Setter
public class Role extends Auditable{
    private String name;
    private String description;
}
