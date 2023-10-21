package com.buchung.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="Termin")
@Table(name="termin")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Termin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "termin_nr")
	private Integer terminNr;
	
	@Column(name="datum")
	private Date datum;
	
	@Column(name="zeit")
	private Time zeit;
	

	

}
