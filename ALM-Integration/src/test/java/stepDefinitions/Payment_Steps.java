package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Payment_Steps {

	@Given("^User has items in cart$")
	public void user_has_items_in_cart() throws Throwable {
		//
	}

	@Given("^User is on cart page$")
	public void user_is_on_cart_page() throws Throwable {
		//
	}

	@When("^User enters checkout page$")
	public void user_enters_checkout_page() throws Throwable {
	}

	@When("^User enters name \"([^\"]*)\"$")
	public void user_enters_name(String arg1) throws Throwable {
		System.out.println("Entered name: " + arg1);
	}

	@When("^User enters number \"([^\"]*)\"$")
	public void user_enters_number(String arg1) throws Throwable {
		System.out.println("Entered number: " + arg1);
	}

	@When("^User enters expiry date \"([^\"]*)\"$")
	public void user_enters_expiry_date(String arg1) throws Throwable {
		System.out.println("Entered expiry: " + arg1);
	}

	@When("^User clicks Send$")
	public void user_clicks_Send() throws Throwable {
	}

	@Then("^Payment is successful$")
	public void payment_is_successful() throws Throwable {
		assert(false);
	}

}
