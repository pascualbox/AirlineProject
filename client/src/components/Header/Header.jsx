import React from "react";
import "./Header.scss";
import logo from "../../assets/Logo/quokkair.png";
function Header() {
  return (
    <div className="header">
      <div className="containerH">
        <img src={logo} alt="Quokkair" className="optionsLogo" />
        <div className="options">
          <h2>Flys</h2>
        </div>
      </div>
    </div>
  );
}

export default Header;
