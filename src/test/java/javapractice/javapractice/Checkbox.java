package javapractice.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\2174324\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	      WebDriver driver =new ChromeDriver();

	      driver.get("https://www.spicejet.com/");
	      System.out.println(driver.findElement(By.cssSelector("div[class*=Senior Citizen")).getText());
	}

}
