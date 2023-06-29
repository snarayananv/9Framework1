package org.constructorbase;

import org.backclass.BackClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class BookAHotel extends BackClass {

	public BookAHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	WebElement txtFirstName;

	@FindBy(id = "last_name")
	WebElement txtLastWord;

	@FindBy(id = "address")
	WebElement txtAddress;

	@FindBy(id = "cc_num")
	WebElement ddCcNum;

	@FindBy(id = "cc_type")
	WebElement ddCcType;

	@FindBy(id = "cc_exp_month")
	WebElement ddExpMon;

	@FindBy(id = "cc_exp_year")
	WebElement ddExpYear;

	@FindBy(id = "cc_cvv")
	WebElement ddCvv;

	@FindBy(id = "book_now")
	WebElement ddBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastWord() {
		return txtLastWord;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getDdCcNum() {
		return ddCcNum;
	}

	public WebElement getDdCcType() {
		return ddCcType;
	}

	public WebElement getDdExpMon() {
		return ddExpMon;
	}

	public WebElement getDdExpYear() {
		return ddExpYear;
	}

	public WebElement getDdCvv() {
		return ddCvv;
	}

	public WebElement getDdBook() {
		return ddBook;
	}

	public void bookHotelFinal(String txtFirstName, String txtLastWord, String txtAddress, String ddCcnum,
			String ddCcType, String ddExpMon, String ddExpYear, String ddCvv) {

		insertValue(getTxtFirstName(), txtFirstName);
		insertValue(getTxtLastWord(), txtLastWord);
		insertValue(getTxtAddress(), txtAddress);
		insertValue(getDdCcNum(), ddCcnum);
		selectOptionByText(getDdCcType(), ddCcType);
		selectOptionByText(getDdExpMon(), ddExpMon);
		selectOptionByText(getDdExpYear(), ddExpYear);
		insertValue(getDdCvv(), ddCvv);
		click(ddBook);

	}

}
