/**
 * 
 */
package com.sebone.data;

import java.util.ArrayList;

/**
 * 
 *  Project name= 	"RestaurentRecommendation"
 * class name=   	 RestaurantData
 * method name=  	Setter And Getters
 * Objective=     	providing Data Variable
 * Date: 24/03/2022
 */

/**
 * ClassName     :    RestaurantData
 * UseMethods    :    Geters And Setters 
 * ClassSpecifier:    public
 * Objective     :    Create class for providing Data Variable.

 * @author Mohit Kumar Gehlod
 *
 */

public class RestaurantResponse {
private boolean isSucces;
private ArrayList<RestaurantDetails>restaurantList= new ArrayList<RestaurantDetails>();
private String message;
/**
 * @return the isSucces
 */
public boolean isSucces() {
	return isSucces;
}
/**
 * @param isSucces the isSucces to set
 */
public void setSucces(boolean isSucces) {
	this.isSucces = isSucces;
}
/**
 * @return the restaurantList
 */
public ArrayList<RestaurantDetails> getRestaurantList() {
	return restaurantList;
}
/**
 * @param restaurantList the restaurantList to set
 */
public void setRestaurantList(ArrayList<RestaurantDetails> restaurantList) {
	this.restaurantList = restaurantList;
}
/**
 * @return the message
 */
public String getMessage() {
	return message;
}
/**
 * @param message the message to set
 */
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "RestaurantResponse [isSucces=" + isSucces + ", restaurantList=" + restaurantList + ", message=" + message
			+ "]";
}

	
}
