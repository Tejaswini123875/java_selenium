package javapractice.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2174324\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//Invoking Browser
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 Thread.sleep(3000);
		 driver.quit();
		 
	}

}
