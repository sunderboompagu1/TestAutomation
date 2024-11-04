package selMethod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//handle alert by explictwait not by using switchTo() methods.
public class explictWaitforAlert {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10) ); //explicit wait declarition.
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());// another way to capture.
		myalert.accept(); 
			

	}

}
