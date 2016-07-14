package com.infostretch.webdriver.functionaltests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.infostretch.basetest.BaseTest;
import com.infostretch.dev.dataproviders.DataProviders;
import com.infostretch.dev.pagecomponents.YelpPage;
import com.infostretch.dev.utils.TesterInfo;

public class TestYelp extends BaseTest {

	private final YelpPage yelpPage = new YelpPage(driver);

	@TesterInfo(OWNER = "Pooja")
	@Test(dataProvider = "keywords", dataProviderClass = DataProviders.class)
	public void testYelpUseCase(String keywords) {
		yelpPage.enterKeywordsToBeSearched(driver, yelpPage.FIND_TEXT_BOX, "Rest");
		yelpPage.click(driver, yelpPage.SUGGESTION_LIST_DROP_DOWN);
		yelpPage.click(driver, yelpPage.SEARCH_BUTTON);
		yelpPage.enterKeywordsToBeSearched(driver, yelpPage.FIND_TEXT_BOX, " "+keywords);
		yelpPage.click(driver, yelpPage.SEARCH_BUTTON);
		String totalSearchResults = yelpPage.getText(driver, yelpPage.PAGINATION_RESULTS);
		Reporter.log("Total No Of Search Results" + totalSearchResults);
		yelpPage.click(driver, yelpPage.CLICK_FILTERS);
		yelpPage.click(driver, yelpPage.PRICE_FILTER);
		yelpPage.click(driver, yelpPage.FEATURES_FILTER);
		String totalResultsAfterFiltering = yelpPage.getText(driver, yelpPage.PAGINATION_RESULTS);
		Reporter.log("Total No Of Search Results" + totalResultsAfterFiltering);
		// Star Rating
		List<WebElement> listOfAllRatings = yelpPage.getList(driver, yelpPage.REVIEWS);
		for (int i = 0; i < listOfAllRatings.size(); i++) {
			Reporter.log("Star rating" + listOfAllRatings.get(i).getText());
		}
		List<WebElement> listOfAllSearchResults = yelpPage.getList(driver, yelpPage.SEARCH_RESULTS);

		// First Search Result Read More
		listOfAllSearchResults.get(1).click();

		String streetAddress = yelpPage.getText(driver, yelpPage.STREET_ADDRESS);
		Reporter.log("Street Address" + streetAddress);

		String phoneNo = yelpPage.getText(driver, yelpPage.PHONE_NO);
		Reporter.log("Phone No" + phoneNo);

		String webSite = yelpPage.getText(driver, yelpPage.WEBSITE);
		Reporter.log("WebSite" + webSite);

		List<WebElement> firstThreeCustomerReviews = yelpPage.getList(driver, yelpPage.REVIEW_COMMENTS);
		for (int i = 1; i <= 3; i++) {
			Reporter.log(firstThreeCustomerReviews.get(i).getText());
		}

	}

}
