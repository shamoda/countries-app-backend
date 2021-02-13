package com.practicaltest.countriesapp.exception;

public class CountryNotFoundException extends RuntimeException {

	public CountryNotFoundException(String message) {
		super(message);										// parsing custom exception message to the super class
	}
	
}
