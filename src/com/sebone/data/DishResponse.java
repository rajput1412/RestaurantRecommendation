package com.sebone.data;

/**
 *  Project name="RestaurentRecommendation"
 * class name=DishResponse
 * method name= Setter And Getters
 * Objective=     providing Data Variable
 * Date: 24/03/2022
 */

/**
 * ClassName     :    DishResponse
 * UseMethods    :    Geters And Setters 
 * ClassSpecifier:    public
 * Objective     :    Crate class for providing Data Variable.
 * @author Mohit Kumar Gehlod
 *
 */
 
 

import java.util.ArrayList;

/**
 * @author Mohit Kumar Gehlod
 *
 */
public class DishResponse {
	
	private boolean isSucces;
	private String message;
	 private ArrayList<DishDetials>dishlist=new ArrayList<DishDetials>();
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
	/**
	 * @return the dishlist
	 */
	public ArrayList<DishDetials> getDishlist() {
		return dishlist;
	}
	/**
	 * @param dishlist the dishlist to set
	 */
	public void setDishlist(ArrayList<DishDetials> dishlist) {
		this.dishlist = dishlist;
	}
	@Override
	public String toString() {
		return "DishResponse [isSucces=" + isSucces + ", message=" + message + ", dishlist=" + dishlist + "]";
	}
	
}
