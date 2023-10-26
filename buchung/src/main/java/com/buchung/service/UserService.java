package com.buchung.service;

import java.util.List;
import java.util.Optional;

import com.buchung.model.User;

public interface UserService {
	
	User addUser(Integer idTermin,User user);
	List<User> getAll();
	Optional<User> get(Integer id);

}
