package WebDriverMehtod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class GetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String title= driver.getTitle();
		System.out.println(title);
	
	}

}
