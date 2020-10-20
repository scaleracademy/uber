package com.uber.api.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account extends Auditable {
    @Column(unique = true)
    private String phoneNumber;

    @NonNull
    private String password;

    @ManyToMany
    @Singular
    private List<Role> roles;
}


// User class

// Role Based Authentication
// Role - Instructor, HR
// Permissions - canAddMentor, canSendAnnouncement, canCreateClass