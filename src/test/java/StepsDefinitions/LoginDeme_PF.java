package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.LoginPage_PF;

public class LoginDeme_PF {
	WebDriver drive = null;
	LoginPage_PF login;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Insite -browser is open ");
		String projectPath =System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Driver/chromedriver.exe");
		drive = new ChromeDriver();
		drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		drive.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		drive.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login = new LoginPage_PF(drive);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("hit login button")
	public void hit_login_button() {
		login.clickLogin();

	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		login.clickLogout();
		drive.close();
		drive.quit();
		
	}


}
