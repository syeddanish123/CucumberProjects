package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datadrivenStepDefinition {

	@Given("user on application homepage")
	public void user_on_application_homepage() {
	   
		System.out.println("yes on homepage");
	}
	@When("user enetered the data into search fileds using {string}")
	public void user_enetered_the_data_into_search_fileds_using(String string) {
	    
		System.out.println("Searching for "+string);
	}
	@When("click on search button")
	public void click_on_search_button() {
	   
		System.out.println("clicked sucesfully....");
	}
	@Then("Relevent products should be displayed")
	public void relevent_products_should_be_displayed() {
	   
		System.out.println("Products displayed sucess....");
	}

	
}
