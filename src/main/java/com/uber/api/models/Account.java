package com.uber.api.models;

import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "account")
public class Account extends Auditable {
    @Column(unique = true)
    private String phoneNumber;

    @NonNull
    private String password;

    @ManyToMany
    private List<Role> roles;
}


// User class

// Role Based Authentication
// Role - Instructor, HR
// Permissions - canAddMentor, canSendAnnouncement, canCreateClass