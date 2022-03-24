/**
 *  Project name="RestaurentRecommendation"
 * class name=DishData
 * method name= Setter And Getters
 * Objective=     providing Data Variable
 * Date: 24/03/2022 
 */
package com.sebone.data;

/**
 * @author Mohit Kumar Gehlod
 
 * ClassName     :    DishData
 * UseMethods    :    Geters And Setters 
 * ClassSpecifier:    public
 * Objective     :    Crate class for providing Data Variable.
 */

 
public class DishData {

	private int dishId;
	private String dishName;
	private int dishPrice;
	private String dishImage;
	private String dishDescription;
	private String dishType;
	private int restaurantId;
	private String dishStatus;
	private String dishCreationTime;
	private String dishModifiedTime;
	private String dishPriparationTime;
	private String dishTime;
	/**
	 * @return the dishId
	 */
	public int getDishId() {
		return dishId;
	}
	/**
	 * @param dishId the dishId to set
	 */
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	/**
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}
	/**
	 * @param dishName the dishName to set
	 */
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	/**
	 * @return the dishPrice
	 */
	public int getDishPrice() {
		return dishPrice;
	}
	/**
	 * @param dishPrice the dishPrice to set
	 */
	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}
	/**
	 * @return the dishImage
	 */
	public String getDishImage() {
		return dishImage;
	}
	/**
	 * @param dishImage the dishImage to set
	 */
	public void setDishImage(String dishImage) {
		this.dishImage = dishImage;
	}
	/**
	 * @return the dishDescription
	 */
	public String getDishDescription() {
		return dishDescription;
	}
	/**
	 * @param dishDescription the dishDescription to set
	 */
	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}
	/**
	 * @return the dishType
	 */
	public String getDishType() {
		return dishType;
	}
	/**
	 * @param dishType the dishType to set
	 */
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	/**
	 * @return the restaurantId
	 */
	public int getRestaurantId() {
		return restaurantId;
	}
	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	/**
	 * @return the dishStatus
	 */
	public String getDishStatus() {
		return dishStatus;
	}
	/**
	 * @param dishStatus the dishStatus to set
	 */
	public void setDishStatus(String dishStatus) {
		this.dishStatus = dishStatus;
	}
	/**
	 * @return the dishCreationTime
	 */
	public String getDishCreationTime() {
		return dishCreationTime;
	}
	/**
	 * @param dishCreationTime the dishCreationTime to set
	 */
	public void setDishCreationTime(String dishCreationTime) {
		this.dishCreationTime = dishCreationTime;
	}
	/**
	 * @return the dishModifiedTime
	 */
	public String getDishModifiedTime() {
		return dishModifiedTime;
	}
	/**
	 * @param dishModifiedTime the dishModifiedTime to set
	 */
	public void setDishModifiedTime(String dishModifiedTime) {
		this.dishModifiedTime = dishModifiedTime;
	}
	/**
	 * @return the dishPriparationTime
	 */
	public String getDishPriparationTime() {
		return dishPriparationTime;
	}
	/**
	 * @param dishPriparationTime the dishPriparationTime to set
	 */
	public void setDishPriparationTime(String dishPriparationTime) {
		this.dishPriparationTime = dishPriparationTime;
	}
	/**
	 * @return the dishTime
	 */
	public String getDishTime() {
		return dishTime;
	}
	/**
	 * @param dishTime the dishTime to set
	 */
	public void setDishTime(String dishTime) {
		this.dishTime = dishTime;
	}
	@Override
	public String toString() {
		return "DishData [dishId=" + dishId + ", dishName=" + dishName + ", dishPrice=" + dishPrice + ", dishImage="
				+ dishImage + ", dishDescription=" + dishDescription + ", dishType=" + dishType + ", restaurantId="
				+ restaurantId + ", dishStatus=" + dishStatus + ", dishCreationTime=" + dishCreationTime
				+ ", dishModifiedTime=" + dishModifiedTime + ", dishPriparationTime=" + dishPriparationTime
				+ ", dishTime=" + dishTime + "]";
	}
	
	
}
