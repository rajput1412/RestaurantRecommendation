/**
 * 
 */
package com.sebone.data;

/**
 *  Project name= 	"RestaurentRecommendation"
 * class name=   	 OfferData
 * method name=  	Setter And Getters
 * Objective=     	providing Data Variable
 * Date: 24/03/2022
 */

/**
 * ClassName     :    OfferDAta
 * UseMethods    :    Geters And Setters 
 * ClassSpecifier:    public
 * Objective     :    Create class for providing Data Variable.

 * @author Mohit Kumar Gehlod
 *
 */
public class OfferData {
	private int offerId;
	private String offerType;
	private String offerDescription;
	private String offerStartDateTime;
	private String offerEndDateTime;
	private String offerStatus;
	private int restaurantId;
	/**
	 * @return the offerId
	 */
	public int getOfferId() {
		return offerId;
	}
	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	/**
	 * @return the offerType
	 */
	public String getOfferType() {
		return offerType;
	}
	/**
	 * @param offerType the offerType to set
	 */
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	/**
	 * @return the offerDescription
	 */
	public String getOfferDescription() {
		return offerDescription;
	}
	/**
	 * @param offerDescription the offerDescription to set
	 */
	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}
	/**
	 * @return the offerStartDateTime
	 */
	public String getOfferStartDateTime() {
		return offerStartDateTime;
	}
	/**
	 * @param offerStartDateTime the offerStartDateTime to set
	 */
	public void setOfferStartDateTime(String offerStartDateTime) {
		this.offerStartDateTime = offerStartDateTime;
	}
	/**
	 * @return the offerEndDateTime
	 */
	public String getOfferEndDateTime() {
		return offerEndDateTime;
	}
	/**
	 * @param offerEndDateTime the offerEndDateTime to set
	 */
	public void setOfferEndDateTime(String offerEndDateTime) {
		this.offerEndDateTime = offerEndDateTime;
	}
	/**
	 * @return the offerStatus
	 */
	public String getOfferStatus() {
		return offerStatus;
	}
	/**
	 * @param offerStatus the offerStatus to set
	 */
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
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
	@Override
	public String toString() {
		return "OfferData [offerId=" + offerId + ", offerType=" + offerType + ", offerDescription=" + offerDescription
				+ ", offerStartDateTime=" + offerStartDateTime + ", offerEndDateTime=" + offerEndDateTime
				+ ", offerStatus=" + offerStatus + ", restaurantId=" + restaurantId + "]";
	}
	

}
