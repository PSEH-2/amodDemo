package data;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
	Location location;
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	List<WeatherForcast> weatherForcast; 
	
	public WeatherData() {
		location = new Location();
		weatherForcast = new ArrayList<WeatherForcast>();
	}
	
	
	
	
	
}
