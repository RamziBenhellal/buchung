package com.buchung.service;

import java.util.List;
import java.util.Optional;

import com.buchung.model.Zweck;

public interface ZweckService {
	
	Zweck addZweck(Zweck zweck);
	List<Zweck> getAll();
	Optional<Zweck> get(Integer id);
	Zweck update (Integer id,Zweck updatedZweck);
	void remove(Integer id);

}
