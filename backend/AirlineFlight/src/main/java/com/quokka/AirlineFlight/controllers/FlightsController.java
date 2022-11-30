package com.quokka.AirlineFlight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quokka.AirlineFlight.exceptions.EmptyException;
import com.quokka.AirlineFlight.exceptions.WrongValueException;
import com.quokka.AirlineFlight.models.Flight;
import com.quokka.AirlineFlight.models.HttpResponse;
import com.quokka.AirlineFlight.service.FlightService;

@RestController
@RequestMapping("/api/flight")
public class FlightsController {
    @Autowired
    private FlightService flightService;

    @GetMapping()
    public HttpResponse getUsers() {
        try {
            List<Flight> data = flightService.findAll();
            if (data.toString() == null || data.toString() == "[]")
                return new HttpResponse("", "No flights found", false);
            else
                return new HttpResponse(data.toString(), "Flights found", true);

        } catch (Exception e) {
            return new HttpResponse("", "No flights found", false);
            // TODO: handle exception
        }

    }

    @GetMapping("/{id}")
    public HttpResponse findbyId(@PathVariable String id) {
        try {
            Flight data = flightService.findById(id).get();
            return new HttpResponse(data.toString(), "Flight found", true);
        } catch (Exception e) {
            // TODO: handle exception
            return new HttpResponse("", "Flight not found", false);
        }

    }

    @PostMapping()
    public HttpResponse save(@RequestBody Flight flight) {
        try {
            System.out.println(flight);
            flight.validate();
            flightService.findById(flight.getId()).get();
            return new HttpResponse("", "Flight already exists", false);
        } catch (EmptyException e) {
            return new HttpResponse("", e.getMessage(), false);
        } catch (WrongValueException e) {
            return new HttpResponse("", e.getMessage(), false);
        } catch (Exception e) {
            // TODO: handle exception
            flightService.save(flight);
            return new HttpResponse("", "Flight saved", true);
        }
    }

    @PutMapping("/{id}")
    public HttpResponse update(@PathVariable String id, @RequestBody Flight flight) {
        try {
            flightService.findById(id).get();
            flightService.save(flight);
            return new HttpResponse("", "Flight saved", true);
        } catch (Exception e) {
            // TODO: handle exception
            return new HttpResponse("", "Flight doesn't exists", false);
        }
    }

    @DeleteMapping("/{id}")
    public HttpResponse deleteById(@PathVariable String id) {
        try {
            flightService.findById(id).get();
            flightService.deleteById(id);
            return new HttpResponse("", "Flight deleted", true);
        } catch (Exception e) {
            return new HttpResponse("", "Flight doesn't exist", false);
            // TODO: handle exception
        }
    }
}
