package com.buchung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buchung.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
