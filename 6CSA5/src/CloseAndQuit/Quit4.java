package CloseAndQuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		
		driver.quit();
	}
}
