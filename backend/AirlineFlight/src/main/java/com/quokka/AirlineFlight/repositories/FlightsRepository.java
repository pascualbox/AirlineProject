package com.quokka.AirlineFlight.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.quokka.AirlineFlight.models.Flight;

public interface FlightsRepository extends MongoRepository<Flight, String> {
}
