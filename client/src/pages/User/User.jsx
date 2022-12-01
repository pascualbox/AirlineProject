import React from "react";
import "./User.scss";

function User(props) {
  props.setUseHeader(true);
  const name = "Arturo del Hierro";
  return (
    <div className="precontainer">
      <div className="containerUser">
        <div className="inContainer">
          <div className="label">Name: </div>
          <div className="inbox">{name}</div>
        </div>
        <div className="inContainer">
          <label className="label">Nationality: </label>
          <div className="inbox">{name}</div>
        </div>
        <div className="inContainer">
          <label className="label">NIF/Passport: </label>
          <div className="inbox">{name}</div>
        </div>
        <div className="inContainer">
          <label className="label">Age: </label>
          <div className="inbox">{name}</div>
        </div>
      </div>
    </div>
  );
}

export default User;
