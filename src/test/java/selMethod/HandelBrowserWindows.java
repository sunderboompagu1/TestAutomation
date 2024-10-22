package selMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelBrowserWindows {

	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
			Set<String> windows = driver.getWindowHandles();
			
			//Approac 1
			
//			List<String> windowList = new ArrayList(windows);
//			
//			String parentID = windowList.get(0);
//			String childID =	windowList.get(1);
//			
//			//switch to child window
//			driver.switchTo().window(childID);
//			System.out.println(driver.getTitle());
//			
//			//switch to parent window
//			driver.switchTo().window(parentID);
//			System.out.println(driver.getTitle());
//			
			
			
			//Approach 2
			for(String winID :windows ) {
				String title= driver.switchTo().window(winID).getTitle();			
				
				
				if(title.equals("OrangeHRM"))
				{
					System.out.println(driver.getCurrentUrl());
				}
				
				}
			
			
	}

}
