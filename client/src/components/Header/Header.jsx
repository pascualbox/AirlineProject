import React from "react";
import "./Header.scss";

function Header() {
  return (
    <div className="header">
      <div className="containerH">
        <div className="options">
          <h2>Home</h2>
        </div>
        <div className="options">
          <h2>Flys</h2>
        </div>
      </div>
    </div>
  );
}

export default Header;
