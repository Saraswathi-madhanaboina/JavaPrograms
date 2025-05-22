package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable_134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.get("file:///C:/Users/ACER/Downloads/learningHTML1.html");
		driver.get("file:///C:/Users/ACER/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("username"));
	boolean b1=	e1.isDisplayed();
	boolean b2=	e1.isEnabled();
	if(b1==true && b2==true) {
		e1.sendKeys("saru");
	
		
	}

	}

}
