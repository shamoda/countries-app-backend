package com.practicaltest.countriesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicaltest.countriesapp.exception.CountryNotFoundException;
import com.practicaltest.countriesapp.model.Country;
import com.practicaltest.countriesapp.repository.CountryRepository;

@Service
public class CountryService {
	
	private final CountryRepository countryRepository;

	@Autowired
	public CountryService(CountryRepository countryRepository) {
		super();
		this.countryRepository = countryRepository;
	}
	
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}
	
	public Country getCountry(Long id) {
		return countryRepository.findById(id).orElseThrow(
				() -> new CountryNotFoundException("Country with id: "+id+" was not found!")
				);
	}
	
	public Country addCountry(Country country) {
		return countryRepository.save(country);
	}
	
	public Country updateCountry(Country country) {
		return countryRepository.save(country);
	}
	
	public void deleteCountry(Long id) {
		countryRepository.deleteById(id);
	}
	
	

}
