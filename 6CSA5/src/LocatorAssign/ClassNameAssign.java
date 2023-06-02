package LocatorAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameAssign {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.className("a-carousel-row-inner"));
		System.out.println("element 1 identified");
		
		
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com");
		driver.findElement(By.className("default"));
		System.out.println("element 2 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com");
		driver.findElement(By.className("appContainer"));
		System.out.println("element 3 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		driver.findElement(By.className("contents-wrapper"));
		System.out.println("element 4 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.Netflix.com");
		driver.findElement(By.className("our-story-container"));
		System.out.println("element 5 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		driver.findElement(By.className(""));
		System.out.println("element 5 identified");

		 
		
			
		}

}
