package com.learning.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenTextService {
	
    private final String otdsBaseUrl = "https://api.opentext.com/otdsws/rest"; // Replace with actual OTDS URL

    private final RestTemplate restTemplate;

    @Autowired
    public OpenTextService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getUserInfo(String profileName) {
        String apiUrl = otdsBaseUrl + "/identityproviderprofiles/" + profileName;
        // Implement authentication logic here if required
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
