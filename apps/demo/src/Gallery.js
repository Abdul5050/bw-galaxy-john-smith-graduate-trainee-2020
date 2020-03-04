
import React from 'react';

import './App.css';

  class Gallery extends React.Component {
	render(){
      return (
        <div className="Gallery">
		<main role="main">
      <article>    
        <header className="section background-image text-center" style={{backgroundImage: "url('./img/carousel-02.jpg')"}}>
          <h1 className="animated-element slow text-extra-thin text-white text-s-size-30 text-m-size-40 text-size-50 text-line-height-1 margin-bottom-30 margin-top-130">
            Gallery
          </h1>
          <img className="arrow-object" src="img/arrow-object-white.svg" alt="Byteworks"/>
        </header>
        <section className="section background-white">      
          <div className="line">
            <div className="margin2x">
                        
              <div className="s-12 m-6 margin-bottom-30">
                <img className="full-img" src="img/portfolio/portfolio-01.jpg" alt="Byteworks"/>
              </div>
              <div className="s-12 m-6 margin-bottom-30">
                <img className="full-img" src="img/portfolio/portfolio-02.jpg" alt="Byteworks"/>
              </div> 
              <div className="s-12 m-6 margin-bottom-30">
                <img className="full-img" src="img/portfolio/portfolio-03.jpg" alt="Byteworks"/>
              </div> 
              <div className="s-12 m-6 margin-bottom-30">
                <img className="full-img" src="img/portfolio/portfolio-04.jpg" alt="Byteworks"/>
              </div> 
              <div className="s-12 m-6 margin-bottom-30">
                <img className="full-img" src="img/portfolio/portfolio-05.jpg" alt="Byteworks"/>
              </div> 
              <div className="s-12 m-6 margin-bottom-30">
                <img className="full-img" src="img/portfolio/portfolio-06.jpg" alt="Byteworks"/>
              </div>                                                                                   
              
            </div>
          </div>       
        </section>
      </article>
      
      <hr className="break"/>
       <section className="section-small-padding background-white text-center">
        <div className="line">
          <div className="s-12 m-12 l-9 center margin-bottom-30">
            <h3 className="text-strong text-size-20 text-line-height-1 margin-bottom-10">We're available 24/7</h3>
            <p>Contact us today for your next software developement project.</p>
          </div>
        </div>            
        <div className="line">  
          <div className="s-12 m-12 l-3 center">
            <a href="/contact" className="s-12 button border-radius background-primary text-size-20 text-white">Contact Us</a>
          </div>
        </div>
      </section>          
    </main>
		</div>
   );
  }
}

export default Gallery;
