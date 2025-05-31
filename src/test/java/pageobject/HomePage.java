package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Basepackage.basepage;

public class HomePage extends basepage {

	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}

	private By linkcart=By.xpath("//a[@title='Shopping Cart']");
	private By linktextonCartPage=By.xpath("//div[@id='content']//p");
	
	public void clickCart() {
		
		driver.findElement(linkcart).click();
	}
	
	
	public String gettextonCartPage() {
		
		return (driver.findElement(linktextonCartPage).getText());
	}
}
