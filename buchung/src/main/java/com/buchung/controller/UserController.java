package com.buchung.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buchung.model.User;
import com.buchung.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("buchung/user")
@AllArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("index")
	public ResponseEntity<List<User>> index(){
		List<User> users = userService.getAll();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("details/{id}")
	public ResponseEntity<User> details(@PathVariable("id") Integer id){
		User user = userService.get(id).get();
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("add/{idTermin}")
	public ResponseEntity<User> add(@RequestBody User user,@PathVariable("idTermin") Integer idTermin){
		User newuser = userService.addUser(user, idTermin);
		return new ResponseEntity<>(newuser,HttpStatus.CREATED);
	}	

}
