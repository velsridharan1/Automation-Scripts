package mavenCucumber.cucumber;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

public static WebDriver D1;
	@Given("^I launch the ultimatix application$")
	public void i_launch_the_ultimatix_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
		D1 = new ChromeDriver();
		D1.get("https://www.ultimatix.net");
		D1.manage().window().maximize();
		
	}
	
	
	@When("^I enter the username$")
	public void i_enter_the_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   D1.findElement(By.id("USER")).sendKeys("395815");
	}

	@When("^I enter the password$")
	public void i_enter_the_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		D1.findElement(By.id("PASSWORD")).sendKeys("Sridharan@16");
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		D1.findElement(By.id("login_button")).click();
	}

	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement HomeElement = D1.findElement(By.className("uxbookA"));
	    Assert.assertEquals(true, HomeElement.isDisplayed());
	    D1.close();
	    System.out.println("Reached the output2");
	}
	

/*
	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("second step");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("third step");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("fourth step");
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("fourth step");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("fourth step");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("fourth step");
	}

	*/
}
