package com.quokka.AirlineFlight.models;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

<<<<<<< Updated upstream
=======
import com.quokka.AirlineFlight.exceptions.EmptyException;
import com.quokka.AirlineFlight.exceptions.InvalidDataException;
import com.quokka.AirlineFlight.exceptions.WrongValueException;

>>>>>>> Stashed changes
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
    protected Date returnDate;
    @Field
    protected int transiteMinutes;
    @Field
    protected int layovers;
    @Field
    protected int luggagesPrice;
    @Field
    protected int price;
    @Field
    protected boolean hasReturn;

    public Flight() {

    }

    public Flight(String id, String name, String airline, Date departure, Date returnDate, int transiteMinutes,
            int layovers,
            int luggagesPrice,
<<<<<<< Updated upstream
            int price) {
=======
            int price, boolean hasReturn) throws EmptyException, Exception {
>>>>>>> Stashed changes
        setId(id);
        setName(name);
        setAirline(airline);
        setDeparture(departure);
        setReturnDate(returnDate);
        setTransiteMinutes(transiteMinutes);
        setLayovers(layovers);
        setLuggagesPrice(luggagesPrice);
        setPrice(price);
    }

<<<<<<< Updated upstream
=======
    public boolean validate() throws EmptyException, WrongValueException, InvalidDataException {
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
        if (!isHasReturn() && getReturnDate() != null) {
            throw new InvalidDataException("You selected no return, so you can't select a return date");
        }
        if (getReturnDate().before(getDeparture())) {
            throw new InvalidDataException("You can't return before leaving, unless you have a time machine");
        }
        long diffInMillies = Math.abs(getDeparture().getTime() - getReturnDate().getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        if (diff != 3) {
            throw new InvalidDataException("The difference between departure and return must be of 3 days");
        }

        return true;
    }

>>>>>>> Stashed changes
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
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

    public boolean isHasReturn() {
        return hasReturn;
    }

    public void setHasReturn(boolean hasReturn) {
        this.hasReturn = hasReturn;
    }

    @Override
    public String toString() {
        return "{id: " + getId() + ",name: " + getName() + ", airline: " + getAirline() + ", departure: "
                + getDeparture() + ", returnDate: "
                + getReturnDate()
                + ", transiteMinutes: "
                + getTransiteMinutes() + ", layovers: " + getLayovers() + ", luggagesPrice: " + getLuggagesPrice()
                + ", price: " + getPrice() + ", hasRetrun: " + isHasReturn() + "}";
    }

}
