package test_Selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Nakon svakog testa potrebno je izlogovati se i obrisati kolacice.

public class Testing extends Base {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to(homeURL);
	}

	// testiranje sa ispravno unetim korisnickim imenom i ispravno unetom lozinkom
	@Test(priority = 10)
	public void successfulLogIn() throws InterruptedException {
		wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2']")));

	
		String username = excel.getStringData("Test", 1, 1);
		String password = excel.getStringData("Test", 1, 3);
		String messageText = excel.getStringData("Test", 1, 7);
		
		
		logIn.clickLogIn();
		Thread.sleep(2000);
		logIn.getUsernameField().click();
		Thread.sleep(2000);
		logIn.insertUsername(username);
		logIn.getPasswordField().click();
		logIn.insertPassword(password);
		logIn.clickLoginButton();
		Thread.sleep(2000);

		assertTrue(logOut.getLogOutButton().isDisplayed());
		assertEquals(logIn.textOfWelcomeMessage(), messageText);
	}

	@Test(priority = 20)
	public void invalidUsername() throws InterruptedException {

		for (int i = 1; i < excel.getLastRowNumber(); i++) {

			String username = excel.getStringData("Test", i, 2);
			String password = excel.getStringData("Test", 1, 3);
			String text = excel.getStringData("Test", 1, 8);

			logIn.clickLogIn();
			Thread.sleep(2000);
			logIn.getUsernameField().click();
			Thread.sleep(2000);
			logIn.insertUsername(username);
			logIn.getPasswordField().click();
			logIn.insertPassword(password);
			logIn.clickLoginButton();
			Thread.sleep(2000);
			
			assertEquals(logIn.getLoginForm().getText(), text); // proverava da li se ispis Login prozora slaze sa
																// tesktom "Log in"
			assertTrue(logIn.getLoginForm().isDisplayed()); // proverava da li je Log in prozor prikazan pri neuspesnom
															// prijavljivanju
		}

	}

	@Test (priority = 30)
	public void invalidPassword() throws InterruptedException {
		
		for(int i = 1; i < excel.getLastRowNumber(); i++) {
			
			String username = excel.getStringData("Test", 1, 1);
			String password = excel.getStringData("Test", 1, 4);
			String text = excel.getStringData("Test", 1, 8);
			
			logIn.clickLogIn();
			Thread.sleep(2000);
			logIn.getUsernameField().click();
			Thread.sleep(2000);
			logIn.insertUsername(username);
			logIn.getPasswordField().click();
			logIn.insertPassword(password);
			logIn.clickLoginButton();
			Thread.sleep(2000);
		
			assertEquals(logIn.getLoginForm().getText(), text); //proverava da li se ispis Login prozora slaze sa tesktom "Log in"
			assertTrue(logIn.getLoginForm().isDisplayed()); // proverava da li je Log in prozor prikazan pri neuspesnom prijavljivanju
		}
		
	}	

	@Test(priority = 40)
	public void invalidNumericUsername() {


			int username = excel.getIntegerData("Test", 1, 5);
			String password = excel.getStringData("Test", 1, 3);
			String text = excel.getStringData("Test", 1, 8);

			logIn.clickLogIn();
		
			logIn.getUsernameField().click();
		
//			logIn.insertNumericUsername(username);
//			logIn.getPasswordField().click();
//			logIn.insertNumericPassword(password);
			logIn.clickLoginButton();
		
			
			assertTrue(logIn.getLoginForm().getText().contains(text)); // proverava da li ispis Login prozora sadrži String "Log in"
																
			assertTrue(logIn.getLoginForm().isDisplayed()); // proverava da li je Log in prozor prikazan pri neuspesnom
															// prijavljivanju
		}

	

	@Test (priority = 30)
	public void invalidNumericPassword() throws InterruptedException {


			String username = excel.getStringData("Test", 1, 6);
			int password = excel.getIntegerData("Test", 1, 3);
			String text = excel.getStringData("Test", 1, 8);
			
			logIn.clickLogIn();
			Thread.sleep(2000);
			logIn.getUsernameField().click();
			Thread.sleep(2000);
			logIn.insertUsername(username);
			logIn.getPasswordField().click();
//			logIn.insertNumericPassword(password);
			logIn.clickLoginButton();
			Thread.sleep(2000);

			assertTrue(logIn.getLoginForm().getText().contains(text)); // proverava da li ispis Login prozora sadrži String "Log in"
																
			assertTrue(logIn.getLoginForm().isDisplayed()); // proverava da li je Log in prozor prikazan pri neuspesnom
															// prijavljivanju
		}

	
	
	@Test (priority = 40)
	public void addSamsungGalaxyS7toCart() throws InterruptedException {
		wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2']")));


		
		String username = excel.getStringData("Test", 1, 1);
		String password = excel.getStringData("Test", 1, 3);
		String messageText = excel.getStringData("Test", 1, 7);
		
		
		logIn.clickLogIn();
		Thread.sleep(2000);
		logIn.getUsernameField().click();
		Thread.sleep(2000);
		logIn.insertUsername(username);
		logIn.getPasswordField().click();
		logIn.insertPassword(password);
		logIn.clickLoginButton();
		Thread.sleep(2000);

		
		samsungGalaxyS7.getSamsungGalaxyS7().click();
		assertTrue(samsungGalaxyS7.getAddToCartButton().isDisplayed()); //proverava da li se javlja dugme "Add to Cart" kada se izabere telefon
		samsungGalaxyS7.getAddToCartButton().click();
		
		Alert alert = driver.switchTo().alert();
        alert.accept();
        
		
		samsungGalaxyS7.getCart().click();
		assertTrue(samsungGalaxyS7.getSuccessfulAddToCart().getText().contains(messageText)); // proverava da li se proizvod nalazi u korpi 
		samsungGalaxyS7.getDeleteItem().click();
		assertFalse(samsungGalaxyS7.getSuccessfulAddToCart().isDisplayed()); //proverava da li je korpa prazna
		
	}
	
	@Test (priority = 50)
	public void addSamsungGalaxaS6toCart() throws InterruptedException {
		
wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2']")));

		
		String username = excel.getStringData("Test", 1, 1);
		String password = excel.getStringData("Test", 1, 3);
		String messageText = excel.getStringData("Test", 1, 7);
		
		
		logIn.clickLogIn();
		Thread.sleep(2000);
		logIn.getUsernameField().click();
		Thread.sleep(2000);
		logIn.insertUsername(username);
		logIn.getPasswordField().click();
		logIn.insertPassword(password);
		logIn.clickLoginButton();
		Thread.sleep(2000);
		
		samsungGalaxyS6.getS6().click();
		assertTrue(samsungGalaxyS6.getAddToCartButton().isDisplayed()); //proverava da li se javlja dugme "Add to Cart" kada se izabere telefon
		samsungGalaxyS6.getAddToCartButton().click();
		
		Alert alert = driver.switchTo().alert();
        alert.accept();
        
		
		samsungGalaxyS6.getCart().click();
		assertTrue(samsungGalaxyS6.getSuccessfulAddToCart().getText().contains(messageText)); // proverava da li se proizvod nalazi u korpi 
		samsungGalaxyS6.getDeleteItem().click();
		assertFalse(samsungGalaxyS6.getSuccessfulAddToCart().isDisplayed()); //proverava da li je korpa prazna
		
	}
	
	@Test (priority = 50)
	public void addMacBookAir() throws InterruptedException {
		
wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2']")));

		
		String username = excel.getStringData("Test", 1, 1);
		String password = excel.getStringData("Test", 1, 3);
		String messageText = excel.getStringData("Test", 1, 7);
		
		
		logIn.clickLogIn();
		Thread.sleep(2000);
		logIn.getUsernameField().click();
		Thread.sleep(2000);
		logIn.insertUsername(username);
		logIn.getPasswordField().click();
		logIn.insertPassword(password);
		logIn.clickLoginButton();
		Thread.sleep(2000);
		
//		macBookAir.
//		assertTrue(samsungGalaxyS6.getAddToCartButton().isDisplayed()); //proverava da li se javlja dugme "Add to Cart" kada se izabere telefon
//		samsungGalaxyS6.getAddToCartButton().click();
		
		Alert alert = driver.switchTo().alert();
        alert.accept();
        
		
		samsungGalaxyS6.getCart().click();
		assertTrue(samsungGalaxyS6.getSuccessfulAddToCart().getText().contains(messageText)); // proverava da li se proizvod nalazi u korpi 
		samsungGalaxyS6.getDeleteItem().click();
		assertFalse(samsungGalaxyS6.getSuccessfulAddToCart().isDisplayed()); //proverava da li je korpa prazna
		
	}
	
	
	@AfterMethod
	public void pageClose() {
		
		driver.manage().deleteAllCookies();
		logOut.getLogOutButton().click();
	
	}

}
