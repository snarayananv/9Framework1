package org.tem;

import org.backclass.SampleBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel1 extends SampleBaseClass {
	
	public SearchHotel1() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	WebElement ddLocation;

	@FindBy(id = "hotels")
	WebElement ddHotels;

	@FindBy(id = "room_type")
	WebElement ddType;

	@FindBy(id = "room_nos")
	WebElement ddRoomNo;

	@FindBy(id = "adult_room")
	WebElement ddAduld;

	@FindBy(id = "child_room")
	WebElement ddChild;

	@FindBy(id = "Submit")
	WebElement ddSubmit;

	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotels() {
		return ddHotels;
	}

	public WebElement getDdType() {
		return ddType;
	}

	public WebElement getDdRoomNo() {
		return ddRoomNo;
	}

	public WebElement getDdAduld() {
		return ddAduld;
	}

	public WebElement getDdChild() {
		return ddChild;
	}

	public WebElement getDdSubmit() {
		return ddSubmit;
	}

	public void searchHotel(String ddLoca, String ddHotel, String ddType, String ddRoom, String ddAdult,
			String ddChild) {

		selectOptionByText(getDdLocation(), ddLoca);
		selectOptionByText(getDdHotels(), ddHotel);
		selectOptionByText(getDdRoomNo(), ddRoom);
		selectOptionByText(getDdRoomNo(), ddRoom);
		selectOptionByText(getDdAduld(), ddAdult);
		selectOptionByText(getDdChild(), ddChild);
		click(getDdSubmit());

	}
}
