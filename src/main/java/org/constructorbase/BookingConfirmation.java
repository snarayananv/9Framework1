package org.constructorbase;

import java.io.IOException;

import org.backclass.BackClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class BookingConfirmation extends BackClass {

	public BookingConfirmation() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "order_no")
	WebElement bcOrder;

	public WebElement getBcOrder() {
		return bcOrder;
	}

	public String bookingFinal() throws IOException {

		String attribute = getAttribute(bcOrder, "value");
        return attribute;
		
        

		/*
		 WebElement bcOrder = driver.findElement(By.id("order_no")); 
		 String attribute = bcOrder.getAttribute("value");
		 System.out.println(updateData("Sheet1", 1, 17, attribute)); */
		 

	}

}
