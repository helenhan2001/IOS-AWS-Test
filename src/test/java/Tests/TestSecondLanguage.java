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
import Pages.SecondLanguagePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestSecondLanguage extends TestBase {

	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	SecondLanguagePage secondLanguagePage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;
	LoginPage loginPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		secondLanguagePage = new SecondLanguagePage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
		loginPage = new LoginPage(driver);
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

	@Test(priority = 0)
	public void testSecondLanguageDeutsch() throws Throwable {

		libraryExplorePage.clickTabGuided();

		Thread.sleep(2000);

		secondLanguagePage.clickEnglish();
		secondLanguagePage.clickDeutsch();
		Thread.sleep(2000);

		assertVisibleWithTimer(secondLanguagePage.entdecken, "Entdecken not display correct");
		secondLanguagePage.clickDeutsch();
		secondLanguagePage.clickChinese();
		Thread.sleep(2000);
		assertVisibleWithTimer(secondLanguagePage.chineseExplore, "ChineseExplore not display correct");

		secondLanguagePage.clickChineseDisplay();
		secondLanguagePage.clickDansk();
		Thread.sleep(2000);
		assertVisibleWithTimer(secondLanguagePage.opdage, "DanskExplore not display correct");

		secondLanguagePage.clickDansk();
		secondLanguagePage.clickIndonesian();
		Thread.sleep(2000);
		assertVisibleWithTimer(secondLanguagePage.indonesianExplore, "indonesianExplore not display correct");

		secondLanguagePage.clickIndonesian();
		secondLanguagePage.clickEnglish();

	}

	// @Test(priority = 1)
	// public void testSecondLanguageChinese() throws Throwable {
	//
	// libraryExplorePage.clickTabGuided();
	//
	// Thread.sleep(2000);
	//
	// secondLanguagePage.clickEnglish();
	// secondLanguagePage.clickChinese();
	// Thread.sleep(2000);
	//
	// assertVisibleWithTimer(secondLanguagePage.chineseExplore, "exist
	// ChineseExplore not display correct");
	//
	// }
	//
	// @Test(priority = 2)
	// public void testSecondLanguageDansk() throws Throwable {
	// loginPage.LogoutApp();
	// loginPage.LoginApp();
	//
	// libraryExplorePage.clickTabGuided();
	//
	// Thread.sleep(2000);
	//
	// secondLanguagePage.clickEnglish();
	// secondLanguagePage.clickDansk();
	// Thread.sleep(2000);
	//
	// assertVisibleWithTimer(secondLanguagePage.deutsch, "exist DanskExplore
	// not display correct");
	//
	// }

}
