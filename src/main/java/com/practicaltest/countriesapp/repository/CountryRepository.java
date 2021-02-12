package com.practicaltest.countriesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicaltest.countriesapp.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
