/**
 * 
 */
package com.sebone.data;

import java.util.ArrayList;

/**
 * * /**
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

 
public class RestaurantDetails {

	private ArrayList<RestaurantData>list=new ArrayList<RestaurantData>();
	private ArrayList<RatingData>ratingList=new ArrayList<RatingData>();
	private ArrayList<OfferData>offerList=new ArrayList<OfferData>();
	/**
	 * @return the list
	 */
	public ArrayList<RestaurantData> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<RestaurantData> list) {
		this.list = list;
	}
	/**
	 * @return the ratingList
	 */
	public ArrayList<RatingData> getRatingList() {
		return ratingList;
	}
	/**
	 * @param ratingList the ratingList to set
	 */
	public void setRatingList(ArrayList<RatingData> ratingList) {
		this.ratingList = ratingList;
	}
	/**
	 * @return the offerList
	 */
	public ArrayList<OfferData> getOfferList() {
		return offerList;
	}
	/**
	 * @param offerList the offerList to set
	 */
	public void setOfferList(ArrayList<OfferData> offerList) {
		this.offerList = offerList;
	}
	@Override
	public String toString() {
		return "RestaurantDetails [list=" + list + ", ratingList=" + ratingList + ", offerList=" + offerList + "]";
	}
	
}
