package com.buchung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buchung.model.Zweck;

public interface ZweckRepository extends JpaRepository<Zweck,Integer> {

}
