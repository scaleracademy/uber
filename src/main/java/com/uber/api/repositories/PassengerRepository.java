package com.uber.api.repositories;

import com.uber.api.models.Account;
import com.uber.api.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    Optional<Passenger> findFirstByAccount_PhoneNumber(String phoneNumber);
    // I want a function that gets me the account
    // that account should have a password of xyz

    // CRUD, find-by-attribute, find-by-attribute-of-attribute

}
