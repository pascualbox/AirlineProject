import React from "react";
import "./FormSignUp.scss";
import InputForm from "../InputForm/InputForm";
import { Link } from "@mui/material";

function FormSignUp() {
  return (
    <form className="mainForm">
      <InputForm type="text" name="First name *"></InputForm>
      <InputForm type="text" name="Last name *"></InputForm>
      <InputForm type="text" name="Username *"></InputForm>
      <InputForm type="password" name="Password *"></InputForm>
      <InputForm type="password" name="Confirm Password *"></InputForm>
      <input className="submitBtn" type="submit" value="Sign up" />
      <div className="logIn">
        <div className="textLI">In case you already have an account: </div>
        <Link href="/">Log In</Link>
      </div>
    </form>
  );
}

export default FormSignUp;
