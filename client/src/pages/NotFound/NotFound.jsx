import React from "react";
import "./NotFound.scss";
import waldo from "../../assets/Image/waldo.png";

function NotFound() {
  return (
    <div>
      <div className="textNF">
        <h2>Not Found</h2>
      </div>
      <div className="waldo">
        <img src={waldo} alt="Not found the page, but you found me" />
      </div>
    </div>
  );
}

export default NotFound;
