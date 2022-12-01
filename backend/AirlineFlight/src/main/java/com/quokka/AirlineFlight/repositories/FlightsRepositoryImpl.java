package com.quokka.AirlineFlight.repositories;

import com.quokka.AirlineFlight.models.Flight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class FlightsRepositoryImpl implements CustomFlightRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    //
    @Override
    public List<Flight> findFiltered(HashMap<String, String> data) {
        Query query = new Query();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            query.addCriteria(Criteria.where(entry.getKey()).regex(entry.getValue()));
        }
        System.out.println(query.toString());
        List<Flight> flights = mongoTemplate.find(query, Flight.class);
        System.out.println(flights.toString());
        return flights;
    }
}
