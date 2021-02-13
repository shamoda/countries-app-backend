package com.practicaltest.countriesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/rest/v2")															// base api url
@CrossOrigin(origins = "http://localhost:4200")										// allowing http://localhost:4200 to access to the backend
public class CountryController {
	
	@Autowired
	private final CountryService countryService;									// dependancy injection

	public CountryController(CountryService countryService) {						// initializing class variables
		super();
		this.countryService = countryService;
	}
	
	@GetMapping("/all")																//get all countries
	public ResponseEntity<List<Country>> getAllCountries() {
		List<Country> countries = countryService.getAllCountries();					// calling service class method and assign returned data in to a variable
		return new ResponseEntity<>(countries, HttpStatus.OK);
	}
	
	@GetMapping("/country/{id}")													// get a specific country
	public ResponseEntity<Country> getCountry(@PathVariable("id") Long id) {
		Country country = countryService.getCountry(id);							// calling service class method and assign returned data in to a variable
		return new ResponseEntity<>(country, HttpStatus.OK);
	}
	
	@PostMapping("/add")															// insert a new record
	public ResponseEntity<Country> addCountry(@RequestBody Country country) {
		Country createdCountry = countryService.addCountry(country);				// calling service class method and assign returned data in to a variable
		return new ResponseEntity<>(createdCountry, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")															// update existing record
	public ResponseEntity<Country> updateCountry(@RequestBody Country country) {
		Country updatedCountry = countryService.updateCountry(country);				// calling service class method and assign returned data in to a variable
		return new ResponseEntity<>(updatedCountry, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")													// delete country record
	public ResponseEntity<?> deleteCountry(@PathVariable("id") Long id) {
		countryService.deleteCountry(id);											// calling service class method and assign returned data in to a variable
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
