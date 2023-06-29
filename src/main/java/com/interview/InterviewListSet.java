package com.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class InterviewListSet {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement countrys = driver.findElement(By.id("country-list"));
		Select s = new Select(countrys);
		List<String> listValues = new ArrayList<String>();
		Set<String> setValues = new LinkedHashSet<String>();
	
		for (String string : setValues) {
			setValues.add(string);
		
			
		}
		System.out.println(setValues);
	}
}
