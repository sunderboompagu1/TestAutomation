package selMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelAlerts {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
			driver.manage().window().maximize();
			
			//normal alert with okay button or 1 single button.
			//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
			//1st
//			Alert myalert =driver.switchTo().alert();
//			System.out.println(myalert.getText());
//			myalert.accept();
			
			//handel alrt with if it has 2 options like okay and cancel
			//2
//			driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//			Thread.sleep(3000);
//			
//			driver.switchTo().alert().dismiss();
			
			//value input alert
			driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
			Alert Valert =  driver.switchTo().alert();
			
			Valert.sendKeys("Jesus");
			Thread.sleep(3000);
			Valert.accept();
			
		}

}
