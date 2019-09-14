package com.world.weather.thirdpartservice;

import java.io.IOException;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OpenWeatherMap {
	private String URL = "https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22";

	private static ObjectMapper objMapper = new ObjectMapper();
	public String getForcast() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL, String.class);
		return result;
	}
}
