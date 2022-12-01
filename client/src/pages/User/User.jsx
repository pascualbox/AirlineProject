import React from "react";
import "./User.scss";

function User(props) {
  props.setUseHeader(true);
  const name = "Arturo del Hierro";
  return (
    <div className="precontainer">
      <div className="containerUser">
        <div className="inContainer">
          <div className="labelUser">Name: </div>
          <div className="inbox">{name}</div>
        </div>
        <div className="inContainer">
          <div className="labelUser">Nationality: </div>
          <div className="inbox">{name}</div>
        </div>
        <div className="inContainer">
          <div className="labelUser">NIF/Passport: </div>
          <div className="inbox">{name}</div>
        </div>
        <div className="inContainer">
          <div className="labelUser">Age: </div>
          <div className="inbox">{name}</div>
        </div>
      </div>
    </div>
  );
}

export default User;
