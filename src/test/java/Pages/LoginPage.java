package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public LoginPage(AppiumDriver driver) {
		super(driver);
	}

	@iOSFindBy(accessibility = "Login")
	public MobileElement buttonLogin;

	@iOSFindBy(accessibility = "landing_login_button")
	public MobileElement guestLogin;

	@iOSFindBy(xpath = "//*[@value='Email']")
	public MobileElement email;

	@iOSFindBy(xpath = "//*[@value='Password']")
	public MobileElement password;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement homeLogin;

	// Logout

	@iOSFindBy(accessibility = "tab_more")
	public MobileElement tabMore;

	@iOSFindBy(accessibility = "settings button")
	public MobileElement settingsButton;

	// @iOSFindBy(className = "XCUIElementTypeButton")
	// public List<IOSElement> profilePafeButtons;
	// public MobileElement settingBtn = profilePafeButtons.get(4);

	@iOSFindBy(accessibility = "Logout")
	public MobileElement logout;

	@iOSFindBy(accessibility = "OK")
	public MobileElement okLogout;

	public void clickSettingsButton() {

		settingsButton.click();
	}

	public void clickTabMore() {

		tabMore.click();
	}

	public void clickLogout() {
		logout.click();
	}

	public void clickOkLogout() {
		okLogout.click();
	}

	public void LoginApp() {

		guestLogin.click();
		email.sendKeys("han.helen8+02@gmail.com");
		password.sendKeys("Passw0rd");
		homeLogin.click();

	}

	public void LoginAppUserTwo() {

		guestLogin.click();
		email.sendKeys("helen@insight.co");
		password.sendKeys("Passw0rd");
		homeLogin.click();

	}

	public void LogoutApp() {

		tabMore.click();
		settingsButton.click();
		logout.click();
		okLogout.click();

	}

}
