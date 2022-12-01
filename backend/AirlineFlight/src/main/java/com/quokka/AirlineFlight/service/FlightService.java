package com.quokka.AirlineFlight.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quokka.AirlineFlight.models.Flight;
import com.quokka.AirlineFlight.repositories.CustomFlightRepository;

@Component
public class FlightService {
    @Autowired
    CustomFlightRepository flightRepository;

    public void save(Flight flight) {
        flightRepository.save(flight);
    }

    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    public void deleteById(String id) {
        flightRepository.deleteById(id);
    }

    public List<Flight> findFiltered(HashMap<String, String> data) {
        return flightRepository.findFiltered(data);
    }

    public Flight findById(String id) {
        return flightRepository.findById(id);
    }

    // public void deleteById(String id) {
    // flightRepository.deleteById(id);
    // }

}