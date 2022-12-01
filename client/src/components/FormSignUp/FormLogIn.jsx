import React from "react";
import "./FormSignUp";
import InputForm from "../InputForm/InputForm";

function FormLogIn() {
  return (
    <div>
      <InputForm type="text" name="Username *"></InputForm>
      <InputForm type="password" name="Password *"></InputForm>
      <input className="submitBtn" type="submit" value="Sign in" />
    </div>
  );
}

export default FormLogIn;
