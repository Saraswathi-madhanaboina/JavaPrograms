package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_129 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		//s1.selectByIndex(2);
		s1.selectByVisibleText("Amazon Fresh Meat");
		Thread.sleep(2000);
		s1.selectByValue("search-alias=nowstore");
		}

}
