package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SearchResultsTest extends BaseTest {

	@BeforeClass
	public void searchResultsSetup() {
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void searchResultsCountTest() {
		searchResultsPage = accPage.doSearch("macbook");
		Assert.assertEquals(searchResultsPage.getSearchProductCount(), 3);
	}
	
	@Test
	public void searchResultsTest() {
		Assert.assertEquals(searchResultsPage.getSearchProductCount(), 3);
	}

}



