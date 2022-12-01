import Home from "../../pages/Home/Home";
import "./Body.scss";
import { Routes, Route } from "react-router-dom";
import Book from "../../pages/Book/Book";
import React, { useState } from "react";
import { BrowserRouter, useRoutes } from "react-router-dom";
import NotFound from "../../pages/NotFound/NotFound";
import User from "../../pages/User/User";
import SignUp from "../../pages/SignUp/SignUp";
import LogIn from "../../pages/LogIn/LogIn";

function Body(props) {
  const body = "";
  const App = () => {
    let routes = useRoutes([
      { path: "/", element: <LogIn setUseHeader={props.setUseHeader} /> },
      { path: "/login", element: <LogIn setUseHeader={props.setUseHeader} /> },
      {
        path: "/signup",
        element: <SignUp setUseHeader={props.setUseHeader} />,
      },
      {
        path: "/home",
        element: <Home setUseHeader={props.setUseHeader} />,
      },
      {
        path: "/user",
        element: <User setUseHeader={props.setUseHeader} />,
      },
      // {
      //   path: "/trips",
      //   element: <MyTrips />,
      // },
      // {
      //   path: "/tickets",
      //   element: <BuyTickets />,
      // },
      // {
      //   path: "/settings",
      //   element: <Settings />,
      // },
      { path: "/booked", element: <Book setUseHeader={props.setUseHeader} /> },
      { path: "*", element: <NotFound setUseHeader={props.setUseHeader} /> },
    ]);
    return routes;
  };
  if (props.useHeader) {
    return (
      <div className="body">
        <div className="container">
          <BrowserRouter>
            <App />
          </BrowserRouter>

          {/* <Book></Book> */}
          {/* <Home /> */}
        </div>
      </div>
    );
  } else {
    return (
      <div className="bodyT">
        <div>
          <BrowserRouter>
            <App />
          </BrowserRouter>

          {/* <Book></Book> */}
          {/* <Home /> */}
        </div>
      </div>
    );
  }

  return (
    <div className={body}>
      <div className="container">
        <BrowserRouter>
          <App />
        </BrowserRouter>

        {/* <Book></Book> */}
        {/* <Home /> */}
      </div>
    </div>
  );
}

export default Body;
