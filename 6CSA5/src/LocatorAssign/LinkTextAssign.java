package LocatorAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAssign {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.netflix.com");
	    driver.findElement(By.linkText("Sign In"));
	    System.out.println("element 1 identified");
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.zomato.com");
	    driver.findElement(By.linkText("Log in"));
	    System.out.println("element 2 identified");
	    
	   driver.manage().window().maximize();
	   driver.get("https://www.netflix.com");
	   driver.findElement(By.linkText("Sign In"));
	   System.out.println("element 3 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.fb.com");
	   driver.findElement(By.linkText("Forgotten password?"));
	   System.out.println("element 4 identified");
	   
	  /* driver.manage().window().maximize();
	   driver.get("https://www..com");
	   driver.findElement(By.linkText(""));
	   System.out.println("element 5 identified");*/
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.com");
	   driver.findElement(By.linkText("Best Sellers"));
	   System.out.println("element 6 identified");
	   
	  
	   driver.manage().window().maximize();
	   driver.get("https://www.swiggy.com");
	   driver.findElement(By.linkText("Sign up"));
	   System.out.println("element 7 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.findElement(By.linkText("Forgot your password?"));
	   System.out.println("element 8 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com");
	   driver.findElement(By.linkText("Login"));
	   System.out.println("element 9 identified");
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.zee5.com");
	   driver.findElement(By.linkText("Web Series"));
	   System.out.println("element 10 identified");
		
	}

}
