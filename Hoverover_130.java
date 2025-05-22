package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement e1=  driver.findElement(By.linkText("Fashion"));
        e1.click();
      WebElement e2=  driver.findElement(By.xpath("//span[.=\"Fashion\"]"));
        
     // Actions a1=new Actions(driver);
     // a1.moveToElement(e2).perform();
      
      

	}

}
