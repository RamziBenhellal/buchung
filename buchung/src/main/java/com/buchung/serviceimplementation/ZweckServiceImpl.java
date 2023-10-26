package com.buchung.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.buchung.model.Zweck;
import com.buchung.repository.ZweckRepository;
import com.buchung.service.ZweckService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ZweckServiceImpl implements ZweckService {
	
	private final ZweckRepository zweckRepo;

	@Override
	public Zweck addZweck(Zweck zweck) {
		return zweckRepo.save(zweck);
	}

	@Override
	public List<Zweck> getAll() {
		return zweckRepo.findAll();
	}
	
	@Override
	public Optional<Zweck> get(Integer id) {
		return zweckRepo.findById(id);
	}

	@Override
	public Zweck update(Integer id,Zweck updatedZweck) {
		return null;
	}

	
}
