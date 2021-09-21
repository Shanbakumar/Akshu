package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	@FindBy(id = "name")
	WebElement txt_username;
	@FindBy(id = "password")
	WebElement txt_password;
	@FindBy(id = "login")
	WebElement btn_login;
	@FindBy(id = "logout")
	WebElement btn_logout;
	
	WebDriver drive;
public LoginPage_PF(WebDriver drive) {
	this.drive = drive;
	PageFactory.initElements(drive, this);
}
public void enterUsername(String username) {
	txt_username.sendKeys(username);
}
public void enterPassword(String password) {
	txt_password.sendKeys(password);
}
public void clickLogin() {
	btn_login.click();
}
public void clickLogout() {
	btn_logout.isDisplayed();
}
}

