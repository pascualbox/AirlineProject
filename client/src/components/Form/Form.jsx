import React, { useState } from "react";
import "./Form.scss";

function Form() {
  const or1 = "Madrid";
  const or2 = "Seville";
  const or3 = "Barcelona";
  const or4 = "Lugo";
  const or5 = "Andorra";

  return (
    <div className="containerForm">
      <div className="columns">
        <div className="colLeft">
          <div className="origin">
            <div className="originTitle">Origin:</div>
            <div className="divSelect">
              <select name="origin" title="origin" className="select">
                <option value="empty"></option>
                <option value={or1}>{or1}</option>
                <option value={or2}>{or2}</option>
                <option value={or3}>{or3}</option>
                <option value={or4}>{or4}</option>
                <option value={or5}>{or5}</option>
              </select>
            </div>
          </div>
          <div className="destination">
            <div className="originTitle">Destination:</div>
            <div className="divSelect">
              <select name="origin" title="origin" className="select">
                <option value="empty"></option>
                <option value={or1}>{or1}</option>
                <option value={or2}>{or2}</option>
                <option value={or3}>{or3}</option>
                <option value={or4}>{or4}</option>
                <option value={or5}>{or5}</option>
              </select>
            </div>
          </div>
        </div>
        <div className="colRight">
          <div className="oneTwo">
            <div className="originTitle">Type:</div>
            <div className="formType">
              <input class="" type="radio" name="type" value="oneWay" />
              <label>One Way</label>
              <input
                class="inputFirst"
                type="radio"
                name="type"
                value="roundTrip"
              />
              <label>Round Trip</label>
            </div>
          </div>
          <div className="date">
            <div></div>
            <div>8</div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Form;
