package selMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Remove the filter realme to expand results']")).click();
			
		
		
		}

}
