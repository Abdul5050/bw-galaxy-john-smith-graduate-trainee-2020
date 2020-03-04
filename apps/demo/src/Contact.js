
import React from 'react';

import './App.css';

  class Contact extends React.Component {
	render(){
      return (
        <div className="Contact">
		<main role="main">
      <article>    
        <header class="section background-image text-center" style={{backgroundImage: "url('./img/carousel-02.jpg')"}}>
          <h1 class="animated-element slow text-extra-thin text-white text-s-size-30 text-m-size-40 text-size-50 text-line-height-1 margin-bottom-30 margin-top-130">
            Contact Us
          </h1>
          <p class="animated-element text-white">We're open for consultation 24/7</p>
          <img class="arrow-object" src="img/arrow-object-white.svg" alt="Byteworks"/>
        </header>
        <section class="section-small-padding background-white text-center">      
          <div class="line">
            <i class="icon-sli-heart text-primary text-size-40"></i>
            <h2 class="text-dark text-size-50 text-m-size-40">We are here for you <b class="text-primary">24/7</b></h2>
          </div>                                                                                                    
        </section>
        
        <section class="full-width background-grey">
          <div class="m-12 l-6">
            <div class="padding-3x">
              <div class="margin2x">
                
                <div class="l-12 xl-6 margin-bottom-60">
                  <div class="float-left">
                    <i class="icon-sli-location-pin text-primary text-size-40 text-line-height-1"></i>
                  </div>
                  <div class="margin-left-60">
                    <h2 class="text-size-20 margin-bottom-10 text-strong">Company Address</h2>                
                    <p>Along Yoruba Mosque</p>
                    <p>Utako, Abuja, Nigeria</p>             
                  </div>
                </div>
                
                <div class="l-12 xl-6 margin-bottom-60">
                  <div class="float-left">
                    <i class="icon-sli-envelope text-primary text-size-40 text-line-height-1"></i>
                  </div>
                  <div class="margin-left-60">
                    <h2 class="text-size-20 margin-bottom-10 text-strong">E-mail</h2>                
                    <p><a class="text-primary-hover" href="mailto:info@byteworks.com.ng">info@byteworks.com.ng</a></p>
                    <p><a class="text-primary-hover" href="mailto:sales@byteworks.com.ng">sales@byteworks.com.ng</a></p>               
                  </div>
                </div>
                
                <div class="l-12 xl-6 margin-bottom-60">
                  <div class="float-left">
                    <i class="icon-sli-earphones-alt text-primary text-size-40 text-line-height-1"></i>
                  </div>
                  <div class="margin-left-60">
                    <h2 class="text-size-20 margin-bottom-10 text-strong">Phone Numbers</h2>                
                    <p>0806 300 0902</p>
                    <p>0806 300 0901</p>
                    <p>0806 300 0900 </p>               
                  </div>
                </div>
                
                <div class="l-12 xl-6">
                  <div class="float-left">
                    <i class="icon-sli-paper-plane text-primary text-size-40 text-line-height-1"></i>
                  </div>
                  <div class="margin-left-60">
                    <h2 class="text-size-20 margin-bottom-10 text-strong">Billing information</h2>
                    <p>Contact our sales manager concering the price of our software. You will get a quick response within few hours.</p>                 
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="m-12 l-6">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3939.9714828543247!2d7.443263114176643!3d9.066362293494931!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x104e0b29232247dd%3A0x3beace55e2bca04d!2sUtako%20Ultra%20Modern%20Market!5e0!3m2!1sen!2sng!4v1583173438567!5m2!1sen!2sng" width="100%" height="600" frameborder="0" title="Byteworks" style={{border:0}}></iframe>
          </div>
        </section>
        
        <section class="section background-dark">
          <div class="s-12 m-12 l-4 center">
            <h3 class="text-size-30 margin-bottom-40 text-center"><b>Contact Form</b></h3>
            <form class="customform text-white" method="post" enctype="multipart/form-data">
              <div class="line">
                <div class="margin">
                  <div class="s-12 m-12 l-6">
                    <input name="email" class="required email" placeholder="Your e-mail" title="Your e-mail" type="text" />
                  </div>
                  <div class="s-12 m-12 l-6">
                    <input name="name" class="name" placeholder="Your name" title="Your name" type="text" />
                  </div>
                </div>
              </div>            
                              
              <div class="line">       
                <div class="s-12">
                  <input name="subject" class="required subject" placeholder="Subject" title="Subject" type="text" />
                </div>
                <div class="s-12">
                  <textarea name="message" class="required message" placeholder="Your message" rows="3"></textarea>
                </div>
                <div class="s-12"><button class="button border-radius text-white background-primary" type="submit">Submit Button</button></div>
              </div>    
            </form>
          </div>           
        </section>
      </article>
    </main>
		</div>
   );
  }
}

export default Contact;
