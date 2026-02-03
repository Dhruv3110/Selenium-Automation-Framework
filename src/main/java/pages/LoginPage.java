package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Log;

public class LoginPage {

	private WebDriver driver;

	// Elements Using @FindBy

	@FindBy(id = "Email")
	WebElement usernameTextbox;

	@FindBy(id = "Password")
	WebElement passwordTextbox;

	@FindBy(xpath = "//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions Using @FindBy

	public void enterUserName(String username) {
		Log.info("Entering Username: " + username);
		usernameTextbox.clear();
		usernameTextbox.sendKeys(username);
	}

	public void enterPassword(String password) {
		Log.info("Entering password: " + password);
		passwordTextbox.clear();
		passwordTextbox.sendKeys(password);
	}

	public void clickLogin() {
		Log.info("Clicking Login Button...");
		loginButton.click();
	}

	// Alternative Method (Using By Locators)

	// Locators of the Elements
//    private By userNameTextBox = By.id("Email");
//    private By passwordTextBox = By.id("Password");
//    private By loginBtn = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");

	// Actions Using Locators

//    public void enterUserNameUsingLocator(String username) {
//        Log.info("Entering Username: " + username);
//        driver.findElement(userNameTextBox).clear();
//        driver.findElement(userNameTextBox).sendKeys(username);
//    }

//    public void enterPasswordUsingLocator(String password) {
//        Log.info("Entering password: " + password);
//        driver.findElement(passwordTextBox).clear();
//        driver.findElement(passwordTextBox).sendKeys(password);
//    }

//    public void clickLoginUsingLocator() {
//        Log.info("Clicking Login Button...");
//        driver.findElement(loginBtn).click();
//    }

}
