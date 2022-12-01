import React from "react";
import "./Book.scss";
import Button from "@mui/material/Button";
import logo from "../../assets/Logo/qoukkaStamp.png";
import { Link } from "@mui/material";

function Book() {
  return (
    <div className="containerBook">
      <div className="message">
        <h2 className="h2">YOU HAVE BOOKED A FLIGHT</h2>
        <p>Your flight has been booked. Thank you for using our services.</p>
        <p>Hope we see you soon.</p>
        <p>Have a nice day.</p>
        <div className="return">
          <div className="btnHome">
            <Link href="/">
              <Button variant="contained">Home</Button>
            </Link>
          </div>

          <img src={logo} alt="Quokka Airlines" className="image" />
        </div>
      </div>
    </div>
  );
}

export default Book;
