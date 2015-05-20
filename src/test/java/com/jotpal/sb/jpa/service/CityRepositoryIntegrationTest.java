package com.jotpal.sb.jpa.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jotpal.sb.jpa.SampleDataJpaApplication;
import com.jotpal.sb.jpa.domain.City;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataJpaApplication.class)
public class CityRepositoryIntegrationTest {

    @Autowired
	CityRepository repository;

	@Test
	public void findCityInCountry() {
		String city = "London";
		String country = "UK";
		
		City result = this.repository.findByNameAndCountryAllIgnoringCase(city, country);
		assertNotNull("Unable to find city [" + city + "] in country [" + country + "]", result);
	}

    
}
