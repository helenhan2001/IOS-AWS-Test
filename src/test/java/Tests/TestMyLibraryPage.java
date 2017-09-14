package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GuestModePage;
import Pages.HomePage;

import Pages.LibraryExplorePage;
import Pages.LibraryPlayPage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.MyLibraryPage;

public class TestMyLibraryPage extends TestBase {

	LibraryExplorePage libraryExplorePage;
	MyLibraryPage myLibraryPage;
	LibrarySearchPage librarySearchPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryExplorePage = new LibraryExplorePage(driver);
		myLibraryPage = new MyLibraryPage(driver);

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
	public void testMyLibraryTeachers() throws Throwable {

		libraryExplorePage.clickTabGuided();
		assertVisibleWithTimer(libraryExplorePage.myBookmarksNumber, "MyBookmarks Number not display correct");

		assertVisibleWithTimer(libraryExplorePage.myTeachersNumber, "My Teacher Number not display correct");
		assertVisibleWithTimer(libraryExplorePage.myIntersetsNumber, "My Interest Number not display correct");

		myLibraryPage.clicMyTeachers();
		assertVisibleWithTimer(myLibraryPage.teacherNameOne, "teacherNameOne not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameTwo, "teacherNameTwo not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameThree, "teacherNameThree not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameFour, "teacherNameFour not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameFive, "teacherNameFive not display correct");

		// checkRepeatElement("Dee Ogden");
		// checkRepeatElement("Bethany Auriel-Hagan");
		// checkRepeatElement("Sacha Stewart");
		// checkRepeatElement("Paolo Carraro");
		// checkRepeatElement("Troy Dowling");

	}

	@Test(priority = 1)
	public void testMyLibraryInterest() throws Throwable {

		libraryExplorePage.clickTabGuided();

		myLibraryPage.clickMyInterests();

		assertVisibleWithTimer(myLibraryPage.myInterestsOne, "myInterestsOne not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsTwo, "myInterestsTwo not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsThree, "myInterestsThree not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsFour, "myInterestsFour not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsFive, "myInterestsFive not display correct");

		//
		// checkRepeatElement("Analytic Meditation");
		// checkRepeatElement("Emotional Healing");
		// checkRepeatElement("Focus");
		// checkRepeatElement("SOS");
		// checkRepeatElement("Relaxation Meditation");

	}

	@Test(priority = 2)
	public void testMyBookmarks() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.clickMyBookmarks();

		assertVisibleWithTimer(myLibraryPage.myBookmarksOne, "myBookmarksOne not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksTwo, "myBookmarksTwo not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksThree, "myBookmarksThree not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksFour, "myBookmarksFour not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksFive, "myBookmarksFive not display correct");
		//
		// checkRepeatElement("安睡");
		// checkRepeatElement("Pain Relief Meditation");
		// checkRepeatElement("3 Minute Quickie Guided Meditation");
		// checkRepeatElement("Permission to Relax");
		// checkRepeatElement("Guided Meditation Before Sleep");

	}
	// fix later the xpath

	// Test Teachers follow and unfollow

	@Test(priority = 3)
	public void testTeacherFollow() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("HeatherSundberg");

		// librarySearchPage.fillSearchTextField("HeatherSundberg");

		myLibraryPage.clickSearchTeacherName();

		libraryExplorePage.clickFollow();

		libraryExplorePage.clickFollowing();

		myLibraryPage.clickTeacherFollowButton();
		libraryExplorePage.clickFollowLowCase();
		libraryExplorePage.clickFollowing();

	}

}
