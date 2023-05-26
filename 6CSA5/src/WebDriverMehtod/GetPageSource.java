package WebDriverMehtod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=610644599496&hvpos=&hvnetw=g&hvrand=17660439555516211018&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300528&hvtargid=kwd-298187295805&hydadcr=5657_2359491");
		System.out.println(driver.getPageSource());
	}

}
