package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	WebDriver driver;
	public Landingpage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement useEmail = driver.findElement(By.id("userEmail"));
//	driver.findElement(By.id("userPassword"));
//	driver.findElement(By.id("login")).click();
	
	//pagefactory
	@FindBy(id="userEmail")
	WebElement useEmail;
	
	@FindBy(id="userPassword")
	WebElement passwords;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginApplication(String email,String Password) {
		useEmail.sendKeys(email);
		passwords.sendKeys(Password);
		submit.click();
		
	}
	
	public voiod goTO() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
	
}
