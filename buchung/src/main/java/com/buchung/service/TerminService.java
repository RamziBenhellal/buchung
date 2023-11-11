package com.buchung.service;

import java.util.List;
import java.util.Optional;

import com.buchung.model.Termin;

public interface TerminService {
	
	Termin addTermin(Integer idZweck, Termin termin);
	List<Termin> getAll();
	List<Termin> getAll(Integer zweckId);
	List<Termin> getAllGoupBy(Integer zweckId);
	Optional<Termin> get(Integer id);
	Termin update(Integer id,Termin updatedTermin);
	Termin updateZweck(Integer id,Integer idZweck);
	
	
	

}
