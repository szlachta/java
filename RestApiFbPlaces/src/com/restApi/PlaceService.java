package com.restApi;

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 * Class PlaceService 
 */
@Path("/PlaceService") 

public class PlaceService {  
 
	/** Returns a place or a list of places at a given location */
   @GET 
   @Path("/{country}/{city}/{name}") /** Parameters used in URL */
   @Produces(MediaType.APPLICATION_JSON) /** Type of returned media */
   public List<com.restApi.Place> getPlaces(@PathParam("country") String country, @PathParam("city") String city, @PathParam("name") String name) { 
	   List <com.restApi.Place> miejsca = FacebookApi.getAllPlaces(country,city,name);
       if (miejsca.size() == 0) {
           throw new WebApplicationException(Response.Status.NOT_FOUND);
       }
	   return miejsca; 
   }
}