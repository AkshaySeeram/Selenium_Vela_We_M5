package Students;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oggy_Demo {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.jio.com/");
		
		Actions Act = new Actions(driver);
		Act.scrollByAmount(0, 500).perform();
		
		WebElement ele =  driver.findElement(By.id("text"));
		Act.scrollToElement(ele).perform();
		
		WebElement mobilenumber = driver.findElement(By.name("mobileNumber"));
		mobilenumber.click();
	    mobilenumber.sendKeys("9080086279");
	    
	    driver.quit();
		
	}

}
