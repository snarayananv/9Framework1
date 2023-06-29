package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IphoneAmazon {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
		txt.sendKeys("iphone");
		WebElement cli = driver.findElement(By.id("nav-search-submit-button"));
		cli.click();

		List<WebElement> list = driver
				.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));

		File file = new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\excel sheet\\Book.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Datas");

		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			String text = element.getText();
			System.out.println(text);

			Row r = s.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(text);
		}

		FileOutputStream f1 = new FileOutputStream(file);

		w.write(f1);

		System.out.println("Done");

	}
}
