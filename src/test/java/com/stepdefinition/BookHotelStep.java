package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.reusable.ReusableCode;

import cucumber.api.java.en.Then;

public class BookHotelStep extends ReusableCode {

	PageObjectManager pom = new PageObjectManager();
	
/**
 * Description: UserShouldBookHotel by selecting all fields
 * @param firstName
 * @param lastName
 * @param address
 * @param dataTable
 * @throws InterruptedException
 * Date: 08-07-2022 
 */

	@Then("User should Book hotel {string}, {string} and {string}")
	public void userShouldBookHotelAnd(String firstName, String lastName, String address, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps();
		Map<String, String> map = data.get(1);
		String ccNum = map.get("Card_No");
		String ccType = map.get("Card_Type");
		String expMonth = map.get("Expiry_Month");
		String expYear = map.get("Expiry_Year");
		String cvvNum = map.get("Cvv_No");
		pom.getBookHotelPage().bookHotel(firstName, lastName, address, ccNum, ccType, expMonth, expYear, cvvNum);
	}

	/**
	 * Description: Verify the message after hotel booking, in booking confirmation page
	 * @param expectedBookingConfirmMessage
	 */
	@Then("User should verify the message after hotel booking in booking confirmation page as {string}")
	public void userShouldVerifyTheMessageAfterHotelBookingInBookingConfirmationPageAs(String expectedBookingConfirmMessage) {
		Assert.assertEquals(expectedBookingConfirmMessage, getText(pom.getBookHotelPage().getTxtBookConfirmation()));
	}

	/**
	 * Description: Book a hotel without selecting any fields in book hotel page
	 * Date: 08-07-2022
	 */
	
	@Then("User should Book a hotel without selecting any fields in book hotel page")
	public void userShouldBookAHotelWithoutSelectingAnyFieldsInBookHotelPage() {
		pom.getBookHotelPage().bookHotelWithoutDatas();
	}
	
	/**
	 * Description: Verify the error message without selecting any fields in book hotel
	 * @param expectedFirstNameError
	 * @param expectedLastNameError
	 * @param expectedAddressError
	 * @param expectedCardError
	 * @param expectedCardTypeError
	 * @param expectedExpirymontherror
	 * @param expectedCVVNum
	 * Date: 08-07-2022
	 */

	@Then("User should Verify the error message without selecting any fields in book hotel page as {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyTheErrorMessageWithoutSelectingAnyFieldsInBookHotelPageAsAnd(String expectedFirstNameError, String expectedLastNameError, String expectedAddressError, String expectedCardError, String expectedCardTypeError, String expectedExpirymontherror, String expectedCVVNum) {
		Assert.assertEquals(expectedFirstNameError, getText(pom.getBookHotelPage().getFirstNameError()));

		Assert.assertEquals(expectedLastNameError, getText(pom.getBookHotelPage().getLastNameError()));
		// System.out.println(pom.getBookingConfirmationPage().getAddressError().getText());
		Assert.assertEquals(expectedAddressError, getText(pom.getBookHotelPage().getAddressError()));

		Assert.assertEquals(expectedCardError, getText(pom.getBookHotelPage().getCcNumError()));
		Assert.assertEquals(expectedCardTypeError, getText(pom.getBookHotelPage().getCcTypeError()));
		Assert.assertEquals(expectedExpirymontherror, getText(pom.getBookHotelPage().getExpiryError()));
		Assert.assertEquals(expectedCVVNum, getText(pom.getBookHotelPage().getCvvNumError()));

	}
}
