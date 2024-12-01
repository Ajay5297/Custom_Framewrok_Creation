package Section3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("indonesia")) {
				option.click();
				break;
			}
			
		}

	}

}
