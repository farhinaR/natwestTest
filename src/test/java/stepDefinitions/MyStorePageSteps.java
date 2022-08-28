package stepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.MyStorePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStorePageSteps {
	
	private static String title;
	
	private MyStorePage myStorePage = new MyStorePage(DriverFactory.getDriver());


	@When("navigate to TShirts Section")
	public void navigate_to_t_shirts_section() {
	    // Write code here that turns the phrase above into concrete actions
		myStorePage.clickonTshirtSlink(); 
	}


@When("Chose List View")
public void chose_list_view() {
    // Write code here that turns the phrase above into concrete actions
	myStorePage.ChoseListView();
}

@When("AddTo Cart the dispayed Tshirt")
public void add_to_cart_the_dispayed_tshirt() {
    // Write code here that turns the phrase above into concrete actions
    myStorePage.Click_AddtoCart();
}

@When("Proceed to Checkout")
public void proceed_to_checkout() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions    
	Thread.sleep(5000);
	myStorePage.click_Proceedtocheckout();
}

@And("User clicks on Checkout for Summary till address")
public void User_clicks_on_Checkout_for_Summary_till_address() throws InterruptedException {
	Thread.sleep(5000);
	myStorePage.Summary_checkout();
	Thread.sleep(5000);
	myStorePage.Address_checkout();
	}

@And("User clicks on Checkout for Shipping after accepting Terms")
public void User_clicks_on_Checkout_for_Shipping_after_accepting_Terms() {
	myStorePage.Shipping_checkout();
}

@And("User clicks on Payment and does the payment using Pay by check")
public void User_clicks_on_Payment_and_does_the_payment_using_Pay_by_check() {
	myStorePage.Payment_checkout();
}

@Then("User verifies Order is Completed")
public void User_verifies_Order_is_Completed(){
	myStorePage.Order_Completed();
}

}
