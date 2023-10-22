package com.buchung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buchung.model.Termin;

public interface TerminRepository extends JpaRepository<Termin,Integer>{

}
