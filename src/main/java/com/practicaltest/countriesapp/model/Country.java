package com.practicaltest.countriesapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String president;
	private String capital;
	
	public Country() {
		super();
	}

	public Country(Long id, String name, String president, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.president = president;
		this.capital = capital;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", president=" + president + ", capital=" + capital + "]";
	}
	
	

}
