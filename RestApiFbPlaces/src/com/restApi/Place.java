package com.restApi;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "place") 

/**
 * Class Place
 */

public class Place {
   private String name; 
   private Float latitude; 
   private Float longitude;  
   public Place(){} 
   
   /**
    * Defining a Place.
    */
   public Place(String name, float latitude, float longitude){  
      this.name = name; 
      this.latitude = latitude; 
      this.longitude = longitude; 
   }  
   
	
   /**
	* Gets the name.
	*/
   public String getName() { 
      return name; 
   }
   
   /**
    * Sets the name.
    */
   @XmlElement
   public void setName(String name) { 
      this.name = name; 
   } 
   
   /**
	* Gets the latitude.
	*/
   public float getLatitude() { 
      return latitude; 
   }
   
   /**
    * Sets the latitude.
    */
   @XmlElement
   public void setLatitude(float latitude) { 
      this.latitude = latitude; 
   }
   
   /**
	* Gets the longitude.
	*/
   public float getLongitude() { 
      return longitude; 
   }
   
   /**
    * Sets the longitude.
    */
   @XmlElement
   public void setLongitude(float longitude) { 
      this.longitude = longitude; 
   }   
} 