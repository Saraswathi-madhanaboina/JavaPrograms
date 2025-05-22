package selenium_assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maxmin_127 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();

	}

}
