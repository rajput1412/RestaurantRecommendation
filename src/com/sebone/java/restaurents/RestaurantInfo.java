/**
 * 
 */
package com.sebone.java.restaurents;

import java.util.ArrayList;

import com.sebone.data.RestaurantResponse;

/**
 *
 * Project name= 	"RestaurentRecommendation"
 * InterFace name=   RestaurentInfo	 	
 * method name=  		
 * Objective=     	Providing  Inteface OF RestaurantInfo   
 * Date: 24/03/2022
 */

/**
 * ClassName      :    	RestaurantInfo
 * UseMethods     :    	implemented Methods
 * MetodsSpacifier:    	public
 * Objective      :    	
 * ReturnType	  :		RestaurantResponse

 */
public interface RestaurantInfo {
	public RestaurantResponse getRestaurantDetails(int pincode);
	public RestaurantResponse getRestaurantByName(String name);
	public RestaurantResponse filterRestaurantDetails(int pincode,ArrayList<String>value);
	public RestaurantResponse sortRestaurantDetils(int pincode,ArrayList<String>value);

}
