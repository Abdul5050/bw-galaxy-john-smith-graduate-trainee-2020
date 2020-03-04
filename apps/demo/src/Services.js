
import React from 'react';

import './App.css';

  class Services extends React.Component {
	render(){
      return (
        <div className="Services">
		<main role="main">
      <article>    
        <header className="section background-image text-center" style={{backgroundImage: "url('./img/carousel-02.jpg')"}}>
          <h1 className="animated-element slow text-extra-thin text-white text-s-size-30 text-m-size-40 text-size-50 text-line-height-1 margin-bottom-30 margin-top-130">
            Our Services
          </h1>
          <p className="animated-element text-white">We're #1 software solutions company</p>
          <img className="arrow-object" src="img/arrow-object-white.svg" alt="Byteworks"/>
        </header>
        <section className="section background-white">      
          <div className="line">
            <div className="margin2x">
              <div className="m-12 l-6 margin-bottom-60">
                <div className="float-left">
                  <h3 className="text-strong text-size-20 text-line-height-1 margin-bottom-20">Software design and development</h3>
                  <p>
                    We can build anytype of software to suite your business needs. Here are some few or most porpular software we have built 
					for our happy clients.</p> 
                    
                    <p className="text-padding-small background-primary text-white s-12 margin-top-bottom-20">List of softwares we have built</p>                    
                     <p> 
                    School management portals<br/>
					Hospital management portals<br/>
					Human resources management portals<br/>
					Task management portals<br/>
					Hospital management portals<br/>
					Hotel management portals<br/>
                  </p>                                                      
                </div>
              </div>
              
              <div className="m-12 l-6 margin-bottom-60">
                <div className="float-left">
                  <h3 className="text-strong text-size-20 text-line-height-1 margin-bottom-20">Programming Training</h3>
                  <p>
                    
                    We do both free and premium programming training. The free training are for people that wants to do internships. While the premium one
					are for people that want to study programming as their career in order to seek a job in an IT firm or just to become an independent
					developer or as a freelancer.</p> 
                    <p className="text-padding-small background-primary text-white s-12 margin-top-bottom-20">Here are the list of some courses</p> 
                    <p> 					
                    Java spring framework training<br/>
                    Java Training<br/>
                    Python Training<br/>
                    PHP Training<br/>
                    Codeigniter Training<br/>
                    Laravel Training<br/>
                    Cordova Training<br/>
                    React js & React Native Training<br/>					
                    
                  </p>                                                      
                </div>
              </div>
              
            </div>
          </div>       
        </section>
      </article>
      
      <section className="section background-dark">
        <div className="line text-center">
          <i className="icon-sli-heart text-primary text-size-40"></i>
          <h2 className="text-size-50 text-m-size-40"><b>Satisfied</b> Clients</h2>
          <hr className="break background-primary break-small break-center margin-bottom-50"/>
        </div>
        <div className="line">    
          <div className="carousel-default owl-carousel carousel-wide-arrows">
            <div className="item">
              <div className="s-12 m-12 l-7 center text-center">
                <div className="text-primary margin-bottom"><i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i></div>
                <p className="margin-bottom">Iriure duis autem vel eum dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis  lobortis nisl ut aliquip ex ea commodo consequat.</p>
                <p className="text-primary text-size-16"><strong>Nancy Banks</strong> / CEO / Company</p>
              </div>
            </div>
            <div className="item">
              <div className="s-12 m-12 l-7 center text-center">
                <div className="text-primary margin-bottom"><i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i></div>
                <p className="margin-bottom">Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, lobortis nisl ut aliquip ex ea commodo consequat vel illum dolore eu feugiat nulla facilisis.</p>
                <p className="text-primary text-size-16"><strong>Tunde Kehinde</strong> / Web Developer / Company</p>
              </div>
            </div>
            <div className="item">
              <div className="s-12 m-12 l-7 center text-center">
                <div className="text-primary margin-bottom"><i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i> <i className="icon-star text-size-12"></i></div>
                <p className="margin-bottom">Vulputate velit duis autem vel eum iriure dolor in hendrerit in vulputate lobortis nisl ut aliquip ex ea commodo consequat velit esse molestie consequat, vel illum dolore eu feugiat nulla.</p>
                <p className="text-primary text-size-16"><strong>Mariam Ali</strong> / Web Designer / Company</p>
              </div>
            </div>
          </div>
        </div>
      </section>

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

export default Services;
