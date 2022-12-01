import Body from "./components/Body/Body";
import Header from "./components/Header/Header";
import { useState } from "react";

function App() {
  const [useHeader, setUseHeader] = useState(true);
  return (
    <div className="App">
      <Header useHeader={useHeader} />
      <Body setUseHeader={setUseHeader} useHeader={useHeader} />
    </div>
  );
}

export default App;
