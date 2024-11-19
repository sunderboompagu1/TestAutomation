package tabels;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticTabel {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//find total number of rows in table
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("number of rows: " + rows); //7
		
		//by tag name
//		int rows =driver.findElements(By.tagName("tr")).size(); // when we have single tabel.
//		System.out.println(rows);
		
		//find total number column in a table
		
		int col =driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("number of colums:" + col);
		
		//read data specific data from coloum(5th row 1st colum)
		 String text =driver.findElement(By.xpath(" //table[@name='BookTable']//tr[5]//td[1]")).getText();
		 System.out.println(text);
		// read data from all the rows and coloms
		 
//		 for(int r=2;r<=rows;r++ ) { //Repeating the rows
//			 for(int c=1;c<=col;c++) { // Repeating the columns
//				String value= driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value+"\t");
//			 }
//			 System.out.println();
//		 }
		 
		 //print book names whos names is mukesh
//		 for(int r=2;r<=rows;r++) {
//			 String authorname =driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//			 if(authorname.equals("Mukesh")) {
//				String bookname = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//				System.out.println(bookname+"\t"+ authorname);
//			 }
//			 
//		 }
		 
		 //find total price for all the books
		 int total = 0;
		 for(int r=2;r<=rows;r++) {
			 String price =driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total =total+Integer.parseInt(price);
			 
		 }
		 System.out.println("Total price of books:" + total ) ;
		 
	}

}
