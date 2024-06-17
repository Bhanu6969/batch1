package testD;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_alerts {

	public static void main(String[] args)throws Exception {
	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\bhadd\\Downloads\\chromedriver_win32 (3).zip//chromedriver.exe");
    WebDriver up=new ChromeDriver();
    up.navigate().to("http://183.82.103.245/nareshit/login.php");
    up.findElement(By.name("txtUserName")).sendKeys("nareshit");
    up.findElement(By.name("Submit")).click();
    Thread.sleep(3000);
    Alert ac=up.switchTo().alert();
    System.out.println(ac.getText());
    ac.accept();
    up.findElement(By.name("txtPassword")).sendKeys("nareshit");
    up.findElement(By.name("Submit")).click();
    System.out.println("login completed");
    up.findElement(By.linkText("Logout")).click();
    Thread.sleep(3000);
    up.close();
	}
}
