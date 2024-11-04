package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrame {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		driver.get("https://ui.vision/demo/webtest/frames/");	
		driver.manage().window().maximize();
		
		//frame1 
		WebElement frame1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']")); //passed frame as a web element
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Jesus");
		
		driver.switchTo().defaultContent(); // this method navigate driver to main whole page.
		
		//frame2
		WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Loves");
		
		driver.switchTo().defaultContent(); // this method navigate driver to main whole page.

		//frame3
		
		WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("you");
		
		
		
		//inner iframe-part of frame 3
		
		driver.switchTo().frame(0); //switching to frame using index.
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		
		WebElement rdbutton =driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();" , rdbutton);
		
		driver.switchTo().defaultContent(); // this method navigate driver to main whole page.
	}

}
