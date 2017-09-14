package Tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DiscoveryInterestGroupsPage;
import Pages.GuestModePage;
import Pages.HomePage;

import Pages.LibraryExplorePage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.MyLibraryPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestLibrarySearchFilterSortPage extends TestBase {

	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	MyLibraryPage myLibraryPage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		myLibraryPage = new MyLibraryPage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {

	}

	@BeforeMethod

	public void BeforeTestMethod() throws Throwable {
		tryLogin();
	}

	@AfterMethod

	public void AfterTestMethod() {

	}

	@Test(priority = 1)
	public void testFilterSortingFiveMins() throws Throwable {
		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickFiveMins();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.searchFirstResults, "searchFirstResults is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 2)
	public void testFilterSortingTenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickTenMins();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.searchFirstResults, "searchFirstResults is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 3)
	public void testFilterSortingFifteenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickFifteenMins();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 4)
	public void testFilterSortingTwentyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickTwentyMins();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 5)
	public void testFilterSortingThirtyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickThirtyMins();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 6)
	public void testFilterSortingThirtyPlusMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickThirtyPlusMins();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 7)
	public void testFilterSortingMaleOnly() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement maleOnly = Radios.get(0);

		maleOnly.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 8)
	public void testFilterSortingFamaleOnly() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement femaleOnly = Radios.get(1);

		femaleOnly.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 9)
	public void testFilterSortingWithBackMusic() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement withBack = Radios.get(2);

		withBack.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

	@Test(priority = 10)
	public void testFilterSortingWithoutBackMusic() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickListAll();

		Thread.sleep(3000);
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement without = Radios.get(3);

		without.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.mostPlayed, "mostPlayed is not sdipslay correctly");

	}

}
