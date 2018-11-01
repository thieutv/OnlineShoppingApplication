package com.anjawanj.account.model;

public class Address {

	private String building;
	private String area;
	private String landmark;
	private String city;
	private String state;
	private String postalCode;
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	public Address(String building, String area, String landmark, String city, String state, String postalCode) {
		super();
		this.building = building;
		this.area = area;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [building=" + building + ", area=" + area + ", landmark=" + landmark + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + "]";
	}
	
	
}
