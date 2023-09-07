package com.learning.patient.payload.response;


import com.learning.patient.entity.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterPatientResponse {
	private Long id;
	private String username;
	private String fullname;
	
	public RegisterPatientResponse(Patient patient) {
//		this.id = patient
//		this.username = patient.get
//		this.fullname = customer.getFullname();	
	}
}