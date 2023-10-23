package com.buchung.service;

import java.util.List;

import com.buchung.model.Termin;
import com.buchung.model.Zweck;

public interface ZweckService {
	
	Zweck save(Zweck zweck);
	List<Zweck> getAll();
	Zweck edit (Zweck zweck);
	Zweck addTermin(Integer id,Termin termin);

}
