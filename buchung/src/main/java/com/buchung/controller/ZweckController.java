package com.buchung.controller;

import java.net.http.HttpRequest;
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
import com.buchung.model.Zweck;
import com.buchung.service.ZweckService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/zweck")
@RequiredArgsConstructor
public class ZweckController {
	
	private final ZweckService zweckService;
	
	@GetMapping
	public ResponseEntity<List<Zweck>> index(){
		List<Zweck> zwecke = zweckService.getAll();
		return new ResponseEntity<>(zwecke,HttpStatus.OK);
	}
	
	@GetMapping("details/{id}")
	public ResponseEntity<Zweck> details(@PathVariable("id")Integer id){
		Zweck zweck = zweckService.get(id).get();
		return new ResponseEntity<>(zweck,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Zweck> add(@RequestBody Zweck zweck){
		Zweck newZweck = zweckService.addZweck(zweck);
		return new ResponseEntity<>(newZweck,HttpStatus.CREATED);
	}
	
	@PostMapping("/add_Termin/{id}")
	public ResponseEntity<Zweck> add(@PathVariable Integer id,@RequestBody Termin termin ){
		Zweck zweck = zweckService.addTermin(id, termin);
		return new ResponseEntity<>(zweck,HttpStatus.CREATED);
	}
	
	
	

}
