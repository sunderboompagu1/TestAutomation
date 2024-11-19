package tabels;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTabel {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.xpath("//input[@id='input-username']"));
		Username.clear();
		Username.sendKeys("demo");
		
		WebElement password =driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='parent']")).click();
		
		driver.findElement(By.xpath("//a[@class='parent']")).click();

	}

}
