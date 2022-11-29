import React from "react";
import Home from "../../pages/Home/Home";
import "./Body.scss";
import { Routes, Route } from "react-router-dom";

function Body() {
  return (
    <div className="body">
      <div className="container">
        {/* <Routes>
          <Route path="" element={<Home />} exact></Route>
          <Route path="*" element={<Home />} exact></Route>
        </Routes> */}
        <Home />
      </div>
    </div>
  );
}

export default Body;
