package com.quokka.AirlineFlight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.quokka.AirlineFlight.repositories.FlightsRepository;

@EnableMongoRepositories({ "path.to.repos" })
@SpringBootApplication
public class AirlineFlightApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AirlineFlightApplication.class, args);
	}

	@Autowired
	FlightsRepository flightsRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
