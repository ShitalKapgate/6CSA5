package WebDriverMehtod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
 public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String actualURL = driver.getCurrentUrl();
	String expectedURL ="https://www.flipkart.com/";
	if (actualURL.equals(expectedURL))
		System.out.println("Pass");
	else
		System.out.println("FAIL");
			
}
}
