package com.quokka.AirlineFlight.repositories;

import com.quokka.AirlineFlight.models.Flight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @Override
    public void save(Flight flight) {
        // TODO Auto-generated method stub
        mongoTemplate.save(flight);

    }

    @Override
    public List<Flight> findAll() {
        // TODO Auto-generated method stub
        return mongoTemplate.findAll(Flight.class);
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        mongoTemplate.remove(mongoTemplate.findById(id, Flight.class));
    }

    @Override
    public Flight findById(String id) {
        // TODO Auto-generated method stub
        return mongoTemplate.findById(id, Flight.class);
    }
}
