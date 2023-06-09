package Manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");

		Point p = new Point(500, 300);
		driver.manage().window().setPosition(p);

		System.out.println(driver.manage().window().getPosition()); // To Know The Position Of Current Window
		driver.close();
	}
}
