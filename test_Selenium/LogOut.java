package test_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut {

	WebDriver driver;

	public LogOut(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getLogOutButton() {
		return driver.findElement(By.id("logout2"));
	}
	
	
	public WebElement getLogIn() {
		return driver.findElement(By.id("login2"));
	}
	
	public String checkLogOut() {
		return getLogIn().getText();
	}
}
