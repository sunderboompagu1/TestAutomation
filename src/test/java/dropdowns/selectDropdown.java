package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCuntry = new Select(drpdown);
		
//		selectByVisibleText()
//		selectByvalue() // attribute of the element
//		selectByIndex()
		
		//drpCuntry.selectByVisibleText("Japan");
		
		//drpCuntry.selectByValue("japan");
		//drpCuntry.selectByIndex(2);
		
//		//capture options from dropdown
//		
		List<WebElement> options = drpCuntry.getOptions();
//		System.out.println(options.size()); //10
//		// printing the options
//		
//		for(int i = 0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
		
		 for(WebElement op : options) {
			 	
			 System.out.println(op.getText());
		 }
//		

	}

}
