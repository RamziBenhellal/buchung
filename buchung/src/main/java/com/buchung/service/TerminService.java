package com.buchung.service;

import java.util.List;
import java.util.Optional;

import com.buchung.model.Termin;

public interface TerminService {
	
	Termin addTermin(Integer idZweck, Termin termin);
	List<Termin> getAll();
	Optional<Termin> get(Integer id);
	
	

}
