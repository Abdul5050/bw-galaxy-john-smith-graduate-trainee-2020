
import React from 'react';

import './App.css';

  class About extends React.Component {
	render(){
      return (
        <div className="About">
		<main role="main">
      <article>    
        <header className="section background-image text-center" style={{backgroundImage: "url('./img/img-05.jpg')"}}>
          <h1 className="animated-element slow text-extra-thin text-white text-s-size-30 text-m-size-40 text-size-50 text-line-height-1 margin-bottom-30 margin-top-130">
            About Us
          </h1>
          <p className="animated-element text-white">Here are some facts about us</p>
          
          <img className="arrow-object" src="img/arrow-object-white.svg" alt="Byteworks"/>
        </header>
        <section className="section background-white">
          <div className="line text-center">
            <i className="icon-sli-heart text-primary text-size-40"></i>
            <h2 className="text-dark text-size-50 text-m-size-40">Who <b>We Are?</b></h2>
            <hr className="break background-primary break-small break-center margin-bottom-50"/>
          </div>
          <div className="line">
            <div className="margin2x">
              <div className="m-12 l-6 margin-m-bottom-30">
                <img src="img/img-01.jpg" alt="Byteworks"/>
              </div>          
              <div className="m-12 l-6">
                <h3 className="animated-element text-strong text-size-20 text-line-height-1 margin-bottom-20">What We Do for You?</h3>
                <p className="animated-element slow margin-bottom-30">
				Byteworks is a software solutions company. We build secured software for companies, organization, businesses and even individuals at 
				a very reasonable price. We are purely an information technology company. If we are not the best in Africa then we are one of the
				best in Africa. We have been operating privately for over 10 years. You can search for our profile in CAC.
                </p>
                              
                <h3 className="animated-element text-strong text-size-20 text-line-height-1 margin-bottom-20">We are open for projects</h3>
                <p className="animated-element slow margin-bottom-30">
				We have dozens of developers all arround the globe to build your new software at your requested time limit. We train youths like the
                NYSC corp members and the internships to become wizards in software developement. You can trust us for your next project.				
                </p>
              </div>
            </div>    
          </div>  
        </section>      
      </article>
    </main>
		</div>
   );
  }
}

export default About;
