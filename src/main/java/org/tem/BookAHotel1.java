package org.tem;

import org.backclass.SampleBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel1 extends SampleBaseClass {

	public BookAHotel1() {
	
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(id = "first_name")
	WebElement first;
	
	@FindBy(id = "last_name")
	WebElement lastt;
	
	@FindBy(id = "address")
	WebElement address;
	
	@FindBy(id = "cc_num")
	WebElement ccNum;	
	
	@FindBy(id = "cc_type")
	WebElement ccType;
	
	@FindBy(id = "cc_exp_month")
	WebElement month;

	@FindBy(id = "cc_exp_year")
	WebElement year;
	
	@FindBy(id = "cc_cvv")
	WebElement ccv;

	@FindBy(id = "book_now")
	WebElement book;

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLastt() {
		return lastt;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}	
	
	public void bookAHotel12(String first,String lasst,String address,String ccNum,String ccType,String month,String year,String ccv) {

		insertValue(getFirst(), first);
		insertValue(getLastt(), lasst);
		insertValue(getAddress(), address);
		insertValue(getCcNum(), ccNum);
		selectOptionByText(getCcType(), ccType);
		selectOptionByText(getMonth(), month);
		selectOptionByText(getYear(), year);
		insertValue(getCcv(), ccv);
		click(getBook());

	}
	
	
	
		
}
