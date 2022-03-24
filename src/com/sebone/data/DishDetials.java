/**
 *  Project name="RestaurentRecommendation"
 * class name=DishDetials
 * method name= Setter And Getters
 * Objective=     providing Data Variable
 * Date: 24/03/2022
 */
package com.sebone.data;

/**
 * ClassName     :    DishDetials
 * UseMethods    :    Geters And Setters 
 * ClassSpecifier:    public
 * Objective     :    Crate class for providing Data Variable.
 * @author Mohit Kumar Gehlod
 *
 */
public class DishDetials {
	 private RestaurantDetails restaurantDetails=new RestaurantDetails();
	 private DishData dishData=new DishData();
	
	/**
	 * @return the restaurantDetails
	 */
	public RestaurantDetails getRestaurantDetails() {
		return restaurantDetails;
	}
	/**
	 * @param restaurantDetails the restaurantDetails to set
	 */
	public void setRestaurantDetails(RestaurantDetails restaurantDetails) {
		this.restaurantDetails = restaurantDetails;
	}
	/**
	 * @return the dishData
	 */
	public DishData getDishData() {
		return dishData;
	}
	/**
	 * @param dishData the dishData to set
	 */
	public void setDishData(DishData dishData) {
		this.dishData = dishData;
	}
	

}
