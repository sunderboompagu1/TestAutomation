package locatersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathDemo {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		//driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirt");
		
		//xpath with multiple attributes.
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirt");
		
		//xpath with text()
		
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		//chaind xpath
		
		boolean d =driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
		System.out.println(d);
	}

}
