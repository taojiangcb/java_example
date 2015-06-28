package com.taojiang.valueObject;

public class Address {
	public String city;
	public String street;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
