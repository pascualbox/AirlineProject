package com.quokka.AirlineFlight.repositories;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.quokka.AirlineFlight.models.Flight;

@Component
public interface CustomFlightRepository {

    List<Flight> findFiltered(HashMap<String, String> data);

}
