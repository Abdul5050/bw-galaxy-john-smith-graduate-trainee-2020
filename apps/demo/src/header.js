



import React from "react";
function Header() {
  return (
  <header role="banner" className="position-absolute">    
      <nav className="background-transparent background-primary-dott full-width sticky">          
        <div className="logo hide-l hide-xl hide-xxl">
           <a href="index.html" className="logo">
            <img className="logo-dark" src={window.location.origin + '/img/logo-dark.svg'} alt="Byteworks"/>
          </a>
        </div>
        <div className="top-nav">     
          <div className="top-nav left-menu">
             <ul className="right top-ul chevron">
                <li><a href="/">Home</a></li>
                <li><a href="/about">About Us</a></li>
                <li><a href="/services">Our Services</a></li>
             </ul>
          </div>         
          <ul className="logo-menu">
            <a href="/" className="logo">           
              <img className="logo-white" src="img/logo.svg" alt="Byteworks"/>           
              <img className="logo-dark" src="img/logo-dark.svg" alt="Byteworks"/>
            </a>
          </ul>
          <div className="top-nav right-menu">
             <ul className="top-ul chevron">
                <li><a href="/gallery">Gallery</a></li>
                <li><a href="/contact">Contact</a></li>
				<li><a href="/login">Login</a></li>
             </ul> 
          </div>
        </div>
      </nav>
    </header>
  );
}
export default Header;