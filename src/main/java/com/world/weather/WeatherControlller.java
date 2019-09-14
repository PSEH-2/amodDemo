package com.world.weather;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.world.weather.thirdpartservice.OpenWeatherMap;
import com.world.weather.thirdpartservice.WeatherDataHandler;

@RestController
@RequestMapping("/api/latest")
public class WeatherControlller {
	@RequestMapping("/status")
	public String status() {
		return "Weather forcast working fine!";
	}
	

	@RequestMapping("/today/forcast")
	public String forcast() throws IOException {
		WeatherDataHandler weatherMap = new WeatherDataHandler();
		return weatherMap.getForcast();
	}
}
