package com.restApi;

import java.util.ArrayList;
import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Place;

/**
 * Class responsible for downloading data from Facebook
 */

public class FacebookApi {
	public static List<com.restApi.Place> getAllPlaces(String country, String city, String name) {
	    List<com.restApi.Place> placeList = new ArrayList<com.restApi.Place>();
	    String q = country + " " + city + " " + name;
	    
	    /** Access Token from Facebook */
	    String accessToken = "EAAeViX1e5ZAYBAHPGM81iXznyRII2Kd4D1XgBbKZB8QDUbYZAb9BGAjxEtY3IhFBfEfhJayk5iZBoyPZB4H5ORIffE2Lp2HK8fQcEJZBmzPjMpTcqCmWE37EJg17lqms18gFGYPRUAA4jJKwe5iOUPd8ENgcB4ZADIZD";
	    FacebookClient fbClient = new DefaultFacebookClient(accessToken);
	    
	    /** Downloading data with specified parameters */
	    Connection<Place> publicSearch = fbClient.fetchConnection("search", 
	    															Place.class, 
	    															Parameter.with("q", q), // The name of the place to search for
	    															Parameter.with("type", "place"),
	    															Parameter.with("fields", "name,location")); // Parameters to be returned
	    for (List<Place> myFeedPage : publicSearch) {
	    	for (Place placeAllInf : myFeedPage) { 
	    		placeList.add(new com.restApi.Place(placeAllInf.getName(), placeAllInf.getLocation().getLatitude().floatValue(), placeAllInf.getLocation().getLongitude().floatValue()));
			}
	    } 
		return placeList;
	}

}
