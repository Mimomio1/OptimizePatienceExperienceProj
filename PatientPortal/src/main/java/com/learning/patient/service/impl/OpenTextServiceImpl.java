//package com.learning.patient.service.impl;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
//
//
//@Service
//public class OpenTextServiceImpl implements OpenTextService {
//
//	String baseUrl = "";
//	
//	StringBuilder stringBuilder = new StringBuilder(baseUrl);
//	
//	String POST = "/posts";
//	
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@Override
//	public List<Map<String, Object>> getPosts() {
//		HttpEntity<Void> httpEntity = new HttpEntity<>(gethttpHeaders());
//		String url = stringBuilder.append(POST).toString();
//		val response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, List.class);
//		return response.getBody();
//	}
//	
//	private HttpHeaders gethttpHeaders() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		return headers;
//	}
//	
//	
//}	
