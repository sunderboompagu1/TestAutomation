package selMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxex {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		//1. select 1 specific checkbox.
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2. select all the checboxex.
		//input[@class='form-check-input' and @type='checkbox']
		
		List<WebElement> checkboxex = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 	
//			for(int i=0;i<checkboxex.size();i++) {
//					
//				checkboxex.get(i).click();
//			}
		
//		for(WebElement checkboxes : checkboxex) {
//			checkboxes.click();
//		}
		
		//select last 3 boxes.
		//total number of check boxes  - how many checkboxes  want to select = string index
		// 7-3 = 4(starting index)
//			for(int i = 4; i<checkboxex.size(); i++ ) {
//				checkboxex.get(i).click();
//			}
			
		//select first 3 check boxex
			
//		for(int i = 0;i<3;i++) {
//			checkboxex.get(i).click();
//		}
		
		//select and unselect
		for(int i = 0;i<3;i++) 
		{
		checkboxex.get(i).click();
		}
		
		Thread.sleep(5000);
			
		for(int i= 0;i<checkboxex.size();i++) {
			if(checkboxex.get(i).isSelected()) {
				checkboxex.get(i).click();
			}
		}
		
	}

}
