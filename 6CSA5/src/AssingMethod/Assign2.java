package AssingMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign2 {
	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.com");		
     	Dimension d1=new Dimension(700,800);
		driver1.manage().window().setSize(d1);
		Point p=new Point(700,10);
		driver1.manage().window().setPosition(p);
		
		
		WebDriver driver2=new 	EdgeDriver();
		driver2.get("https://www.fb.com");
		Dimension d2=new Dimension(700,800);
		driver2.manage().window().setSize(d2);
		Point p1=new Point(700,10);
		driver1.manage().window().setPosition(p1);
	}

}
