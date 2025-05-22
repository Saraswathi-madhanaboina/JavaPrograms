package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		WebElement e1=d1.findElement(By.id("email"));
		e1.click();

	}

}
