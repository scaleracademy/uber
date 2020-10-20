package com.uber.api.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter @Setter
@Table(name="color")
@NoArgsConstructor
@AllArgsConstructor
public class Color extends Auditable {
    private String name;
}
