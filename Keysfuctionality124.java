package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysfuctionality124 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        // Locate the search input box
        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        // Type a query and simulate pressing ENTER
        e1.sendKeys("Books");
        e1.sendKeys(Keys.ENTER);

        // Wait a bit for results (not ideal - better to use WebDriverWait)
        Thread.sleep(3000);

        // Print the title of the resulting page
        System.out.println("Page Title After Search: " + driver.getTitle());

        // Scroll down using PAGE_DOWN key
        WebElement e2 = driver.findElement(By.tagName("body"));
        e2.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        e2.sendKeys(Keys.PAGE_DOWN);


	}

}
