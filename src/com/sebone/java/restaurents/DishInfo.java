/**
 * 
 */
package com.sebone.java.restaurents;

import java.util.ArrayList;

import com.sebone.data.DishResponse;
import com.sebone.data.RestaurantResponse;

/**Project name= 	"RestaurentRecommendation"
 * InterFace name=   	 	DishInfo
 * method name=  		 
 * Objective=     	Providing  InterFace OF DishInfo   
 * Date: 24/03/2022
 */

/**
 * ClassName      :    	DishInfo
 * UseMethods     :    	 
 * MetodsSpacifier:    	public
 * Objective      :    	
 * ReturnType	  :		DishResponse

 * @author Mohit Kumar Gehlod
 *
 */
public interface DishInfo {
	public DishResponse getDisheshByRestaurant(int restaurantId);
	public DishResponse searchDisheshByKeyword(int restaurantId,String keyWord);
	 public DishResponse searchByDish(String Keyword);
	 public  DishResponse sortDish(int restaurantId,ArrayList<String>sortValue);
	 public DishResponse filterDish(int restaurantId,ArrayList<String>filters);
	
}
