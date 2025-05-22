package selenium_assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_website2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d1=new ChromeDriver();
		Thread.sleep(1000);
		d1.get("https://www.google.com");
}}
		