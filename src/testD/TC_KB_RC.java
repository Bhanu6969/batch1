package testD;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_KB_RC {
public static void main(String[]args)throws Exception {
	System.setProperty("webdriver.chromedriver","C:\\Users\\bhadd\\Downloads"
		                               	+"\\chromedriver_win32 (3).zip//chromedriver.exe");
	WebDriver siri=new ChromeDriver();
	siri.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println(siri.getTitle());
	siri.findElement(By.name("txtUserName")).sendKeys("nareshit");
	siri.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	// click : keyboard : 1.Tab 2.Enter
	Robot bs=new Robot();
	bs.keyPress(KeyEvent.VK_TAB);
	bs.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	System.out.println("Tab");
	bs.keyPress(KeyEvent.VK_ENTER);
	bs.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	System.out.println("Enter");
	System.out.println("login completed");
	siri.findElement(By.linkText("Logout")).click();
	System.out.println("logiout completed");
	siri.close();
}
}
