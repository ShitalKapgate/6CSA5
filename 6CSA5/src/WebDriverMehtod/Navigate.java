package WebDriverMehtod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
  public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.get("https://www.fb.com/");
	driver.navigate().to("https://www.amazon.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
