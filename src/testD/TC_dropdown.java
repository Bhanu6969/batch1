package testD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_dropdown {

	public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chromedriver","C:\\Users\\bhadd\\Downloads"
			                       + "\\chromedriver_win32 (3).zip//chromedriver.exe");
    WebDriver bs=new ChromeDriver();
    bs.navigate().to("http://183.82.103.245/nareshit/login.php");
    bs.findElement(By.name("txtUserName")).sendKeys("nareshit");
    bs.findElement(By.name("txtPassword")).sendKeys("nareshit");
    Thread.sleep(3000);
    bs.findElement(By.name("Submit")).click();
    //enter into frame 
    bs.switchTo().frame("rightMenu");
    Select sb= new Select(bs.findElement(By.name("loc_code")));
    sb.selectByVisibleText("Emp. ID");
    Thread.sleep(3000);
    bs.findElement(By.name("loc_name")).sendKeys("2614");
    Thread.sleep(3000);
    bs.findElement(By.xpath("//input[@value='Search']")).click();
    Thread.sleep(3000);
    bs.findElement(By.name("chkLocID[]")).click();
    Thread.sleep(3000);
    bs.findElement(By.xpath("//input[@value='Delete']")).click();
    Thread.sleep(3000);
    //exit frame
    bs.switchTo().defaultContent();
    bs.findElement(By.linkText("Logout")).click();
    Thread.sleep(3000);
    bs.close();
	}
}
