package com.buchung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buchung.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
