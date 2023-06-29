package org.constructorbase;

import org.backclass.BackClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BackClass {

	public SelectHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	WebElement ddSelectHotel;

	@FindBy(id = "continue")
	WebElement ddContinue;

	public WebElement getDdSelectHotel() {
		return ddSelectHotel;
	}

	public WebElement getDdContinue() {
		return ddContinue;
	}

	public void selectHotelFinal() {

		click(ddSelectHotel);
		click(ddContinue);

	}

}
