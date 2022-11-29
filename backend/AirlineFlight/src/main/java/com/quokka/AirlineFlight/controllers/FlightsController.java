package com.quokka.AirlineFlight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quokka.AirlineFlight.models.Flight;
import com.quokka.AirlineFlight.models.HttpResponse;
import com.quokka.AirlineFlight.service.FlightService;

@RestController
@RequestMapping("/api/flight")
public class FlightsController {
    @Autowired
    private FlightService flightService;

    @GetMapping()
    public HttpResponse getFlights() {
        String data = flightService.findAll().toString();
        if (data != null)
            return new HttpResponse(data, "Flights received", true);
        else
            return new HttpResponse(data, "Error, no data to receive", false);
    }

    @GetMapping("/{id}")
    public Flight findbyId(@PathVariable String id) {
        return flightService.findById(id).get();
    }

    @PostMapping()
    public void save(@RequestBody Flight flight) {
        flightService.save(flight);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody Flight flight) {
        flightService.save(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        flightService.deleteById(id);
    }
}
