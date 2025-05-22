package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfb_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e1=driver.findElement(By.id("email"));
		e1.click();
		e1.sendKeys("9652017172");
		WebElement e2=driver.findElement(By.id("pass"));
		e2.sendKeys("Saru123");
		e2.sendKeys(Keys.ENTER);
		}

}
