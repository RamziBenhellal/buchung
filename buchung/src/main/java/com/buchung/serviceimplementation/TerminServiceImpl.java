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
		termin.setStatus("nicht gebucht");
		return terminRepository.save(termin);
	}

	@Override
	public List<Termin> getAll() {
		return terminRepository.findAll();
	}

	@Override
	public Optional<Termin> get(Integer id) {
		return terminRepository.findById(id);
	}

	@Override
	public Termin update(Integer id, Termin updatedTermin) {
		Termin termin = terminRepository.findById(id).get();
		termin.setDatum(updatedTermin.getDatum());
		termin.setZeit(updatedTermin.getZeit());
		
		return terminRepository.save(termin);
	}

	@Override
	public Termin updateZweck(Integer id, Integer idZweck) {
		Termin termin = terminRepository.findById(id).get();
		termin.setZweck(zweckRepository.findById(idZweck).get());
		return terminRepository.save(termin);
	}

	@Override
	public List<Termin> getAll(Integer zweckId) {
		Zweck zweck = zweckRepository.findById(zweckId).get();
		return terminRepository.findAllByZweckOrderByDatum(zweck);
	}
	
	@Override
	public List<Termin> getAllGoupBy(Integer zweckId) {
		Zweck zweck = zweckRepository.findById(zweckId).get();
		return terminRepository.findAllByZweckGroupByDatumZeit(zweck);
	}
	

}
