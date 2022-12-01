import React, { useState } from "react";
import planeLogo from "../../assets/Background/plane.png";
import Box from "@mui/material/Box";
import InputLabel from "@mui/material/InputLabel";
import MenuItem from "@mui/material/MenuItem";
import FormControl from "@mui/material/FormControl";
import Select from "@mui/material/Select";
import "./Form.scss";
import "react-calendar/dist/Calendar.css";
import Calendar from "./Calendar";
import Stack from "@mui/material/Stack";
import Button from "@mui/material/Button";
import Selecter from "../Selecter/Selecter";

function Form() {
  let res = "";
  const orgn = ["Madrid", "Sevilla", "Barcelona", "Lugo", "Canarias"];
  const dest = ["USA", "Peru", "Canada", "Italy", "Germany", "France"];
  const [origin, setOrigin] = React.useState("");
  const [destination, setDestination] = React.useState("");
  const [type, setType] = React.useState("");

  const handleOrigin = (event) => {
    setOrigin(event.target.value);
  };
  const handleDestination = (event) => {
    setDestination(event.target.value);
  };

  const handleType = (event) => {
    setType(event.target.value);
  };

  if (type != "round") {
    res = "colRight hidden";
  } else {
    res = "colRight";
  }

  return (
    <div className="containerForm">
      <div className="columns">
        <div className="colLeft">
          <div className="origin">
            <div className="title">Origin:</div>
            <div className="divSelect">
              <Box sx={{ minWidth: 200 }}>
                <FormControl fullWidth>
                  <InputLabel id="demo-simple-select-label">Origin</InputLabel>
                  <Select
                    labelId="demo-simple-select-label"
                    id="demo-simple-select"
                    value={origin}
                    label="Origin"
                    onChange={handleOrigin}
                  >
                    <MenuItem value="Madrid">Madrid</MenuItem>
                    <MenuItem value="Sevilla">Sevilla</MenuItem>
                    <MenuItem value="Barcelona">Barcelona</MenuItem>
                    <MenuItem value="Lugo">Lugo</MenuItem>
                    <MenuItem value="Canarias">Gran Canarias</MenuItem>
                  </Select>
                </FormControl>
              </Box>
            </div>
          </div>
          <div className="destination">
            <div className="title">Destination:</div>
            <div className="divSelect">
              <Selecter
                array={dest}
                origin={origin}
                name={"Destin."}
              ></Selecter>
            </div>
          </div>
          <div className="oneTwo">
            <div className="title">Type:</div>
            <div className="formType">
              <Box sx={{ minWidth: 200 }}>
                <FormControl fullWidth>
                  <InputLabel id="demo-simple-select-label">Type</InputLabel>
                  <Select
                    labelId="demo-simple-select-label"
                    id="demo-simple-select"
                    value={type}
                    label="OWRT"
                    onChange={handleType}
                  >
                    <MenuItem value="oneWay">One Way</MenuItem>
                    <MenuItem value="round">Round Trip</MenuItem>
                  </Select>
                </FormControl>
              </Box>
            </div>
          </div>
        </div>
        <div>
          <div className="colRight">
            <div className="title">Departure:</div>
            <Calendar />
          </div>
          <img src={planeLogo} alt="Plane Logo" className="plane" />
        </div>
        <div className={res}>
          <div className="title">Return:</div>
          <Calendar />
        </div>
      </div>
      <div className="btnDiv">
        <Button variant="contained" className="btn">
          Search
        </Button>
      </div>
    </div>
  );
}

export default Form;
