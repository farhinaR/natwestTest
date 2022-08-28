package stepDefinitions;

import com.pages.CustomerAccountPage;
import com.pages.MyStorePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CustomerAccountPageSteps {
private static String title;
	
	private CustomerAccountPage myAccountPage = new CustomerAccountPage(DriverFactory.getDriver());


	@And("Navigate to customer profile")
	public void Navigate_to_customer_profile() {
		myAccountPage.clickonViewCustomerAccount();
	}
	
	@Then("Click on My Personal Information")
	public void Click_on_My_Personal_Information() {
		myAccountPage.clickonMyPersonalInformation();
	}
   
	@Then("User cilcks on first name and updates the first name")
	public void User_cilcks_on_first_name_and_updates_the_first_name() {
		myAccountPage.clickonfirstName();
	}
	
	
	@Then("User saves first name")
	public void User_saves_first_name() {
		myAccountPage.UserSavesFirstName();
	}
}

