package com.buchung.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buchung.model.Termin;
import com.buchung.model.Zweck;
import com.buchung.repository.ZweckRepository;
import com.buchung.service.ZweckService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ZweckServiceImpl implements ZweckService {
	
	private final ZweckRepository zweckRepo;

	@Override
	public Zweck save(Zweck zweck) {
		return zweckRepo.save(zweck);
	}

	@Override
	public List<Zweck> getAll() {
		return zweckRepo.findAll();
	}

	@Override
	public Zweck edit(Zweck zweck) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zweck addTermin(Integer id,Termin termin) {
		 Zweck zweck = zweckRepo.findById(id).get();
		 zweck.getTermine().add(termin);
		 
		return zweckRepo.save(zweck);
	}

}
