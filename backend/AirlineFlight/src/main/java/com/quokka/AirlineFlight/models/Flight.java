package com.quokka.AirlineFlight.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.quokka.AirlineFlight.exceptions.EmptyException;
import com.quokka.AirlineFlight.exceptions.WrongValueException;

@Document("flight")
public class Flight {
    @Id
    protected String id;
    @Field
    protected String name;
    @Field
    protected String airline;
    @Field
    protected Date departure;
    @Field
    protected int transiteMinutes;
    @Field
    protected int layovers;
    @Field
    protected int luggagesPrice;
    @Field
    protected int price;

    public Flight() {

    }

    public Flight(String id, String name, String airline, Date departure, int transiteMinutes, int layovers,
            int luggagesPrice,
            int price) throws EmptyException, Exception {
        setId(id);
        setName(name);
        setAirline(airline);
        setDeparture(departure);
        setTransiteMinutes(transiteMinutes);
        setLayovers(layovers);
        setLuggagesPrice(luggagesPrice);
        setPrice(price);
    }

    public boolean validate() throws EmptyException, WrongValueException {
        if (name.trim().equals("") || name == null) {
            throw new EmptyException("Name can't be empty");
        }
        if (airline.trim().equals("") || airline == null) {
            throw new EmptyException("Airline can't be empty");
        }
        if (transiteMinutes <= 0) {
            throw new WrongValueException("Transite minutes must be greater than 0");
        }
        if (layovers <= 0) {
            throw new WrongValueException("Layovers must be greater than 0");
        }
        if (luggagesPrice <= 0) {
            throw new WrongValueException("Luggages price must be greater than 0");
        }
        if (price <= 0) {
            throw new WrongValueException("Price must be greater than 0");
        }
        if (price < luggagesPrice) {
            throw new WrongValueException("Price can't be lower than luggages price");
        }

        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws EmptyException {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyException {

        this.name = name;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) throws EmptyException {

        this.airline = airline;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public int getTransiteMinutes() {
        return transiteMinutes;
    }

    public void setTransiteMinutes(int transiteMinutes) {
        this.transiteMinutes = transiteMinutes;
    }

    public int getLayovers() {
        return layovers;
    }

    public void setLayovers(int layovers) {
        this.layovers = layovers;
    }

    public int getLuggagesPrice() {
        return luggagesPrice;
    }

    public void setLuggagesPrice(int luggagesPrice) {
        this.luggagesPrice = luggagesPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{id: " + getId() + ",name: " + getName() + ", airline: " + getAirline() + ", departure: "
                + getDeparture()
                + ", transiteMinutes: "
                + getTransiteMinutes() + ", layovers: " + getLayovers() + ", luggagesPrice: " + getLuggagesPrice()
                + ", price: " + getPrice() + "}";
    }

}
