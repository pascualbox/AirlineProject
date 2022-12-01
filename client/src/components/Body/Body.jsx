import Home from "../../pages/Home/Home";
import "./Body.scss";
import { Routes, Route } from "react-router-dom";
import Book from "../../pages/Book/Book";
import React, { useState } from "react";
import { BrowserRouter, useRoutes } from "react-router-dom";
import NotFound from "../../pages/NotFound/NotFound";
import User from "../../pages/User/User";

function Body() {
  const App = () => {
    let routes = useRoutes([
      /* { path: "/", element: <Login /> },
      { path: "/login", element: <Login /> }, */
      {
        path: "/",
        element: <Home />,
      },
      {
        path: "/user",
        element: <User />,
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
      { path: "/booked", element: <Book /> },
      { path: "*", element: <NotFound /> },
    ]);
    return routes;
  };
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
}

export default Body;
