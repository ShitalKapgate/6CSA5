package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com");
			driver.findElement(By.id("skiplink"));
			System.out.println("element identified");
			driver.close();
	}
	

}
