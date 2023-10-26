package com.buchung.model;

import java.util.List;
import java.util.Set;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity(name="Zweck")
@Table(name="zweck")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Zweck {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "zweckId", updatable = false)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="bemerkung")
	private String bemerkung;
	
	@OneToMany(mappedBy="zweck")
	private Set<Termin> termine;
	
	

}
