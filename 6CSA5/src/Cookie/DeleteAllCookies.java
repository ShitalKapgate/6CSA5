package Cookie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.manage().deleteAllCookies();
	}

}
