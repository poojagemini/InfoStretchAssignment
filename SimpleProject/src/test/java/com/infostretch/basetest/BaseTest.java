package com.infostretch.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.infostretch.dev.pagecomponents.YelpPage;
import com.infostretch.dev.utils.PropertyFileUtility;
import com.infostretch.dev.utils.WaitForUtility;

/**
 * @author Pooja
 *
 */
public class BaseTest {

	protected static WebDriver driver;
	private final YelpPage yelpPage = new YelpPage(driver);
	private final PropertyFileUtility propertyFileUtils = new PropertyFileUtility();

	@BeforeClass
	public void launchApplication() {
		driver = new FirefoxDriver();
		yelpPage.open(driver, propertyFileUtils.getPropertyValue("url"));
		WaitForUtility.waitForSeconds(driver, 20);
	}

	@AfterClass
	public void exitBrowser() {
		driver.quit();
	}

}
