package org.backclass;

import java.io.Closeable;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseBaseClass {
	public WebDriver driver;

	// WebDriver: I
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void close() {
		driver.close();
	}

	public Options manage() {
		Options manage = driver.manage();
		return manage;
	}

	public TargetLocator switchTo() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	public String windowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	// WebElements

	public void sendKeys(WebElement e, String data) {
		e.sendKeys(data);

	}

	public void click(WebElement e) {
		e.click();

	}

	public String getText(WebElement e, String data) {
		String text = e.getText();
		return text;
	}

	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public boolean isDisplayed(WebElement e, boolean d) {
		boolean displayed = e.isDisplayed();
		return displayed;
	}

	public boolean isEnabled(WebElement e, boolean d) {
		boolean enabled = e.isEnabled();
		return enabled;
	}

	// Navigate

	public Navigation navigate() {
		Navigation navigate = driver.navigate();
		return navigate;
	}

	public void back() {

		navigate().back();

	}

	public void refresh() {

		navigate().refresh();

	}

	public void forward() {

		navigate().forward();

	}

	public void to(String data) {

		navigate().to(data);
	}

	// Select
	public Select selectByValue(WebElement e, String data) {
		Select s = new Select(e);
		s.selectByValue(data);
		return s;
	}

	public Select selectVisibleText(WebElement e, String data) {
		Select s = new Select(e);
		s.selectByVisibleText(data);
		return s;
	}

	public Select selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
		return s;
	}

	public Select deSelectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);
		return s;
	}

	public Select deSelectByValue(WebElement e, String data) {
		Select s = new Select(e);
		s.deselectByValue(data);
		return s;
	}

	public Select deSelectByVisibleText(WebElement e, String text) {
		Select s = new Select(e);
		s.deselectByVisibleText(text);
		return s;
	}

	public Select deSelectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
		return s;
	}

	// Select 1

	public Select getOptions(WebElement e) {

		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		return s;
	}

	public Select isMultiple(WebElement e) {

		Select s = new Select(e);
		boolean multiple = s.isMultiple();
		return s;
	}

	public Select getSelectedAllOption(WebElement e) {

		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return s;
	}

	public Select getFirstSelectedOption(WebElement e) {

		Select s = new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return s;
	}

	// Alert

	public Alert switchToAlert() {

		Alert al = driver.switchTo().alert();
		return al;
	}

	public void accept() {

		Alert al = switchToAlert();
		al.accept();
	}

	public void dissmiss() {

		Alert al = switchToAlert();
		al.dismiss();
	}

	public void sendkeys(String data) {
		switchToAlert().sendKeys(data);

	}

	public String getText() {
		Alert al = switchToAlert();
		String text = al.getText();
		return text;

	}

	// Frames

	public void frames(String name) {

		driver.switchTo().frame(name);

	}

	public void frames1(String id) {

		driver.switchTo().frame(id);

	}

	public void frames(int index) {

		driver.switchTo().frame(index);

	}

	public void frames(WebElement refName) {

		driver.switchTo().frame(refName);

	}

	// Actions

	public void moveToElement(WebElement e) {

		Actions actions = new Actions(driver);
		actions.moveToElement(e);
	}

	public void contextClick(WebElement e) {
		Actions actions = new Actions(driver);
		actions.contextClick(e).perform();
	}

	public void doubleclick(WebElement e) {

		Actions actions = new Actions(driver);
		actions.doubleClick(e).perform();
	}

	public void dragAnddrop(WebElement source, WebElement target) {

		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void keyUp(WebElement e, CharSequence k) {

		Actions actions = new Actions(driver);
		actions.keyDown(e, k).perform();
	}

	public void keyDown(WebElement e, CharSequence key) {

		Actions actions = new Actions(driver);
		actions.keyDown(e, key).perform();

	}

}