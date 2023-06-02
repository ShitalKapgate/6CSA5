package LocatorAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAssign {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.tagName("a"));
		System.out.println("element 1 identified");
		driver.manage().window().maximize();
		driver.get("https://www.meshoo.com");
		driver.findElement(By.tagName("div"));
		System.out.println("element 2 identified");
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com");
		driver.findElement(By.tagName("input"));
		System.out.println("element 3 identified");
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		driver.findElement(By.tagName("img"));
		System.out.println("element 4 identified");
		driver.manage().window().maximize();
		driver.get("https://www.voot.com");
		driver.findElement(By.tagName("img"));
		System.out.println("element 5 identified");
		
	
		

}
		
	}


