package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GuestModePage;
import Pages.HomePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestHomeScreen extends TestBase {

	HomePage page;
	GuestModePage guestModePage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		page = new HomePage(driver);
		guestModePage = new GuestModePage(driver);

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

	// @Test
	// public void testHomeScreenRefresh() throws Throwable {
	// guestModePage.clickTabNow();
	// for (int i = 1; i < 5; i++) {
	// scroll("up");
	// takeScreenshot("");
	//
	// // assertVisibleWithTimer(page.map, "Insight Timer Home Screen map
	// // not dipslay correctly");
	// // assertVisibleWithTimer(page.isNumberCorrect(), "Insight Timer
	// // Home
	// // Screen online number not dipslay correctly");
	// assertVisibleWithTimer(page.logo, "Insight Timer Home Screen Logo not
	// sdipslay correctly");
	// assertVisibleWithTimer(page.homePageCellOne, "homePageCellOne is not
	// sdipslay correctly");
	//
	// }
	//
	// takeScreenshot("Map and logo");
	// }
	//
	@Test(priority = 0)
	public void testHomePageFeeds() throws Throwable {
		guestModePage.clickTabNow();
		Thread.sleep(2000);

		assertEnabledWithTimer(page.meditationNow, "meditationNow is not display correctly");
		assertEnabledWithTimer(page.addFriend, "addFriend is not display correctly");

		assertEnabledWithTimer(page.meditationToday, "meditationToday is not display correctly");

		page.clickSeeMoreFriendActivity();

	}

	@Test(priority = 2)
	public void testSeeMoreNearBy() throws Throwable {
		guestModePage.clickTabNow();
		Thread.sleep(2000);

		page.clickNearby();
		Thread.sleep(3000);
		assertEnabledWithTimer(page.nearbyCells, "see more nearby is not  display correctly ");

	}

	/*
	 * Below test need to update by iPhone and iPad, because the size different
	 * so the scroll need to change. will update later -by Helen 23-Aug-2017
	 * 
	 * @Test(priority = 1) public void testNearby() throws Throwable {
	 * guestModePage.clickTabNow(); for (int i = 1; i < 5; i++) {
	 * scroll("down");
	 * 
	 * if (page.isNearbyExist()) { break; } } takeScreenshot("");
	 * 
	 * assertVisibleWithTimer(page.nearby,
	 * "Insight Timer Home Screen Nearby not display correctly"); //
	 * page.clickNearby(); // assertVisibleWithTimer(page.verifyNearby(),
	 * "Insight Timer Home // Screen // Nearby not display correctly"); //
	 * page.clickNearbyEdit(); // page.clickDone(); // page.clickBack(); //
	 * takeScreenshot("Group NearBy");
	 * 
	 * }
	 * 
	 * @Test(priority = 2) public void testGroupOne() throws Throwable {
	 * guestModePage.clickTabNow(); for (int i = 1; i < 5; i++) {
	 * scroll("down");
	 * 
	 * if (page.isGroupOneExist()) { break; } } takeScreenshot("");
	 * assertVisibleWithTimer(page.groupOne,
	 * "Insight Timer Home Screen GroupOne not dipslay correctly"); //
	 * takeScreenshot("Group One"); }
	 * 
	 * @Test(priority = 3) public void testGroupTwo() throws Throwable {
	 * guestModePage.clickTabNow(); for (int i = 1; i < 5; i++) {
	 * scroll("down");
	 * 
	 * if (page.isGroupTwoExist()) { break; } }
	 * 
	 * assertVisibleWithTimer(page.groupTwo,
	 * "Insight Timer Home Screen  GroupTwo not dipslay correctly"); //
	 * takeScreenshot("Group Two"); }
	 * 
	 * @Test(priority = 4) public void testGroupThree() throws Throwable {
	 * guestModePage.clickTabNow(); for (int i = 1; i < 5; i++) {
	 * scroll("down");
	 * 
	 * if (page.isGroupThreeExist()) { break; } } takeScreenshot("");
	 * assertVisibleWithTimer(page.groupThree,
	 * "Insight Timer Home Screen  GroupThree not dipslay correctly"); //
	 * takeScreenshot("Group Three"); }
	 * 
	 * @Test(priority = 5) public void testGroupFour() throws Throwable {
	 * guestModePage.clickTabNow(); for (int i = 1; i < 6; i++) {
	 * scroll("down");
	 * 
	 * if (page.isGroupFourExist()) { break; } } takeScreenshot("");
	 * 
	 * assertVisibleWithTimer(page.groupFour,
	 * "Insight Timer Home Screen  GroupFour not dipslay correctly"); //
	 * takeScreenshot("Group Four"); }
	 * 
	 * @Test(priority = 6) public void testCommunity() throws Throwable {
	 * guestModePage.clickTabNow(); for (int i = 1; i < 7; i++) {
	 * scroll("down");
	 * 
	 * if (page.isCommunityExist()) { break; } } takeScreenshot("");
	 * 
	 * assertVisibleWithTimer(page.community,
	 * "Insight Timer Home Screen  Community not dipslay correctly"); //
	 * takeScreenshot("community"); }
	 */
}
