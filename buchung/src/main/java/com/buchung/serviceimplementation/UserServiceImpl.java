package com.buchung.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.buchung.model.Termin;
import com.buchung.model.User;
import com.buchung.repository.TerminRepository;
import com.buchung.repository.UserRepository;
import com.buchung.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	private final TerminRepository terminRepository;

	@Override
	public User addUser(User user,Integer idTermin) {
		Termin termin = terminRepository.findById(idTermin).get();
//		termin.setUser(user);
		user.setTermin(termin);
		termin.setStatus("gebucht");
		
		//terminRepository.save(termin);
		return 	 userRepository.save(user);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> get(Integer id) {
		return userRepository.findById(id);
	}

}
