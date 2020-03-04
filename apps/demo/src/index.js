

import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import { Route, BrowserRouter as Router, Switch } from "react-router-dom";
import App from './App';
import About from './About';
import Services from './Services';
import Gallery from './Gallery';
import Contact from './Contact';
import Header from './header';
import Footer from './footer';
import * as serviceWorker from './serviceWorker';

const routing = (
  <Router>
    <div>
      <Header /> 
      <Switch>
        <Route exact path="/" component={App} />
        <Route path="/about" component={About} />
		<Route path="/services" component={Services} />
		<Route path="/gallery" component={Gallery} />
		<Route path="/contact" component={Contact} />
      </Switch>
      <Footer />    </div>
  </Router>
);

ReactDOM.render(routing, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
