package SeleniumConfig;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

//launch chrome, open url, check the url, close the browser.

public class TestSelenium {

	public static void main(String[] args) {
		
		// Launch the browser.
		// created object for chrome driver class 
		//chrome driver have default constructor it will automatically launch chrome.
		//ChromeDriver driver = new ChromeDriver();
		//Webdriver is class for all so we can store any web browser.
		
		WebDriver driver = new ChromeDriver();
		
		
		//open url
		driver.get("https://demo.opencart.com");
		
		// validate text
		
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//close the browser
		driver.close();

	}

}
