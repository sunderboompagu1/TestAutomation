package selMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelAuthAlert {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//syntx pass username and password into alerts.
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");	
	}

}
