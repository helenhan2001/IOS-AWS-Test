package Pages;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TimerPage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public TimerPage(IOSDriver<IOSElement> driver) {
		super(driver);
	}

	@iOSFindBy(accessibility = "tab_timer")
	public MobileElement timerBtn;
	@iOSFindBy(accessibility = "Duration")
	public MobileElement duration;
	@iOSFindBy(accessibility = "Interval bells")
	public MobileElement intervalbells;
	@iOSFindBy(accessibility = "Ambient sound")
	public MobileElement ambientSound;
	@iOSFindBy(accessibility = "Ending bell")
	public MobileElement endingbell;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	public MobileElement pauseBell;

	@iOSFindBy(accessibility = "Finish early")
	public MobileElement finishEarly;

	@iOSFindBy(accessibility = "Done")
	public MobileElement done;

	@iOSFindBy(accessibility = "START")
	public MobileElement timerStart;

	@iOSFindBy(accessibility = "play_pause_button")
	public MobileElement playPauseButton;

	@iOSFindBy(accessibility = "finish_early")
	public MobileElement finishEarlyTwo;

	@iOSFindBy(accessibility = "finish_meditation")
	public MobileElement finishMeditation;

	@iOSFindBy(accessibility = "dont_log")
	public MobileElement dontLog;

	@iOSFindBy(accessibility = "done_button")
	public MobileElement doneButton;

	// @iOSFindBy(accessibility = "bar_button_close")
	@iOSFindBy(xpath = "//*[@name='bar_button_close']")
	public MobileElement barButtonClose;

	@iOSFindBy(accessibility = "close button")
	public MobileElement timerCloseButton;

	//
	// @iOSFindBy(className = "XCUIElementTypeButton")
	// public List<IOSElement> doneButtons;
	// public MobileElement closeTimer = doneButtons.get(2);

	// Andorid
	@iOSFindBy(xpath = "/XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public MobileElement peopleImgOne;
	//
	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/timer_help")
	public MobileElement timerHelp;

	@iOSFindBy(xpath = "//android.widget.TextView[@text='TIMER']")
	public MobileElement timerLable;

	@iOSFindBy(xpath = "//android.widget.TextView[@text='PRESETS']")
	public MobileElement timerPresets;

	@iOSFindBy(xpath = "//android.widget.TextView[@text='Starting bell']")
	public MobileElement timerBell;

	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/icon")
	public MobileElement timerIcon;

	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/configuration_representation")
	public MobileElement timerConfig;

	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/tab_timer")
	public MobileElement timerTab;

	@iOSFindBy(accessibility = "helenitqa meditated for 1 min with the Timer")
	public MobileElement homeMeditaionMsg;

	public void clickTimerBtn() {
		timerBtn.click();
	}

	public void clickTimerStart() {
		timerStart.click();
	}

	public void clickTimerPause() {
		pauseBell.click();
	}

	public void clickBarButtonClose() {
		barButtonClose.click();
	}

	public void clickFinishEarly() {
		finishEarly.click();
	}

	public void clickDone() {
		done.click();
	}

	public void clickPlayPauseButton() {
		playPauseButton.click();
	}

	public void clickFinishEarlyTwo() {
		finishEarlyTwo.click();
	}

	public void clickFinishMeditation() {
		finishMeditation.click();
	}

	public void clickDontLog() {
		dontLog.click();
	}

	public void clickDoneButton() {
		doneButton.click();
	}

	public void clickTimerCloseButton() {
		timerCloseButton.click();
	}

	//
	// public void clickCloseTimer() {
	// closeTimer.click();
	// }

	//
	public boolean verifyTimerhelp() {
		if (timerHelp.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTimerLable() {
		if (timerLable.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTimerPresets() {
		if (timerPresets.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTimerBell() {
		if (timerBell.isDisplayed())
			return true;
		else
			return false;

	}

	public boolean verifyTimerIcon() {
		if (timerIcon.isDisplayed())
			return true;
		else
			return false;

	}

	public boolean verifyTimerConfig() {
		if (timerConfig.isDisplayed())
			return true;
		else
			return false;
	}

	// public void selectImageThree() {
	// ambientImageThree.click();
	// }

	public void waitElemetPresent(MobileElement element, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);

		wait.until(ExpectedConditions.invisibilityOf(element));

	}
}
