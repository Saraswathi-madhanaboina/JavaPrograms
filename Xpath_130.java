package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.get("file:///C:/Users/ACER/Downloads/learningHTML1.html");
		driver.get("file:///C:/Users/ACER/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
	//WebElement e1=	driver.findElement(By.xpath("(html/body/input)[1]"));
		WebElement e1=	driver.findElement(By.xpath("((/html/body/form)[2]/input[2])"));
		e1.click();
	

	}

}
