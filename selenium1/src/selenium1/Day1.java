package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\v\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

System.out.println(driver.getPageSource());

	}

}
