package LocatorAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAssign {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("skiplink"));
		System.out.println("element 1 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("contents"));
		System.out.println("element 2 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com");
		driver.findElement(By.id("page-container"));
		System.out.println("element 3 identified");
		driver.manage().window().maximize();
		
		driver.get("https://www.voot.com");
		driver.findElement(By.id("addToHome"));
		System.out.println("element 4 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.id("globalContainer"));
		System.out.println("element 5 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		driver.findElement(By.id("root"));
		System.out.println("element 6 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		driver.findElement(By.id("root"));
		System.out.println("element 7 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.Netflix.com");
		driver.findElement(By.id("appMountPoint"));
		System.out.println("element 8 identified");
		
		
				
		
	}

}
