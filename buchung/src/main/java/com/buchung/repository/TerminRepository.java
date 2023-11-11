package com.buchung.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.buchung.model.Termin;
import com.buchung.model.Zweck;

public interface TerminRepository extends JpaRepository<Termin,Integer>{

	List<Termin> findAllByZweckOrderByDatum(Zweck zweck);
	
	@Query("SELECT t FROM Termin t WHERE t.zweck =:zweck and t.status = 'nicht gebucht'  GROUP BY t.datum, t.zeit" )
	List<Termin> findAllByZweckGroupByDatumZeit(@Param("zweck") Zweck zweck);
}
