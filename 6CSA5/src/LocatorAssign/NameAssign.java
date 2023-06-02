package LocatorAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAssign {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.name("top"));
		System.out.println("element 1 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com");
		driver.findElement(By.name("HyperService-PreFetch"));
		System.out.println("element 2 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com");
		driver.findElement(By.name("omid_v1_present"));
		System.out.println("element 3 identified");
		
		driver.manage().window().maximize();
		driver.get("https://www.voot.com");
		driver.findElement(By.name("title"));
		System.out.println("element 4 identified");
		
		
	}

}
