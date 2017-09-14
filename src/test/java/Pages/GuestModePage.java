package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;

public class GuestModePage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public GuestModePage(AppiumDriver driver) {
		super(driver);

	}

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "landing_skip_button")
	public MobileElement skipBtn;
	// List<MobileElement> skipBtns

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "header_bowl_logo")
	public MobileElement logo;

	@iOSFindBy(accessibility = "activity_map")
	public MobileElement map;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "landing_login_button")
	public MobileElement loginBtn;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "landing-screen-logo.png")
	public MobileElement landingLogo;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Home to millions of people like you")
	public MobileElement landingMsg;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(xpath = "//*[@value='landing_login_button']")
	public MobileElement loginBtnThree;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "landing_terms_button")
	public MobileElement termsBtn;

	@iOSFindBy(accessibility = "landing_bottom_button")
	public MobileElement bottonBtn;

	@iOSFindBy(accessibility = "landing_main_button")
	public MobileElement mainBtn;

	@iOSFindBy(accessibility = "Just starting out")
	public MobileElement justStart;

	// @iOSFindBy(className = "XCUIElementTypeButton")
	// public MobileElement back;

	@iOSFindBy(accessibility = "A few months or more")
	public MobileElement fewMonth;

	@iOSFindBy(accessibility = "More than a year")
	public MobileElement moreThanYear;

	@iOSFindBy(accessibility = "I'm a teacher")
	public MobileElement aTeacher;

	@iOSFindBy(accessibility = "Explore app")
	public MobileElement exploreApp;

	// Friends Elements
	@iOSFindBy(accessibility = "nav bar invite user")
	public MobileElement landAddFriend;

	@iOSFindBy(accessibility = "Invite friends from Contacts")
	public MobileElement inviteFriendFromContact;

	@iOSFindBy(xpath = "//*[@name='Invite friends from Contacts']")
	public MobileElement inviteFriendFromContactxpath;
	@iOSFindBy(xpath = "//*[@name='Invite friends from Facebook']")
	public MobileElement inviteFriendFromFacebookxpath;

	@iOSFindBy(accessibility = "Done")
	public MobileElement doneFromInvitePage;

	@iOSFindBy(accessibility = "Invite friends from Facebook")

	public MobileElement inviteFriendFromFacebook;

	@iOSFindBy(accessibility = "Find friends on Insight")
	public MobileElement inviteFriendFromInsight;

	// HomePage

	@iOSFindBy(accessibility = "tab_now")
	public MobileElement tabNow;

	@iOSFindBy(accessibility = "Sign in")
	public MobileElement signinHomePage;

	@iOSFindBy(accessibility = "Friends")
	public MobileElement friendHomePage;

	@iOSFindBy(accessibility = "Community")
	public MobileElement community;

	public void clickTabNow() {
		tabNow.click();
	}

	public void clickSigninHomePage() {
		signinHomePage.click();
	}

	public void clickFriendHomePage() {
		friendHomePage.click();
	}

	public boolean verifyFriendHomePage() {
		return friendHomePage.isEnabled();

	}

	public void clickLandAddFriend() {
		landAddFriend.click();
	}

	public void clickInviteFriendFromContact() {
		inviteFriendFromContact.click();
	}

	public boolean existInviteFriendFromContact() {
		return inviteFriendFromContact.isEnabled();

	}

	public void doneFromInvitePage() {
		doneFromInvitePage.click();
	}

	public void clickInviteFriendFromFacebook() {
		inviteFriendFromFacebook.click();
	}

	public boolean existInviteFriendFromFacebook() {
		return inviteFriendFromFacebook.isEnabled();

	}

	public void clickInviteFriendFromInsight() {
		inviteFriendFromInsight.click();
	}

	// Home Page sign in and Nearby

	@iOSFindBy(accessibility = "Nearby")
	public MobileElement nearBy;

	// @HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
	// public MobileElement nearByField;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Done")
	public MobileElement nearByDone;

	@iOSFindBy(accessibility = "Add your location")
	public MobileElement addYourLocation;

	// Register elements
	@iOSFindBy(xpath = "//*[@value='Full Name']")
	public MobileElement fullName;

	@iOSFindBy(xpath = "//*[@value='Email']")
	public MobileElement email;

	@iOSFindBy(xpath = "//*[@value='Password']")
	public MobileElement password;

	@iOSFindBy(accessibility = "REGISTER")
	public MobileElement register;

	// Guided Page

	@iOSFindBy(accessibility = "tab_guided")
	public MobileElement tabGuided;

	@iOSFindBy(accessibility = "FEATURED")
	public MobileElement featured;
	@iOSFindBy(accessibility = "TOP 20")
	public MobileElement top20;
	@iOSFindBy(accessibility = "NEW")
	public MobileElement newGuided;

	@iOSFindBy(accessibility = "EXPLORE")
	public MobileElement explore;

	@iOSFindBy(accessibility = "PLAYLISTS")
	public MobileElement playlists;

	// Timer page
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)

	@iOSFindBy(accessibility = "tab_timer")
	public MobileElement tabTimer;

	@iOSFindBy(accessibility = "START")
	public MobileElement timerStart;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Finish early")
	public MobileElement timerFinishEarly;

	@iOSFindBy(accessibility = "DONE")
	public MobileElement timerDone;

	// @HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSFindBy(accessibility = "DONE")
	// public MobileElement timerThankedPeopleImg;

	@iOSFindBy(className = "XCUIElementTypeCell")
	public MobileElement timerFirstThanksPeopleImg;

	@iOSFindBy(accessibility = "Thanks for meditating with me")
	public MobileElement timerThanksPeopleBtn;

	// Group Page

	@iOSFindBy(accessibility = "tab_groups")
	public MobileElement tabGroups;

	@iOSFindBy(accessibility = "Sign in")
	public MobileElement groupPageSignin;

	// GuestMode Profile Page

	@iOSFindBy(accessibility = "tab_more")
	public MobileElement tabProfile;

	@iOSFindBy(accessibility = "add photo")
	public MobileElement addPhoto;

	@iOSFindBy(accessibility = "Enter your name")
	public MobileElement enterYourname;

	@iOSFindBy(accessibility = "Detailed charts and stats")
	public MobileElement detailedChatsAndStats;

	@iOSFindBy(accessibility = "DAYS")
	public MobileElement myProgressDays;

	@iOSFindBy(accessibility = "Time per Day")
	public MobileElement timePerDay;

	@iOSFindBy(accessibility = "Sessions per Day")
	public MobileElement sessionsPerDay;

	@iOSFindBy(accessibility = "WEEKS")
	public MobileElement weeks;

	@iOSFindBy(accessibility = "MONTHS")
	public MobileElement months;

	@iOSFindBy(accessibility = "ALL")
	public MobileElement allforChats;

	@iOSFindBy(accessibility = "Consecutive days - current")
	public MobileElement consecutiveDaysCurrent;

	@iOSFindBy(accessibility = "Consecutive days - best")
	public MobileElement consecutiveDaysBest;

	@iOSFindBy(accessibility = "All Time")
	public MobileElement allTime;

	@iOSFindBy(accessibility = "TIME")
	public MobileElement timeCharts;

	@iOSFindBy(accessibility = "Total")
	public MobileElement total;

	@iOSFindBy(accessibility = "Guided")
	public MobileElement guided;

	@iOSFindBy(accessibility = "Daily average")
	public MobileElement dailyAverage;

	@iOSFindBy(accessibility = "Average session duratio")
	public MobileElement averageSessionDuratio;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Longest session duratio")
	public MobileElement longestSessionDuratio;

	// Profile mile Stones Page

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Your milestones")
	public MobileElement yourMilestones;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Friends")
	public MobileElement friendsProfile;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Profile")
	public MobileElement backfromMyProgress;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(accessibility = "Log in")
	public MobileElement facebookLogin;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"  main \"/]/XCUIElementTypeTextField")
	public MobileElement facebookPassword;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	public MobileElement facebookUsername;

	// Methods

	public void loginBtn() {
		loginBtn.click();
	}

	public void fullName() {
		fullName.sendKeys("Tina Gove");
	}

	public void email() {
		email.sendKeys("tina@test.com");
	}

	public void password() {
		password.sendKeys("Password");
	}

	public void clickRegister() throws InterruptedException {
		register.click();
		Thread.sleep(300);
	}

	public void skipBtn() {
		skipBtn.click();
	}

	// public void skipBtn() {
	//
	// JavascriptExecutor jse = (JavascriptExecutor) driver;
	// jse.executeScript("arguments[0].click();", skipBtn);
	//
	// }

	public void bottonBtn() {
		bottonBtn.click();
	}

	public void termsBtn() {
		termsBtn.click();
	}

	public void mainBtn() {
		mainBtn.click();
	}

	public void justStart() {
		justStart.click();
	}

	// public void justStartOut() {
	// justStartOutTwo.click();
	// }

	public boolean verifyLandingLogoPng() {

		return landingLogo.isEnabled();

	}

	public boolean verifyMap() {
		return map.isEnabled();
	}

	public boolean verifyLogo() {
		return logo.isEnabled();

	}

	public boolean verifyExpolorApp() {
		if (exploreApp.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyLandingMsg() {
		return landingMsg.isEnabled();
	}

	public void clickExploreApp() {
		exploreApp.click();
	}

	// public void back() {
	// back.click();
	// }

	public void fewMonth() {
		fewMonth.click();
	}

	public boolean verifyMonthisDisplay() {
		return fewMonth.isDisplayed();
	}

	public boolean verifyMonthisEnable() {
		return fewMonth.isEnabled();
	}

	public void clickTeacher() {
		aTeacher.click();
	}

	public void moreThanYear() {
		moreThanYear.click();
	}

	public void clickNearby() {
		nearBy.click();
	}

	public void addYourLocation() {
		addYourLocation.click();
	}

	public void clickNearbyDone() {
		nearByDone.click();
	}

	public boolean verifyCommunity() {
		if (community.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickTabGuided() {
		tabGuided.click();
	}

	public void clickNewGuided() {
		newGuided.click();
	}

	public void clicFeatured() {
		featured.click();
	}

	public void clickPlaylistes() {
		playlists.click();
	}

	public void clickTop20() {
		top20.click();
	}

	public void clickExplore() {
		explore.click();
	}

	public boolean verifyNewGuided() {
		if (newGuided.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTop20() {
		if (top20.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyPlaylists() {
		if (playlists.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyFeatured() {
		if (featured.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyExplore() {
		if (explore.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickTabTimer() {
		tabTimer.click();
	}

	public void clickTimerStart() {
		timerStart.click();
	}

	public void clickTimerFinishEarly() {
		timerFinishEarly.click();
	}

	public void clickTimerDone() {
		timerDone.click();
	}

	public void clickFirstThanksPeopleImg() {
		timerFirstThanksPeopleImg.click();
	}

	public void clickTimerThanksPeopleBtn() {
		timerThanksPeopleBtn.click();
	}

	public void clickTabGroup() {
		tabGroups.click();
	}

	public void clickGroupPageSignin() {

		groupPageSignin.click();
	}

	// Profile
	public void clickMonths() {
		months.click();
	}

	public void clickAlls() {
		allforChats.click();
	}

	public boolean verifyConsecutiveDaysCurrent() {
		if (consecutiveDaysCurrent.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyConsecutiveDaysBest() {
		if (consecutiveDaysBest.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickTabProfile() {
		tabProfile.click();
	}

	public void myProgressDays() {
		myProgressDays.click();
	}

	public boolean verifyTimerPerDay() {
		if (timePerDay.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifySessionsPerDay() {
		if (sessionsPerDay.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickMyProgressWeeks() {
		weeks.click();
	}

	public void clickAddPhoto() {
		addPhoto.click();
	}

	public void enterYourname() {
		enterYourname.click();
	}

	public void clickDetailedChatsAndStats() {
		detailedChatsAndStats.click();
	}

	public void yourMilestones() {
		yourMilestones.click();
	}

	public void friendsProfile() {
		friendsProfile.click();
	}

	public void backfromMyProgress() {
		backfromMyProgress.click();
	}

	public void facebookPassword() {
		facebookPassword.sendKeys("1qaz@WSX");
	}

	public void facebookUsername() {
		facebookUsername.sendKeys("han.helen8@gmail.com");
	}

	public void facebookLogin() {
		facebookLogin.click();
	};

	public void waitElemetPresent(MobileElement element, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);

		wait.until(ExpectedConditions.invisibilityOf(element));

	}
}
