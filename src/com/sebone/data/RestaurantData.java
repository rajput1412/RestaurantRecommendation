/**
 * 
 */
package com.sebone.data;

/**
 * /**
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
public class RestaurantData {

	private int restaurantId;
	private String restaurantname;
	private long  restaurantcontactNumber;
	private String restaurantemail;
	private String restaurantimage;
	private String restaurantStatus;
	private String restaurantType;
	private String restaurantDescription;
	//private int restaurantOffer;
	private  int restaurantAvgPrice;
	private String restaurantOpenTime;
	private String restaurantCloseTime;
	 private String restaurantCreatedDateTime;
	 private String restaurantModifiedDateTime;
	 private int restaurantPincode;
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
	 * @return the restaurantname
	 */
	public String getRestaurantname() {
		return restaurantname;
	}
	/**
	 * @param restaurantname the restaurantname to set
	 */
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	/**
	 * @return the restaurantcontactNumber
	 */
	public long getRestaurantcontactNumber() {
		return restaurantcontactNumber;
	}
	/**
	 * @param restaurantcontactNumber the restaurantcontactNumber to set
	 */
	public void setRestaurantcontactNumber(long restaurantcontactNumber) {
		this.restaurantcontactNumber = restaurantcontactNumber;
	}
	/**
	 * @return the restaurantemail
	 */
	public String getRestaurantemail() {
		return restaurantemail;
	}
	/**
	 * @param restaurantemail the restaurantemail to set
	 */
	public void setRestaurantemail(String restaurantemail) {
		this.restaurantemail = restaurantemail;
	}
	/**
	 * @return the restaurantimage
	 */
	public String getRestaurantimage() {
		return restaurantimage;
	}
	/**
	 * @param restaurantimage the restaurantimage to set
	 */
	public void setRestaurantimage(String restaurantimage) {
		this.restaurantimage = restaurantimage;
	}
	/**
	 * @return the restaurantStatus
	 */
	public String getRestaurantStatus() {
		return restaurantStatus;
	}
	/**
	 * @param restaurantStatus the restaurantStatus to set
	 */
	public void setRestaurantStatus(String restaurantStatus) {
		this.restaurantStatus = restaurantStatus;
	}
	/**
	 * @return the restaurantType
	 */
	public String getRestaurantType() {
		return restaurantType;
	}
	/**
	 * @param restaurantType the restaurantType to set
	 */
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	/**
	 * @return the restaurantDescription
	 */
	public String getRestaurantDescription() {
		return restaurantDescription;
	}
	/**
	 * @param restaurantDescription the restaurantDescription to set
	 */
	public void setRestaurantDescription(String restaurantDescription) {
		this.restaurantDescription = restaurantDescription;
	}
	/**
	 * @return the restaurantAvgPrice
	 */
	public int getRestaurantAvgPrice() {
		return restaurantAvgPrice;
	}
	/**
	 * @param restaurantAvgPrice the restaurantAvgPrice to set
	 */
	public void setRestaurantAvgPrice(int restaurantAvgPrice) {
		this.restaurantAvgPrice = restaurantAvgPrice;
	}
	/**
	 * @return the restaurantOpenTime
	 */
	public String getRestaurantOpenTime() {
		return restaurantOpenTime;
	}
	/**
	 * @param restaurantOpenTime the restaurantOpenTime to set
	 */
	public void setRestaurantOpenTime(String restaurantOpenTime) {
		this.restaurantOpenTime = restaurantOpenTime;
	}
	/**
	 * @return the restaurantCloseTime
	 */
	public String getRestaurantCloseTime() {
		return restaurantCloseTime;
	}
	/**
	 * @param restaurantCloseTime the restaurantCloseTime to set
	 */
	public void setRestaurantCloseTime(String restaurantCloseTime) {
		this.restaurantCloseTime = restaurantCloseTime;
	}
	/**
	 * @return the restaurantCreatedDateTime
	 */
	public String getRestaurantCreatedDateTime() {
		return restaurantCreatedDateTime;
	}
	/**
	 * @param restaurantCreatedDateTime the restaurantCreatedDateTime to set
	 */
	public void setRestaurantCreatedDateTime(String restaurantCreatedDateTime) {
		this.restaurantCreatedDateTime = restaurantCreatedDateTime;
	}
	/**
	 * @return the restaurantModifiedDateTime
	 */
	public String getRestaurantModifiedDateTime() {
		return restaurantModifiedDateTime;
	}
	/**
	 * @param restaurantModifiedDateTime the restaurantModifiedDateTime to set
	 */
	public void setRestaurantModifiedDateTime(String restaurantModifiedDateTime) {
		this.restaurantModifiedDateTime = restaurantModifiedDateTime;
	}
	/**
	 * @return the restaurantPincode
	 */
	public int getRestaurantPincode() {
		return restaurantPincode;
	}
	/**
	 * @param restaurantPincode the restaurantPincode to set
	 */
	public void setRestaurantPincode(int restaurantPincode) {
		this.restaurantPincode = restaurantPincode;
	}
	@Override
	public String toString() {
		return "RestaurantData [restaurantId=" + restaurantId + ", restaurantname=" + restaurantname
				+ ", restaurantcontactNumber=" + restaurantcontactNumber + ", restaurantemail=" + restaurantemail
				+ ", restaurantimage=" + restaurantimage + ", restaurantStatus=" + restaurantStatus
				+ ", restaurantType=" + restaurantType + ", restaurantDescription=" + restaurantDescription
				+ ", restaurantAvgPrice=" + restaurantAvgPrice + ", restaurantOpenTime=" + restaurantOpenTime
				+ ", restaurantCloseTime=" + restaurantCloseTime + ", restaurantCreatedDateTime="
				+ restaurantCreatedDateTime + ", restaurantModifiedDateTime=" + restaurantModifiedDateTime
				+ ", restaurantPincode=" + restaurantPincode + "]";
	}
	
	
	
}
