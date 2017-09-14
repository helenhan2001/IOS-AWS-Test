package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import io.appium.java_client.pagefactory.iOSFindBy;

public class SecondLanguagePage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public SecondLanguagePage(AppiumDriver driver) {
		super(driver);

	}

	@iOSFindBy(accessibility = "English")
	public MobileElement english;

	@iOSFindBy(accessibility = "Deutsch")
	public MobileElement deutsch;
	@iOSFindBy(accessibility = "Entdecken")
	public MobileElement entdecken;
	@iOSFindBy(accessibility = "普通話")
	public MobileElement chinese;

	@iOSFindBy(accessibility = "中文")
	public MobileElement chineseDisplay;

	@iOSFindBy(accessibility = "探索")
	public MobileElement chineseExplore;

	@iOSFindBy(accessibility = "Dansk")
	public MobileElement dansk;
	@iOSFindBy(accessibility = "Opdage")
	public MobileElement opdage;

	@iOSFindBy(accessibility = "Indonesian")
	public MobileElement indonesian;

	@iOSFindBy(accessibility = "Menemukan")
	public MobileElement indonesianExplore;

	public boolean verifyEnglish() {
		if (english.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean existChineseExplore() {
		return chineseExplore.isDisplayed();
	}

	public boolean existDanskExplore() {
		return opdage.isDisplayed();
	}

	public void clickEnglish() {

		english.click();
	}

	public void clickDansk() {

		dansk.click();
	}

	public void clickIndonesian() {

		indonesian.click();
	}

	public void clickDeutsch() {

		deutsch.click();
	}

	public void clickChinese() {

		chinese.click();
	}

	public void clickChineseDisplay() {

		chineseDisplay.click();
	}

	public boolean existEntdecken() {
		return entdecken.isDisplayed();
	}

	public boolean elementExists(MobileElement element) {
		try {
			return element.isEnabled();

		} catch (Exception e) {
			return false;
		}
	}

}
