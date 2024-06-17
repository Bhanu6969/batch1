package testD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Tcoo1 {
	public static void main(String[] args) throws Exception{
	System.setProperty("Webdriver.chromedriver", "C:\\Users\\bhadd\\Downloads\\chromedriver_win32 (3).zip\\chromedriver.exe");
    WebDriver ball= new ChromeDriver();
    ball.navigate().to("http://183.82.103.245/nareshit/login.php");
    Thread.sleep(3000);
    ball.findElement(By.name("txtUserName")).sendKeys("nareshit");
    ball.findElement(By.name("txtPassword")).sendKeys("nareshit");
    Thread.sleep(3000);
    ball.findElement(By.name("Submit")).click();
    ball.findElement(By.linkText("Logout")).click();
    Thread.sleep(3000);
    ball.close();
	}

}
