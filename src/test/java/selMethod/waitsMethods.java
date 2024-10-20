package selMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsMethods {

	public static void main(String[] args) {
		
//		WebDriver  driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait, if we write like this is applicable to all lines of code
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		
//		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin"); // if the element found in 2 seconds it will wait 5 seconds
//	//	driver.close(); // implicit wait will wait untill the driver is active.
		
		
		WebDriver  driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement textuser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		textuser.sendKeys("Admin");
		
		WebElement textpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		textpassword.sendKeys("admin123");
		
		
		WebElement login = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		login.click();
		 
	}

}
