package datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryDatePicker {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//switch frame 1st
		driver.switchTo().frame(0);
		
		
		//using send keys method
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/07/1995");
		
		//method 2 expected data
		String year= "2026";
		String month="September";
		String day = "7";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		while(true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year) ) {
				break;
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();//next
			//driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click(); //previous
			 
		}
		
		//select date now.
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@id=\"ui-datepicker-div\"]//tbody//tr//td//a"));
		
		for(WebElement dt:alldates ) {
			
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
			
		}
		
		
	}

}
