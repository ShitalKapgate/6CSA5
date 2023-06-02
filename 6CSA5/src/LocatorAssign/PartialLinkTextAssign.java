package LocatorAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextAssign {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.partialLinkText("Sign In"));
		System.out.println("element 1 identified");
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.partialLinkText("Apparel"));
		System.out.println("element 2 identified");
		driver.close();

	}

}
