package com.learning.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.patient.service.OpenTextService;


@RestController
@RequestMapping("/api/otds")
public class OpenTextController {

	 	private final OpenTextService otdsService;

	    @Autowired
	    public OpenTextController(OpenTextService otdsService) {
	        this.otdsService = otdsService;
	    }

	    @GetMapping("/user/{userId}")
	    public String getUserInfo(@PathVariable String userId) {
	        return otdsService.getUserInfo(userId);
	    }
}
