package stepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.MyStorePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
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
	
	myStorePage.click_Proceedtocheckout();
}



}
