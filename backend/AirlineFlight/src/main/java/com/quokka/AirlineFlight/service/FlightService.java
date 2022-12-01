package com.quokka.AirlineFlight.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quokka.AirlineFlight.models.Flight;
import com.quokka.AirlineFlight.repositories.CustomFlightRepository;
import com.quokka.AirlineFlight.repositories.FlightsRepository;

@Component
public class FlightService {
    @Autowired
    CustomFlightRepository flightRepository;
    FlightsRepository flightsRepository;

    public void save(Flight flight) {
        flightsRepository.save(flight);
    }

    public List<Flight> findAll() {
        return flightsRepository.findAll();
    }

    public void deleteById(String id) {
        flightsRepository.deleteById(id);
    }

    public List<Flight> findFiltered(HashMap<String, String> data) {
        return flightRepository.findFiltered(data);
    }

    public Optional<Flight> findById(String id) {
        System.out.println(id);
        return flightsRepository.findById(id);
    }

    // public void deleteById(String id) {
    // flightRepository.deleteById(id);
    // }

}