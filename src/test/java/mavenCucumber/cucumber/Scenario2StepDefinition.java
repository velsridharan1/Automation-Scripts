package mavenCucumber.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario2StepDefinition {

	@Given("^launch the ATM application$")
	public void launch_the_ATM_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Debit card inserted");
	}

	@Given("^I insert the Debit card$")
	public void i_insert_the_Debit_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Debit card inserted");
	}

	@When("^I enter the pin number$")
	public void i_enter_the_pin_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pin number is entered");
	}

	@When("^provide the amount to be withdrawn$")
	public void provide_the_amount_to_be_withdrawn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pin number is entered");
	}

	@When("^choose the receipt print yes/no option$")
	public void choose_the_receipt_print_yes_no_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pin number is entered");
	}

	@Then("^I should get the money out of ATM machine$")
	public void i_should_get_the_money_out_of_ATM_machine() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pin number is entered");
	}

	@Then("^I should get my card out of machine$")
	public void i_should_get_my_card_out_of_machine() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pin number is entered");
	}

	
}
