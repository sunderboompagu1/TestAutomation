package selMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelAlerts {

	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
			driver.manage().window().maximize();
			
			//normal alert with okay button or 1 single button.
			driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
			
			Alert myalert =driver.switchTo().alert();
			System.out.println(myalert.getText());
			
			
			
			
		}

}
