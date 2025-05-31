package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobject.HomePage;

public class cartfeature {

	public HomePage hp;
	public WebDriver driver;
	
	@Given("user on application homepage using <{string}>")
	public void user_on_application_homepage_using(String string) {
	   
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		hp=new HomePage(driver);
		
	}
	
	@When("user click on cart")
	public void user_click_on_cart() {
	    
		hp.clickCart();
	}
	
	@Then("cart page should be displayed")
	public void cart_page_should_be_displayed() {
	    
		String text=hp.gettextonCartPage();
		Assert.assertEquals("Your shopping cart is empty!",text);
		
	}
	
}
