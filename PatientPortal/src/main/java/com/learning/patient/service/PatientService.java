package com.learning.patient.service;

import java.util.List;
import java.util.Optional;

import com.learning.patient.entity.Patient;

public interface PatientService {
	Patient addPatient(Patient customer);
	Optional<Patient> getPatientByID(long id);
	Optional<Patient> getPatientByUsername(String username);
	List<Patient> getAllPatients();
	boolean existsByID(long id);
	boolean existsByUsername(String username);
}