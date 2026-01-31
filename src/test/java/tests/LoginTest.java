package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

//	Only pure test scripts
public class LoginTest extends BaseTest {
//	Create a test function
	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		System.out.println("Title of the Page: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
