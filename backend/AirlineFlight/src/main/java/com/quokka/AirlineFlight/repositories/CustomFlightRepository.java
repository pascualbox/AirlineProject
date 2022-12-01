package com.quokka.AirlineFlight.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.quokka.AirlineFlight.models.Flight;

@Component
public interface CustomFlightRepository {

    List<Flight> findFiltered(HashMap<String, String> data);

    List<Flight> findAll();

    void save(Flight flight);

    void deleteById(String id);

    Flight findById(String id);

}
