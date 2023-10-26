package com.buchung.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.buchung.model.Termin;
import com.buchung.model.Zweck;
import com.buchung.repository.TerminRepository;
import com.buchung.repository.ZweckRepository;
import com.buchung.service.TerminService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class TerminServiceImpl implements TerminService {

	public final TerminRepository terminRepository;
	public final ZweckRepository  zweckRepository;
	@Override
	public Termin addTermin(Integer idZweck, Termin termin) {
		Zweck zweck = zweckRepository.findById(idZweck).get();
		termin.setZweck(zweck);
		return terminRepository.save(termin);
	}

	@Override
	public List<Termin> getAll() {
		return terminRepository.findAll();
	}

	@Override
	public Optional<Termin> get(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
