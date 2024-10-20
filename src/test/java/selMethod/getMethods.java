package selMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();// created object for chromdriver
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			String title = driver.getTitle();;
			System.out.println(title);
			System.out.println (driver.getCurrentUrl());
			
			
			//System.out.println(driver.getPageSource());
			
			//getwindowHandle()-return ID of the simgle browser window
			String WID =  driver.getWindowHandle();
			System.out.println("windowID: " + WID );
			
			//getwindowHandles() returs ID's of thr multipe browser window
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open new broswer window
			Set<String> windoIDS = driver.getWindowHandles(); // Set collections dont allows duplicate that is why it did not use List
			for(String x : windoIDS ) {
				System.out.println(x);
			}											//Set ids will not be the same 
	}

}
