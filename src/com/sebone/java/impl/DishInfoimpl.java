/**
 * 
 */
package com.sebone.java.impl;

import java.util.ArrayList;

import com.sebone.data.DishResponse;
import com.sebone.data.RestaurantResponse;
import com.sebone.java.restaurents.DishInfo;
import com.sebone.java.restaurents.RestaurantInfo;

/** * Project name= 	"RestaurentRecommendation"
 * class name=   	 	DishInfoimpl
 * method name=  		implemented Methods
 * Objective=     	Providing  Implements OF DishInfo Interface  
 * Date: 24/03/2022
 */

/**
 * ClassName      :    	DishInfoimpl
 * UseMethods     :    	implemented Methods
 * MetodsSpacifier:    	public
 * Objective      :    	
 * ReturnType	  :		DishResponse

 * @author Mohit Kumar Gehlod
 *
 */
 
public class DishInfoimpl implements DishInfo{

	@Override
	public DishResponse getDisheshByRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DishResponse searchDisheshByKeyword(int restaurantId, String keyWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DishResponse searchByDish(String Keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DishResponse sortDish(int restaurantId, ArrayList<String> sortValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DishResponse filterDish(int restaurantId, ArrayList<String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
