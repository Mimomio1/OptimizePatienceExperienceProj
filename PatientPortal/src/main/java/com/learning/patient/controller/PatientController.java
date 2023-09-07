package com.learning.patient.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.patient.entity.Patient;
import com.learning.patient.exceptions.UserNameAlreadyExistsException;
import com.learning.patient.service.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/patient")
@Validated
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	private Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
	
//	@PostMapping("/register")
//	public ResponseEntity<?> registerCustomer(@Valid @RequestBody CreateUserRequest registerUserRequest) {
//		if (!patientService.existsByUsername(registerUserRequest.getUsername())) {
//			Patient patient = new Patient();
//			patient.setFirstname(registerUserRequest.getFullname());
//			patient.setUsername(registerUserRequest.getUsername());
//			String password = passwordEncoder.encode(registerUserRequest.getPassword());
//			patient.setPassword(password);
//			patient.setAadhar(registerUserRequest.getAadhar());
//			patient.setFullname(registerUserRequest.getFullname());
//			patient.setPan(registerUserRequest.getPan());
//			patient.setPhone(registerUserRequest.getPhone());
//			patient.setSecretQuestion(registerUserRequest.getSecretQuestion());
//			patient.setSecretAnswer(registerUserRequest.getSecretAnswer());
//		
//			Patient c = patientService.addCustomer(patient);
//
//			RegisterPatientResponse cr = new RegisterCustomerResponse();
//			cr.setId(c.getPatientID());
//			cr.setUsername(c.getUsername());
//			cr.setFirstname(c.getFirstname());
//			return ResponseEntity.status(201).body(cr);
//		} else {
//			throw new UserNameAlreadyExistsException("Username: " + registerUserRequest.getUsername() + " already exists!");
//		}
//	}
}
