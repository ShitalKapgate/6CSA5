package LocatorAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextAssign {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.netflix.com");
	    driver.findElement(By.partialLinkText("Sign"));
	    System.out.println("element 1 identified");
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.zomato.com");
	    driver.findElement(By.partialLinkText("Log"));
	    System.out.println("element 2 identified");
	    
	   driver.manage().window().maximize();
	   driver.get("https://www.netflix.com");
	   driver.findElement(By.partialLinkText("Sign"));
	   System.out.println("element 3 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.fb.com");
	   driver.findElement(By.partialLinkText("Forgotten passwor"));
	   System.out.println("element 4 identified");
	   
	   driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.partialLinkText("Apparel"));
		System.out.println("element 5 identified");
		

	   
	   /*driver.manage().window().maximize();
	   driver.get("https://www.amazon.com");
	   driver.findElement(By.partialLinkText("Best"));
	   System.out.println("element 6 identified"); */
	   
	  
	   driver.manage().window().maximize();
	   driver.get("https://www.swiggy.com");
	   driver.findElement(By.partialLinkText("Sign"));
	   System.out.println("element 7 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.findElement(By.partialLinkText("Forgot"));
	   System.out.println("element 8 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com");
	   driver.findElement(By.partialLinkText("Log"));
	   System.out.println("element 9 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.zee5.com");
	   driver.findElement(By.partialLinkText("Web"));
	   System.out.println("element 10 identified");
		
	}

}
