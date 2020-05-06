package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	public WebDriver driver;
	
	By email = By.cssSelector("#exampleInputEmail1");
	By password = By.cssSelector("#exampleInputPassword1");
	By submit = By.cssSelector("button[type='submit']"); 
	
	
public LoginPage(WebDriver driver) {
	this.driver = driver; 
	
}
	
	
	
	public WebElement enterEmail() {
		
		return driver.findElement(email); 
	}
	
	public WebElement enterPassword() {
		
		return driver.findElement(password); 
	}
	
	public WebElement pressSubmit() {
		
		return driver.findElement(submit); 
	}


	

}
