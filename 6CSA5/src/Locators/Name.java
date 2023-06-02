package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.voot.com");
		driver.findElement(By.name(""));
		System.out.println("element identified");
		driver.close();
	
}

}
