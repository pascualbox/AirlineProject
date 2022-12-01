import React, { useState } from "react";
import Box from "@mui/material/Box";
import InputLabel from "@mui/material/InputLabel";
import MenuItem from "@mui/material/MenuItem";
import FormControl from "@mui/material/FormControl";
import Select from "@mui/material/Select";
import "../Form/Form";
import "react-calendar/dist/Calendar.css";

function Selecter(props) {
  return props.origin ? (
    <div>
      <Box sx={{ minWidth: 200 }}>
        <FormControl fullWidth>
          <InputLabel id="demo-simple-select-label">{props.name}</InputLabel>
          <Select
            labelId="demo-simple-select-label"
            id="demo-simple-select"
            value={origin}
            label="Origin"
            onChange={props.handleChange}
          >
            {props.array.map((element) => (
              <MenuItem value={element}>{element}</MenuItem>
            ))}
          </Select>
        </FormControl>
      </Box>
    </div>
  ) : (
    <div>
      <Box sx={{ minWidth: 200 }}>
        <FormControl fullWidth>
          <InputLabel id="demo-simple-select-label">{props.name}</InputLabel>
          <Select
            labelId="demo-simple-select-label"
            id="demo-simple-select"
            value={origin}
            label="Origin"
            onChange={props.handleChange}
          >
            <MenuItem value="empty"></MenuItem>
          </Select>
        </FormControl>
      </Box>
    </div>
  );
}

export default Selecter;
