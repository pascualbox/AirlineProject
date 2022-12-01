import React from "react";
import "./Flight.scss";
import FlightCard from "../../components/FlightCard/FlightCard";

function Flight(props) {
  return (
    <div>
      <div className="tripContainer">
        <div className="titleFlight">Flights</div>
        <div className="flightCont">
          <FlightCard></FlightCard>
        </div>
      </div>
    </div>
  );
}

export default Flight;
