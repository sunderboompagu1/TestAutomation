package selMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
		
		 WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		 System.out.println("Display status of logo: " +  logo.isDisplayed());
		 
		 //isEnabled
		 
		 boolean textIsEnabled = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		 System.out.println("Text Box is eabled: " + textIsEnabled );
	}

}
