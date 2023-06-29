package org.tem;

import org.backclass.SampleBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel1 extends SampleBaseClass {

	public SelectHotel1() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	WebElement ddSelectHotel;

	@FindBy(id = "continue")
	WebElement submit;

	public WebElement getDdSelectHotel() {
		return ddSelectHotel;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void selectHotel1() {

		click(getDdSelectHotel());
		click(getSubmit());

	}

}
