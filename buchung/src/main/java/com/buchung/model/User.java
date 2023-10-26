package com.buchung.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="User")
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId", updatable = false)
	private Integer id;
	
	@Column(name="vorname")
	private String vorname;
	
	@Column(name="nachname")
	private String nachname;
	
	@Column(name="email")
	private String email;
	
	@OneToOne
	@JoinColumn(name="termin_nr",nullable = false)
	private Termin termin;
	
	
}
