package test_Selenium;

//Manuelno se registrujte, zatim napraviti program koji ce proveriti da li korisnik moze da se uloguje sa registrovanim kredencijalima. 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogIn {

	WebDriver driver;
	WebDriverWait wdwait;

	public LogIn(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}
	
	public WebElement getLogIn() {
		return driver.findElement(By.id("login2"));
	}
	
	
	public WebElement getUsernameField() {
		return driver.findElement(By.xpath("//input[@id='loginusername']"));
	}
	
	public WebElement getPasswordField() {
		return driver.findElement(By.id("loginpassword"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	}
	
	public WebElement getWelcomeMessage() {
		return driver.findElement(By.id("nameofuser"));
	}
	
	//prozor za ponovni logIn u slucaju pogresno unetog korisnickog imena ili lozinke
	public WebElement getLoginForm() {
		return driver.findElement(By.xpath("//body/div[@id='logInModal']/div[1]/div[1]"));
	}
	
	public String textOfWelcomeMessage() {
		return getWelcomeMessage().getText();
	}
	
	public void clickLogIn() {
		getLogIn().click();
	}
	
	
	public void insertUsername(String username) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(username);
	}
	
	public void insertPassword(String password) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(password);
	}
	
	public void insertNumericUsername(CharSequence username ) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(username);;
	}
	
	public void insertNumericPassword(CharSequence[] password) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}
	
	public void clickLoginButton() {
		this.getLoginButton().click();
	}
	
	public void waiter() {
		wdwait.until(ExpectedConditions.elementToBeClickable(getLogIn()));
	}
	
	public void textLoginForm() {
		getLoginForm().getText();
	}
}
