package com.udayanga.hello.udayanga;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;



@ManagedBean
public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private String country;
	private String language;
	List<String> countryOptions;
	private String[] otherLanguages;
	
	public Student() {
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Sri Lanka");
		countryOptions.add("India");
		countryOptions.add("Japan");
		countryOptions.add("Australia");
		
		firstName="Udayanga";
		lastName="Senanayake";
		language="Java";
		
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getOtherLanguages() {
		return otherLanguages;
	}

	public void setOtherLanguages(String[] otherLanguages) {
		this.otherLanguages = otherLanguages;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
