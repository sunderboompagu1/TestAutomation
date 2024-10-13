 package locatersDemo;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class locatersDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		//name search box
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
//	 boolean logoDisPlayStatus = driver.findElement(By.id("logo")).isDisplayed();
//	 System.out.println(logoDisPlayStatus);
		
		//Linktext or partiallink
		//driver.findElement(By.linkText("Tablets")).click();
		
		//driver.findElement(By.partialLinkText("Table")).click();
		
		
		
		//class
		//captureing multiple webelemnts with calss tag
		//size methond using to find number of elements.
//		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
//		int count = headerLinks.size();
//		System.out.println("Total number of link: " + count);
		

		//tagname
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
		
		List<WebElement> imagesCount=driver.findElements(By.tagName("img"));
		System.out.println(imagesCount.size());
		
		
		
		
		
		
		
		
		
	 
	}

}
