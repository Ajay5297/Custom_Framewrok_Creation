package TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	WebDriver driver;
	public void initializerDriver() throws IOException {
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Ajay\\eclipse-workspace\\Custom_Framewrok_Creation\\src\\main\\java\\Resources\\GlobalData.properties");
		p.load(fis);
		String browsername = p.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")){
			
		}
	
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(5000)); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
