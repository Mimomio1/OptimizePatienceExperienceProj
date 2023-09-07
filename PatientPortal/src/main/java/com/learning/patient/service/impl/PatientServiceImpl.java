package com.learning.patient.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.patient.entity.Patient;
import com.learning.patient.repo.PatientRepository;
import com.learning.patient.service.PatientService;

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;
	
	@Override
	public Patient addPatient(Patient patient) {
		return repo.save(patient);
	}

	@Override
	public Optional<Patient> getPatientByID(long id) {
		return repo.findById(id);
	}

	@Override
	public Optional<Patient> getPatientByUsername(String username) {
		return repo.findByUsername(username);
	}

	@Override
	public List<Patient> getAllPatients() {

		return repo.findAll();
	}

	@Override
	public boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsByID(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
