package testD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_KB_WD {

	public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chromedriver","C:\\Users\\bhadd\\Downloads\\"
		                 	           + "chromedriver_win32 (3).zip\\chromedriver.exe");
	WebDriver bs=new ChromeDriver();
	bs.navigate().to("https://www.google.co.in/");
	Thread.sleep(3000);
	bs.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	bs.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	bs.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	bs.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	bs.close();
	}

}
