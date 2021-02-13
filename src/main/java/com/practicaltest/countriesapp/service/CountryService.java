package com.practicaltest.countriesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicaltest.countriesapp.exception.CountryNotFoundException;
import com.practicaltest.countriesapp.model.Country;
import com.practicaltest.countriesapp.repository.CountryRepository;

@Service
public class CountryService {
	
	private final CountryRepository countryRepository;											// class variables

	@Autowired
	public CountryService(CountryRepository countryRepository) {								// initializing and dependency injection
		super();
		this.countryRepository = countryRepository;
	}
	
	public List<Country> getAllCountries() {													
		return countryRepository.findAll();														// fetch all country data using JPA built in method
	}
	
	public Country getCountry(Long id) {														// actually haven't used this method in this project
		return countryRepository.findById(id).orElseThrow(										// fetch specific country data using JPA built in function
				() -> new CountryNotFoundException("Country with id: "+id+" was not found!")	// throwing an custom exception if country is not found
				);
	}
	
	public Country addCountry(Country country) {
		return countryRepository.save(country);													// insert new record to the database using JPA .save method. here we do not parse an id. hibernate will automatically do it
	}
	
	public Country updateCountry(Country country) {
		return countryRepository.save(country);													// update existing record. here we need to parse country object with existing id otherwise it will added as a new record 
	}
	
	public void deleteCountry(Long id) {
		countryRepository.deleteById(id);														// delete existing record
	}
	
	

}
