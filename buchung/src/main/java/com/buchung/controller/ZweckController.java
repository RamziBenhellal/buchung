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

import com.buchung.model.Zweck;
import com.buchung.service.ZweckService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("buchung/zweck")
@RequiredArgsConstructor
public class ZweckController {
	
	private final ZweckService zweckService;
	
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("index")
	public ResponseEntity<List<Zweck>> index(){
		List<Zweck> zwecke = zweckService.getAll();
		System.out.println(zwecke.get(0));
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
	
	
	
	
	

}
