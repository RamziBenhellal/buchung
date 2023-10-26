package com.buchung.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buchung.model.Termin;
import com.buchung.service.TerminService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("buchung/termin")
@AllArgsConstructor
public class TerminController {

	private final TerminService terminService;
	
	@GetMapping("index")
	public ResponseEntity<List<Termin>> index(){
		List<Termin> termine = terminService.getAll();
		return new ResponseEntity<>(termine, HttpStatus.OK);  
	}
	
	@GetMapping("details/{id}") 
	ResponseEntity<Termin> details(@PathVariable("id")Integer id){
		Termin termin = terminService.get(id).get();
		return new ResponseEntity<>(termin, HttpStatus.OK);
	}
	
	@PostMapping("add/{idZweck}")
	public ResponseEntity<Termin> add(@PathVariable("idZweck")Integer id,@RequestBody Termin termin){
		Termin newTermin = terminService.addTermin(id,termin);
		return new ResponseEntity<>(newTermin,HttpStatus.CREATED);
	}
}
