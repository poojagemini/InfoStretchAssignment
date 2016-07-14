package com.infostretch.dev.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.infostretch.dev.baseconfig.BaseConfig;

/**
 * @author Pooja
 *
 */
public class YelpPageLocators extends BaseConfig {

	public YelpPageLocators(WebDriver driver) {
		super(driver);
	}

	public YelpPageLocators(WebDriver driver, String url) {
		super(driver, url);
	}

	public final By FIND_TEXT_BOX = By.id("find_desc");
	public final By SUGGESTION_LIST_DROP_DOWN = By.xpath("//*[@class='suggestions-list']/li[1]/strong");
	public final By SEARCH_BUTTON = By.cssSelector("#header-search-submit");
	public final By PAGINATION_RESULTS = By.cssSelector(".pagination-results-window");
	public final By CLICK_FILTERS = By.cssSelector(".filter-label.all-filters-toggle.show-tooltip>span");
	public final By PRICE_FILTER = By.cssSelector(".filter-set.price-filters>ul>li:nth-of-type(1)>label>input");
	public final By FEATURES_FILTER = By.cssSelector(".filter-set.feature-filters>ul>li:nth-of-type(4)>label>input");
	public final By REVIEWS = By.cssSelector(".review-count.rating-qualifier");
	public final By SEARCH_RESULTS = By
			.cssSelector(".regular-search-result>div>div:nth-of-type(2)>div:nth-of-type(2)>p>a");
	public final By STREET_ADDRESS = By.cssSelector(".street-address>address");
	public final By PHONE_NO = By.cssSelector(".biz-phone");
	public final By WEBSITE = By.cssSelector(".biz-website>a");
	public final By REVIEW_COMMENTS = By.cssSelector(".review-content>p");

}
