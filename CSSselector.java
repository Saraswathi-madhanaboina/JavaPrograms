package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d1=new ChromeDriver();
		Thread.sleep(1000);
		d1.get("https://www.google.com");
		//by classname
		WebElement e1=d1.findElement(By.cssSelector(".gLFyf"));
		e1.sendKeys("India"+Keys.ENTER);
		
		

	}

}
