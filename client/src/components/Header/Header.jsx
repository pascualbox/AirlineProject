import React from "react";
import "./Header.scss";
import logo from "../../assets/Logo/quokkair.png";
import { Link } from "@mui/material";
function Header() {
  return (
    <div className="header">
      <div className="containerH">
        <img src={logo} alt="Quokkair" className="optionsLogo" />
        <div className="options">
          <Link href="">
            <h2>Flys</h2>
          </Link>
          <Link href="">
            <h2>User</h2>
          </Link>
          <Link href="">
            <h2>Flights</h2>
          </Link>
          <Link href="">
            <h2>Log Out</h2>
          </Link>
        </div>
      </div>
    </div>
  );
}

export default Header;
