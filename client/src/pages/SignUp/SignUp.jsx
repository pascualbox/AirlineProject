import React from "react";
import "./SignUp.scss";
import img from "../../assets/Logo/quokkair.png";
import FormSignUp from "../../components/FormSignUp/FormSignUp";

function SignUp(props) {
  props.setUseHeader(false);
  return (
    <div className="mainDiv">
      <div className="secondDiv">
        <img src={img} width="180px" alt="logo" className="imageSU"></img>
        <h1>Sign up</h1>
        <FormSignUp />
      </div>
    </div>
  );
}

export default SignUp;
