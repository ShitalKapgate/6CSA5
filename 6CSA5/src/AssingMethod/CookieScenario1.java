package AssingMethod;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieScenario1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());//1
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());//csm-sid
		Cookie cooky1 =new Cookie("selenium","3");
		Cookie cooky2 =new Cookie("java","2");
		driver.manage().addCookie(cooky1);
		driver.manage().addCookie(cooky2);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());//3
		//for(Cookie singleCooky:allCookies)
			//System.out.println(singleCooky.getName());
		//driver.manage().deleteCookieNamed("selenium");
		//allCookies= driver.manage().getCookies();
		//System.out.println(allCookies.size());
		//for(Cookie singleCooky:allCookies)
			//System.out.println(singleCooky.getName());

	}

}
