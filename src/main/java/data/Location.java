package data;

public class Location {
	private String city;
	private String country;
	private double logitude;
	private double latitude;
	public Location() {}
	public Location(String city, String country, double logitude,double latitude) {
		this.city=city;
		this.country = country;
		this.logitude = logitude;
		this.latitude = latitude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getLogitude() {
		return logitude;
	}
	public void setLogitude(double logitude) {
		this.logitude = logitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
}
