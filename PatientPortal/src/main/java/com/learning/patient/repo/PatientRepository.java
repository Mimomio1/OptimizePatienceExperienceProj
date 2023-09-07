package com.learning.patient.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.patient.entity.Patient;

import jakarta.transaction.Transactional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	@Transactional 
	@Override
	<S extends Patient> S save(S entity);
	
	@Transactional
	@Override
	<S extends Patient> List<S> saveAll(Iterable<S> entities);
	
	Optional<Patient> findByUsername(String username);
	boolean existsByUsername(String username);

}
