package test_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Testirati da li korisnik moze da doda telefon Samsung Galaxy S7 u korpu, zatim obrisati sve iz korpe i utvrditi da je korpa prazna. 

public class SamsungGalaxyS7 {

	WebDriver driver;

	public SamsungGalaxyS7(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getSamsungGalaxyS7() {
		return driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s7')]"));
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
