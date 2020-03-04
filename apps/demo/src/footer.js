


import React from "react";

function Footer() {
  return (
    <footer>
      <div className="background-primary padding text-center">
        <a href="/"><i className="icon-facebook_circle text-size-25 text-dark"></i></a> 
        <a href="/"><i className="icon-twitter_circle text-size-25 text-dark"></i></a>
        <a href="/"><i className="icon-google_plus_circle text-size-25 text-dark"></i></a>
        <a href="/"><i className="icon-instagram_circle text-size-25 text-dark"></i></a> 
        <a href="/"><i className="icon-linked_in_circle text-size-25 text-dark"></i></a>                                                                       
      </div>
      <section className="section background-dark">
        <div className="line"> 
          <div className="margin2x">
            <div className="s-12 m-6 l-3 xl-5">
               <h4 className="text-white text-strong">Our Mission</h4>
               <p>
                 To provide software for people in order to promote businesses automation
               </p>
            </div>
            <div className="s-12 m-6 l-3 xl-2">
               <h4 className="text-white text-strong margin-m-top-30">Useful Links</h4>
               <a className="text-primary-hover" href="/">FAQ</a><br/>      
               <a className="text-primary-hover" href="/contact">Contact Us</a><br/>
            </div>
            <div className="s-12 m-6 l-3 xl-2">
               <h4 className="text-white text-strong margin-m-top-30">Term of Use</h4>
               <a className="text-primary-hover" href="/">Terms and Conditions</a><br/>
               <a className="text-primary-hover" href="/">Refund Policy</a><br/>
               <a className="text-primary-hover" href="/">Disclaimer</a>
            </div>
            <div className="s-12 m-6 l-3 xl-3">
               <h4 className="text-white text-strong margin-m-top-30">Contact Us</h4>
                <p><i className="icon-sli-screen-smartphone text-primary"></i> 0806 300 0902</p>
                <a className="text-primary-hover" href="mailto:info@byteworks.com.ng"><i className="icon-sli-mouse text-primary"></i> info@byteworks.com.ng</a><br/>
                <a className="text-primary-hover" href="mailto:sales@byteworks.com.ng"><i className="icon-sli-mouse text-primary"></i> sales@byteworks.com.ng</a>
            </div>
          </div>  
        </div>    
      </section>
      <div className="background-dark">
         <div className="line">
            <hr className="break margin-top-bottom-0" style={{ borderColor: 777 }} />
         </div>
      </div>
       <section className="padding-2x background-dark full-width">
        <div className="line">
          <div className="s-12 l-6">
            <p className="text-size-12">Copyright 2020, Byteworks Technologies Solutions</p>
          </div>
          <div className="s-12 l-6">
            <a className="right text-size-12 text-primary-hover" href="http://www.byteworks.com.ng" title="">Design and coding<br/> by Tacman</a>
          </div>
        </div>  
      </section>
    </footer>
  );
}

export default Footer;