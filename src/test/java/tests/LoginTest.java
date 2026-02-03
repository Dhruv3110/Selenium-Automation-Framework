package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExcelUtils;
import utils.ExtentReportManager;
import utils.Log;

// ------------------------------------------------------
// LoginTest Class (Only Pure Test Scripts)
// Demonstrates Different TestNG Testing Approaches
// ------------------------------------------------------
public class LoginTest extends BaseTest {

	// ======================================================
	// Approach 1: Data Driven Testing Using Excel File
	// (Excel DataProvider + Test Case Together)
	// ======================================================
	
	// @DataProvider(name = "LoginData")
	// public Object[][] getLoginData() throws IOException {

	// 	String filePath = System.getProperty("user.dir") + "/testData/TestData.xlsx";

	// 	ExcelUtils.loadExcel(filePath, "Sheet1");

	// 	int rowCount = ExcelUtils.getRowCount();
	// 	Object[][] data = new Object[rowCount - 1][2];

	// 	for (int i = 1; i < rowCount; i++) {
	// 		data[i - 1][0] = ExcelUtils.getCellData(i, 0); // username
	// 		data[i - 1][1] = ExcelUtils.getCellData(i, 1); // password
	// 	}

	// 	ExcelUtils.closeExcel();
	// 	return data;
	// }

	// @Test(dataProvider = "LoginData")
	// public void testValidLogin_ExcelData(String username, String password) {

	// 	Log.info("Starting login test...");
	// 	test = ExtentReportManager.createTest("Login Test - " + username);

	// 	test.info("Navigating to URL..");
	// 	LoginPage loginPage = new LoginPage(driver);

	// 	Log.info("Adding credentials...");
	// 	test.info("Adding credentials..");

	// 	loginPage.enterUserName(username);
	// 	loginPage.enterPassword(password);

	// 	test.info("Clicking on Login Button");
	// 	loginPage.clickLogin();

	// 	System.out.println("Title of the Page: " + driver.getTitle());

	// 	Log.info("Verifying Page title...");
	// 	test.info("Verifying Page Title...");

	// 	Assert.assertEquals(driver.getTitle(), "Just a moment...");

	// 	test.pass("Login Successful.");
	// }
	

	// ======================================================
	// Approach 2: Data Driven Testing Using Hardcoded Inline Data
	// (DataProvider + Test Case Together)
	// ======================================================
	/*
	@DataProvider(name = "LoginData2")
	public Object[][] getData() {

		return new Object[][] {
			{ "user1", "pass1" },
			{ "user2", "pass2" },
			{ "user3", "pass3" }
		};
	}

	@Test(dataProvider = "LoginData2")
	public void testValidLogin_HardcodedData(String username, String password) {

		Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test - " + username);

		test.info("Navigating to URL..");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials...");
		test.info("Adding credentials..");

		loginPage.enterUserName(username);
		loginPage.enterPassword(password);

		test.info("Clicking on Login Button");
		loginPage.clickLogin();

		System.out.println("Title of the Page: " + driver.getTitle());

		Log.info("Verifying Page title...");
		test.info("Verifying Page Title...");

		Assert.assertEquals(driver.getTitle(), "Just a moment...");

		test.pass("Login Successful.");
	}
	*/

	// ======================================================
	// Approach 3: Parameterization Using TestNG XML (@Parameters)
	// ======================================================
	// @Test
	// @Parameters({ "username", "password" })
	// public void testValidLogin_XMLParameters(String username, String password) {

	// 	Log.info("Starting login test...");
	// 	test = ExtentReportManager.createTest("Login Test - " + username);

	// 	test.info("Navigating to URL..");
	// 	LoginPage loginPage = new LoginPage(driver);

	// 	Log.info("Adding credentials...");
	// 	test.info("Adding credentials..");

	// 	loginPage.enterUserName(username);
	// 	loginPage.enterPassword(password);

	// 	test.info("Clicking on Login Button");
	// 	loginPage.clickLogin();

	// 	System.out.println("Title of the Page: " + driver.getTitle());

	// 	Log.info("Verifying Page title...");
	// 	test.info("Verifying Page Title...");

	// 	Assert.assertEquals(driver.getTitle(), "Just a moment...");

	// 	test.pass("Login Successful.");
	// }

	// ======================================================
	// Approach 4: Simple Login Test Without DataProvider (Static Data)
	// ======================================================
	
	@Test
	public void testValidLogin_StaticData() {

		Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test - Static Data");

		test.info("Navigating to URL..");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials...");
		test.info("Adding credentials..");

		loginPage.enterUserName("admin@yourstore.com");
		loginPage.enterPassword("admin");

		test.info("Clicking on Login Button");
		loginPage.clickLogin();

		System.out.println("Title of the Page: " + driver.getTitle());

		Log.info("Verifying Page title...");
		test.info("Verifying Page Title...");

		Assert.assertEquals(driver.getTitle(), "Just a moment...");

		test.pass("Login Successful.");
	}
	

	// ======================================================
	// Approach 5: Negative Testing with Invalid Credentials
	// ======================================================
	/*
	@Test
	public void testLoginWithInvalidCredentials() {

		Log.info("Starting invalid login test...");
		test = ExtentReportManager.createTest("Login Test - Invalid Credentials");

		test.info("Navigating to URL..");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding invalid credentials...");
		test.info("Adding invalid credentials..");

		loginPage.enterUserName("wrongUser@gmail.com");
		loginPage.enterPassword("wrongPassword");

		test.info("Clicking on Login Button");
		loginPage.clickLogin();

		System.out.println("Title of the Page: " + driver.getTitle());

		Log.info("Verifying Page title...");
		test.info("Verifying Page Title...");

		Assert.assertEquals(driver.getTitle(), "Just a moment...");

		test.pass("Invalid Login Test Completed.");
	}
	*/
}
