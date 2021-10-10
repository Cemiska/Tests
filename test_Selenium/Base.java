package test_Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

	public WebDriver driver;
	public Excel excel;
	public LogIn logIn;
	public LogOut logOut;
	public SamsungGalaxyS7 samsungGalaxyS7;
	public SamsungGalaxyS6 samsungGalaxyS6;
	public MacBookAir macBookAir;
	public String homeURL;
	public WebDriverWait wdwait;
	
	
	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		excel = new Excel("C:\\Users\\Slavisa\\Desktop\\TestSelenuim.xlsx");
		logIn = new LogIn(driver, wdwait);
		logOut = new LogOut(driver);
		samsungGalaxyS7 = new SamsungGalaxyS7(driver);
		samsungGalaxyS6 = new SamsungGalaxyS6(driver);
		macBookAir = new MacBookAir(driver);
		homeURL = excel.getStringData("Test", 1, 0);
		wdwait = new WebDriverWait(driver, 20);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	} 
	
}
