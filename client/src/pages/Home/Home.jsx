import React from "react";
import "./Home.scss";
import Form from "../../components/Form/Form";
import { Routes, Route } from "react-router-dom";
import Calendar from "../../components/Form/Calendar";

function Home() {
  return (
    <div className="containerHome">
      <Form />
    </div>
  );
}

export default Home;
