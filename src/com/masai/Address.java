package com.masai;

import java.util.Scanner;

public class Address {


private String landmark;
private String street;
private String city;
private String state;
private String pincode;



public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
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
public String getPin() {
	return pincode;
}
public void setPin( String pincode) {
	this.pincode = pincode;
}
public Address() {
	
}
public Address(String buildingName, String landmark, String street, String city, String state,
		String pincode) {
	
	super();
	
	
	this.landmark = landmark;
	this.street = street;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	
}


public String toString() {
	return this.landmark+","+this.street+","+this.city+","+this.state+","+this.pincode;
}
public void addressEntry() {
	Scanner dp=new Scanner(System.in);


	System.out.println("Enter Landmark");
	this.landmark=dp.nextLine();
	System.out.println("Enter Street Name");
	this.street=dp.nextLine();
	System.out.println("Enter City 	Name");
	this.city=dp.nextLine();
	System.out.println("Enter State Name");
	this.state=dp.nextLine();
	System.out.println("Enter Pincode");
	this.pincode=dp.nextLine();

	
}
	
}

