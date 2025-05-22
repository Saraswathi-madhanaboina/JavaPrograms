package selenium_assignments;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle_123 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		// Click the link that opens a new window
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Books");
	e1.sendKeys(Keys.ENTER);
	//driver.close();
	String windowHandles =driver.getWindowHandle();
	System.out.println(windowHandles);
	
	}}    