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
import Pages.TimerPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestTimerPage extends TestBase {

	TimerPage timerPage;
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
		timerPage = new TimerPage(driver);

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
	public void testTimer() throws Throwable {

		timerPage.clickTimerBtn();

		Thread.sleep(2000);

		assertVisibleWithTimer(timerPage.duration, "duration is not display correct");
		assertVisibleWithTimer(timerPage.timerStart, "Timer start is not display correct");
		assertVisibleWithTimer(timerPage.intervalbells, "intervalbells is not display correct");
		assertVisibleWithTimer(timerPage.ambientSound, "ambientSound  is not display correct");
		assertVisibleWithTimer(timerPage.endingbell, "ambientSound  is not display correct");

		Thread.sleep(2000);

		timerPage.clickTimerStart();
		Thread.sleep(5000);

		timerPage.clickPlayPauseButton();

		timerPage.clickFinishEarlyTwo();
		timerPage.clickFinishMeditation();
		Thread.sleep(5000);
		timerPage.clickDoneButton();
		Thread.sleep(3000);
		timerPage.clickTimerCloseButton();
		Thread.sleep(3000);

		// loginPage.LoginApp();
		// loginPage.LoginAppUserTwo();
		// assertVisibleWithTimer(timerPage.homeMeditaionMsg, "Helen
		// homeMeditaionMsg is not display correct");

	}

}
