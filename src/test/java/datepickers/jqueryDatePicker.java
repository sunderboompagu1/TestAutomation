package datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryDatePicker {
	
	//1) //user define method this is created t selest future date
	static void selectFutureDate(WebDriver driver,String year, String month,String date) {
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
				//select date 
				List<WebElement> alldates = driver.findElements(By.xpath("//div[@id=\"ui-datepicker-div\"]//tbody//tr//td//a"));
				
				for(WebElement dt:alldates ) {
					
					if(dt.getText().equals(date)) {
						dt.click();
						break;
					}
					
				}
	}
	
	static void selectPastDate(WebDriver driver,String year, String month,String date) {
		//select month and year
				while(true) {
					String currentmonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
					String currentyear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
					
					if(currentmonth.equals(month) && currentyear.equals(year) ) {
						break;
					}
					//driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();//next
					driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click(); //past
					 
				}
				//select date 
				List<WebElement> alldates = driver.findElements(By.xpath("//div[@id=\"ui-datepicker-div\"]//tbody//tr//td//a"));
				
				for(WebElement dt:alldates ) {
					
					if(dt.getText().equals(date)) {
						dt.click();
						break;
					}
					
				}
	}
	

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//switch frame 1st
		driver.switchTo().frame(0);
		
		
		//using send keys method
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/07/1995");
		
	
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens date picker
		
		String year = "2025";
		String month = "September";
		String date = "7";
		selectFutureDate(driver, year, month, date);
	}

}
