package Practice.Custom_Framewrok_Creation;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Landingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StandaloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String[] names = {"IPHONE 13 PRO"};
		
		
		
		Landingpage land = new Landingpage(driver);
		land.goTO();
		land.loginApplication("ajay.selenium@gmail.com", "ABCD@1234");
		List<WebElement> prod = driver.findElements(By.xpath("//div[@class='card-body']/h5"));
		
		for(int i= 0;i<prod.size();i++) {
			String name = prod.get(i).getText();
			
			List al = Arrays.asList(names);
			
			if(al.contains(name)) {
				driver.findElements(By.xpath("//button[text()=' Add To Cart']")).get(i).click();
				
				//break;
			}
			
			
		}
		 
//		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
//		 w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("button[routerlink*='car']")).click();
		
	}

}
