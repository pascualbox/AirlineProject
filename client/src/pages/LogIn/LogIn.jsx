import React from "react";
import "./LogIn.scss";
import InputForm from "../../components/InputForm/InputForm";
import img from "../../assets/Logo/quokkair.png";
import FormLogIn from "../../components/FormSignUp/FormLogIn";

function LogIn(props) {
  props.setUseHeader(false);
  return (
    <div className="mainDiv">
      <div className="secondDiv">
        <img src={img} width="180px" alt="logo" className="imageSU"></img>
        <h1>Log in</h1>
        <FormLogIn />
      </div>
    </div>
  );
}

export default LogIn;
