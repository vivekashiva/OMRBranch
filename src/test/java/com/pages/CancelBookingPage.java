package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.ReusableCode;

/**
 * 
 * @author Ms
 *
 */

public class CancelBookingPage extends ReusableCode {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_id_text")
	private WebElement searchOrderID;

	@FindBy(id="search_hotel_id")
	private WebElement clickGo;

	@FindBy(id="check_all")
	private WebElement clickCheckBox;

	@FindBy(xpath="//input[contains(@id,'btn_id_')]")
	private WebElement clickCancel;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedHistory;
	
	@FindBy (xpath="//label[contains(text(),'cancelled')]")
	private WebElement cancelBookingSuccess;

	public WebElement getCancelBookingSuccess() {
		return cancelBookingSuccess;
	}

	public WebElement getBookedHistory() {
		return bookedHistory;
	}

	public WebElement getSearchOrderID() {
		return searchOrderID;
	}

	public WebElement getClickGo() {
		return clickGo;
	}

	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}

	public WebElement getClickCancel() {
		return clickCancel;
	}

	public void cancelBook(String searchID) throws Exception {
		type(getSearchOrderID(), searchID);
		click(getClickGo());
		click(getClickCheckBox());
		click(getClickCancel());
		acceptAlert();
	}

	public void cancelExistingOrder(String searchID) {
		click(getBookedHistory());
		type(getSearchOrderID(), searchID);
		click(getClickGo());
		click(getClickCheckBox());
		click(getClickCancel());
		acceptAlert();
	}
}

