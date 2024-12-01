package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.partialLinkText("Chennai")).click();
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Ahmedabad (AMD)")).click();
		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();

	}

}
