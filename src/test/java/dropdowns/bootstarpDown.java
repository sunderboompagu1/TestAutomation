package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstarpDown {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//Select single option
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all the options and find out the size.
		List<WebElement> options =driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of Options: " + options.size()); //14
		
		//printing dropdown for option
		
//		for(WebElement Op : options) {
//			System.out.println(Op.getText());
//		}
		
		//select multiple options.
		

		for(WebElement Op : options) {
			
			String Options = Op.getText();
			
			if (Options.equals("Java") || Options.equals("Python") || Options.equals("MySQL")) {
				
				Op.click();
			}
		}
		
	

	}

}
