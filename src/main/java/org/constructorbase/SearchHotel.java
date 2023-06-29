package org.constructorbase;

import org.backclass.BackClass;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BackClass {

	public SearchHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	WebElement ddLoct;

	@FindBy(id = "hotels")
	WebElement ddHotels;

	@FindBy(id = "room_type")
	WebElement ddRoom;

	@FindBy(id = "room_nos")
	WebElement ddRooms;

	@FindBy(id = "adult_room")
	WebElement ddAduld;

	@FindBy(id = "child_room")
	WebElement ddChild;

	@FindBy(id = "Submit")
	WebElement ddSubmit;

	public WebElement getDdLoct() {
		return ddLoct;
	}

	public WebElement getDdHotels() {
		return ddHotels;
	}

	public WebElement getDdRoom() {
		return ddRoom;
	}

	public WebElement getDdRoomsno() {
		return ddRooms;
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

	public void searchHotelFinal(String location, String hotels, String room_type, String room_nos, String adult_room,
			String child_room) {

		selectOptionByText(getDdLoct(), location);
		selectOptionByText(getDdHotels(), hotels);
		selectOptionByText(getDdRoom(), room_type);
		selectOptionByText(getDdRoomsno(), room_nos);
		selectOptionByText(getDdAduld(), adult_room);
		selectOptionByText(getDdChild(), child_room);
		click(ddSubmit);
	}

}
