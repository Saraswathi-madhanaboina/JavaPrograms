package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		WebElement e1=d1.findElement(By.name("q"));
		e1.sendKeys("russia");
		Thread.sleep(1000);
	List<WebElement>e2=d1.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
	e2.get(1).click();


	}

}
