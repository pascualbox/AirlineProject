package com.quokka.AirlineFlight.controllers;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< Updated upstream
=======
import com.quokka.AirlineFlight.exceptions.EmptyException;
import com.quokka.AirlineFlight.exceptions.InvalidDataException;
import com.quokka.AirlineFlight.exceptions.WrongValueException;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
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
=======
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

    @GetMapping("/")
    public HttpResponse findbyId(@RequestParam(required = false) String airline,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer transiteMinutes, @RequestParam(required = false) Integer price) {
        try {
            HashMap<String, String> filters = new HashMap<String, String>();
            if (airline != null) {
                filters.put("airline", "^" + airline + "$");
                System.out.println(airline);
            }
            if (name != null) {
                filters.put("name", "^" + name + "$");
                System.out.println(name);
            }

            if (transiteMinutes != null) {
                filters.put("transiteMinutes", "" + transiteMinutes);
                System.out.println(transiteMinutes);
            }

            if (price != null) {
                filters.put("price", "" + price);
                System.out.println(price);
            }
            List<Flight> data = flightService.findFiltered(filters);
            return new HttpResponse(data.toString(), "Flight found", true);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception: " + e.getMessage());
            return new HttpResponse("", "Flight not found", false);
        }

    }

    @PostMapping()
    public HttpResponse save(@RequestBody Flight flight) throws EmptyException {
        try {
            flight.validate();
            flightService.findById(flight.getId()).get();
            return new HttpResponse("", "Flight already exists", false);
        } catch (EmptyException e) {
            return new HttpResponse("", e.getMessage(), false);
        } catch (WrongValueException e) {
            return new HttpResponse("", e.getMessage(), false);
        } catch (InvalidDataException e) {
            return new HttpResponse("", e.getMessage(), false);
        } catch (Exception e) {
            // TODO: handle exception
            flight.setId(null);
            // flightService.save(flight);
            return new HttpResponse("", "Flight saved", true);
        }
    }

    // @PutMapping("/{id}")
    // public HttpResponse update(@PathVariable String id, @RequestBody Flight
    // flight) {
    // try {
    // flightService.findById(id).get();
    // flightService.save(flight);
    // return new HttpResponse("", "Flight saved", true);
    // } catch (Exception e) {
    // // TODO: handle exception
    // return new HttpResponse("", "Flight doesn't exists", false);
    // }
    // }

    // @DeleteMapping("/{id}")
    // public HttpResponse deleteById(@PathVariable String id) {
    // try {
    // flightService.findById(id).get();
    // flightService.deleteById(id);
    // return new HttpResponse("", "Flight deleted", true);
    // } catch (Exception e) {
    // return new HttpResponse("", "Flight doesn't exist", false);
    // // TODO: handle exception
    // }
    // }
>>>>>>> Stashed changes
}
