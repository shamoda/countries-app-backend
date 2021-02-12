package com.practicaltest.countriesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicaltest.countriesapp.model.Country;
import com.practicaltest.countriesapp.service.CountryService;

@RestController
@RequestMapping("/rest/v2")
public class CountryController {
	
	@Autowired
	private final CountryService countryService;

	public CountryController(CountryService countryService) {
		super();
		this.countryService = countryService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Country>> getAllCountries() {
		List<Country> countries = countryService.getAllCountries();
		return new ResponseEntity<>(countries, HttpStatus.OK);
	}
	
	@GetMapping("/country/{id}")
	public ResponseEntity<Country> getCountry(@PathVariable("id") Long id) {
		Country country = countryService.getCountry(id);
		return new ResponseEntity<>(country, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Country> addCountry(@RequestBody Country country) {
		Country createdCountry = countryService.addCountry(country);
		return new ResponseEntity<>(createdCountry, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Country> updateCountry(@RequestBody Country country) {
		Country updatedCountry = countryService.updateCountry(country);
		return new ResponseEntity<>(updatedCountry, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCountry(@PathVariable("id") Long id) {
		countryService.deleteCountry(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
