package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.reusable.ReusableCode;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchHotelStep extends ReusableCode{

	PageObjectManager pom = new PageObjectManager();

	/**
	 * Description: User should search hotel by selecting all fields
	 * Date: 08-07-2022
	 * @param location
	 * @param Hotels
	 * @param Room_Type
	 * @param room_nos
	 * @param datepick_in
	 * @param datepick_out
	 * @param adult_room
	 * @param child_room
	 */

	@When("User should search hotels {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchHotelsAnd(String location, String Hotels, String Room_Type, String room_nos, String datepick_in, String datepick_out, String adult_room, String child_room) {
		pom.getSearchHotelPage().searchHotels(location, Hotels, Room_Type, room_nos, datepick_in, datepick_out, adult_room, child_room);
	}

	/**
	 * Description: User should verify whether it is navigating to Select hotel page
	 * Date: 08-07-2022
	 * @param expectedConfirmationMessage
	 */

	@Then("User should verify whether it is navigating to Select hotel page {string}")
	public void userShouldVerifyWhetherItIsNavigatingToSelectHotelPage(String expectedConfirmationMessage) {
		Assert.assertEquals(expectedConfirmationMessage, getText(pom.getSearchHotelPage().getTxtSelconfirmMessage()));

	}

	/** 
	 * Description: User should enter only the mandatory fields
	 * Date: 08-07-2022
	 * @param location
	 * @param room_nos
	 * @param datepick_in
	 * @param datepick_out
	 * @param adult_room
	 */

	@When("User should enter only the mandatory fields {string}, {string}, {string}, {string} and {string}")
	public void userShouldEnterOnlyTheMandatoryFieldsAnd(String location, String room_nos, String datepick_in, String datepick_out, String adult_room) {
		pom.getSearchHotelPage().searchHotels(location, room_nos, datepick_in, datepick_out, adult_room);
	}

	/**
	 * Description: User should verify the error message after selecting the incorrect date
	 * Date: 08-07-2022
	 * @param expectedCheckOutError
	 * @param expectedCheckInError
	 */
	
	@Then("User should verify after searching hotel get date error message as {string}, {string}")
	public void userShouldVerifyAfterSearchingHotelGetDateErrorMessageAs(String expectedCheckOutError, String expectedCheckInError) {
		Assert.assertEquals(expectedCheckOutError, getText(pom.getSearchHotelPage().getCheckInError()));
		Assert.assertEquals(expectedCheckInError, getText(pom.getSearchHotelPage().getCheckOutError()));
	}

	/**
	 * Description: User should verify the error message after selecting the incorrect date
	 * Date: 08-07-2022
	 */
	
	@When("User should search hotels without entering any of the fields")
	public void userShouldSearchHotelsWithoutEnteringAnyOfTheFields() {
		pom.getSearchHotelPage().searchHotels();
	}
	
	/**
	 * Description: User should verify search hotel page error message
	 * Date: 08-07-2022
	 * @param expectedLocationError
	 */

	@Then("User should verify search hotel page error message as {string}")
	public void userShouldVerifySearchHotelPageErrorMessageAs(String expectedLocationError) {
		Assert.assertEquals(expectedLocationError, getText(pom.getSearchHotelPage().getLocationError()));
	}


}
