package com.infostretch.dev.pagecomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.infostretch.dev.pagelocators.YelpPageLocators;
import com.infostretch.dev.utils.WaitForUtility;

/**
 * @author Pooja
 *
 */
public class YelpPage extends YelpPageLocators {

	public YelpPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * @param driver
	 * @param url
	 */
	public static void open(final WebDriver driver, String url) {
		driver.get(url);
	}

	/**
	 * @param driver
	 * @param locator
	 * @param data
	 */
	public void enterKeywordsToBeSearched(WebDriver driver, By locator, String data) {
		try {
			WaitForUtility.waitForSeconds(driver, 20);
			driver.findElement(locator).sendKeys(data);
		} catch (Exception e) {
			throw new RuntimeException(
					"GetElement and entering text in " + locator.toString() + " failed: " + e.getMessage());
		}
	}

	/**
	 * @param driver
	 * @param locator
	 */
	public void click(WebDriver driver, By locator) {

		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			throw new RuntimeException(
					"Clicking on SearchButton for " + locator.toString() + " failed: " + e.getMessage());
		}

	}

	/**
	 * @param driver
	 * @param locator
	 */
	public String getText(WebDriver driver, By locator) {
		String text = "";
		try {
			text = driver.findElement(locator).getText();
		} catch (Exception e) {
			throw new RuntimeException(
					"Clicking on SearchButton for " + locator.toString() + " failed: " + e.getMessage());
		}
		return text;

	}

	/**
	 * @param driver
	 * @param locator
	 */
	public List<WebElement> getList(WebDriver driver, By locator) {

		List<WebElement> list = null;
		try {
			list = driver.findElements(locator);
		} catch (Exception e) {
			throw new RuntimeException(
					"Clicking on SearchButton for " + locator.toString() + " failed: " + e.getMessage());
		}
		return list;

	}

}
