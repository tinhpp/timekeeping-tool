import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Header from "./components/Common/Header";
import ListUser from "./components/UserManagement/ListUser/ListUser";
import UserFrom from "./components/UserManagement/UserForm/UserFrom";
import { Provider } from "react-redux";
import store from "./store";

function App() {
  return (
    <div className="App">
      <Provider store={store}>
        <Router>
          <Header />
          <Switch>
            <Route path="/" exact component={ListUser}></Route>
            <Route
              path="/usermanagement/listuser"
              exact
              component={ListUser}
            ></Route>
            <Route
              path="/usermanagement/createuserform"
              exact
              component={UserFrom}
            ></Route>
            <Route
              path="/usermanagement/updateuserform/:id"
              exact
              component={UserFrom}
            ></Route>
          </Switch>
        </Router>
      </Provider>
    </div>
  );
}

export default App;
