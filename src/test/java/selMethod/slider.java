package selMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement slider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
			String oldvalue = slider.getAttribute("Style");
			System.out.println("old value:" + oldvalue);
			
		Actions action = new Actions(driver);
		action.clickAndHold(slider).moveByOffset(50, 0).release().perform();
		
		 String newValue = slider.getAttribute("style");
	        System.out.println("New value: " + newValue);

		
	}

}
