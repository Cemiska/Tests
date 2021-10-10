package test_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamsungGalaxyS6 {

	WebDriver driver;

	public SamsungGalaxyS6(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getS6() {
		return driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
	}
	
	public WebElement getAddToCartButton() {
		return driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
	}
	
	public WebElement getCart() {
		return driver.findElement(By.id("cartur"));
	}
	
	public WebElement getDeleteItem() {
		return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a"));
		
	}
	
	public WebElement getSuccessfulAddToCart() {
		return driver.findElement(By.className("success"));
	}
	
	public String getCartContainsText() {
		return getSuccessfulAddToCart().getText();
	}
}

	
	
	

