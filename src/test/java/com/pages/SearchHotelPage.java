package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.ReusableCode;

public class SearchHotelPage extends ReusableCode{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	//Search hotel by selecting all fields
	@FindBy (id="location")
	private WebElement dDnLocation;

	@FindBy (id="hotels")
	private WebElement dDnHotels;

	@FindBy (id="room_type")
	private WebElement dDnRoomType;

	@FindBy (id="room_nos")
	private WebElement dDnRoomNo;

	@FindBy (id="datepick_in")
	private WebElement txtCheckInDate;

	@FindBy (id="datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy (id="adult_room")
	private WebElement dDnAdultsPerRoom;

	@FindBy (id="child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy (id="Submit")
	private WebElement btnSearch;

	@FindBy (xpath="//td[@class='login_title']")
	private WebElement txtSelconfirmMessage;

	@FindBy (id="checkin_span")
	private WebElement checkInError;

	@FindBy (id="checkout_span")
	private WebElement checkOutError;

	@FindBy (id="location_span")
	private WebElement locationError;

	public WebElement getLocationError() {
		return locationError;
	}

	public WebElement getCheckInError() {
		return checkInError;
	}

	public WebElement getCheckOutError() {
		return checkOutError;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getTxtSelconfirmMessage() {
		return txtSelconfirmMessage;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void searchHotels(String location, String Hotels, String Room_Type, String room_nos, String datepick_in, String datepick_out, String adult_room, String child_room) {

		selectOptionsByText(getdDnLocation(), location);
		selectOptionsByText(getdDnHotels(), Hotels);
		selectOptionsByText(getdDnRoomType(), Room_Type);
		selectOptionsByText(getdDnRoomNo(), room_nos);
		txtClear(getTxtCheckInDate());
		type(getTxtCheckInDate(), datepick_in);
		txtClear(getTxtCheckOutDate());
		type(getTxtCheckOutDate(), datepick_out);
		selectOptionsByText(getdDnAdultsPerRoom(), adult_room);
		selectOptionsByText(getdDnChildrenPerRoom(), child_room);
		click(getBtnSearch());

	}

	//Search hotel page by only entering mandatory fields 
	public void searchHotels(String location,String room_nos,String datepick_in, String datepick_out, String adult_room) {
		selectOptionsByText(getdDnLocation(), location);
		selectOptionsByText(getdDnRoomNo(), room_nos);
		type(getTxtCheckInDate(), datepick_in);
		type(getTxtCheckOutDate(), datepick_out);
		selectOptionsByText(getdDnAdultsPerRoom(), adult_room);
		click(getBtnSearch());
	}

	//Search hotel page without entering any data
	public void searchHotels() {
		click(getBtnSearch());

	}
}
