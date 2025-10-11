package com.weather.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.weather.app.dtos.WeatherResp;

import lombok.Data;
@Data
@Component
public class WeatherService {

	@Autowired
	RestTemplate restTemplate;
	
	
//	 private static final String apiKey="29500248a389e018fa06b79f09ac22ba";
//	 private static final String API="http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";
	 
	
//	public WeatherResp checkWeather(String city) {
//		
//		String finalApi = API.replace("CITY", city).replace("API_KEY",apiKey);
//		
//		 ResponseEntity<WeatherResp> response = restTemplate.exchange(finalApi, HttpMethod.GET, null, WeatherResp.class);
//		 WeatherResp body = response.getBody();
//		 return body;
//	}
	
//public WeatherResp checkWeather(String city) {
//		
////		String finalApi = API.replace("CITY", city).replace("API_KEY",apiKey);
//		String requestBody="/api/student/ft";
////		HttpEntity<String> httpEntity=new HttpEntity<>(requestBody);
//		 ResponseEntity<WeatherResp> response = restTemplate.exchange(requestBody,HttpMethod.GET, null, WeatherResp.class);
//		 WeatherResp body = response.getBody();
//		 return body;
//	}
}
