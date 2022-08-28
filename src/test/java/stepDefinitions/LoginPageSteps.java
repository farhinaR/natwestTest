package stepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private static String title;
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		DriverFactory.getDriver()
		.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterUserName(username);
	}
	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterPassword(password);
	}
	
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}
	
	@When("Validate Successfull Login")
	public void validate_successfull_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		title = loginPage.getLoginPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("My account - My Store"));
	}


}
