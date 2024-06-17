package testD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tc_frames {

//	public static void main(String[] args)throws Exception {
//	System.setProperty("WebDriver.Chromedriver", "C:\\Users\\bhadd\\Downloads\\chromedriver_win32 "
//			+                                                  "  (3).zip\\chromedriver.exe");
//    WebDriver bs= new ChromeDriver();
//    bs.navigate().to("http://183.82.103.245/nareshit/login.php");
//    System.out.println(bs.getTitle());
//    bs.findElement(By.name("txtUserName")).sendKeys("nareshit");
//    bs.findElement(By.name("txtPassword")).sendKeys("nareshit");
//    bs.findElement(By.name("Submit")).click();
//    System.out.println("login completed");
//    Thread.sleep(3000);
//    // enter into the frame
//    bs.switchTo().frame("rightMenu");
//    bs.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
//    System.out.println("click on Add button");
//    Thread.sleep(4000);
//    bs.findElement(By.name("txtEmpFirstName")).sendKeys("Bhanu");
//    bs.findElement(By.name("txtEmpLastName")).sendKeys("prasad");
//    bs.findElement(By.id("btnEdit")).click();
//    System.out.println("new emp added");
//    Thread.sleep(4000);
//    //exit into frame
//    bs.switchTo().defaultContent();
//    bs.findElement(By.linkText("Logout")).click();
//    Thread.sleep(3000);
//    bs.close();
//	}
//
	public static void main (String []args)throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhadd\\Downloads\\chromedriver_win32 (3).zip//chromedriver.exe");
	WebDriver call=new ChromeDriver();
	call.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println(call.getTitle());
	call.findElement(By.name("txtUserName")).sendKeys("nareshit");
	call.findElement(By.name("txtPassword")).sendKeys("nareshit");
	call.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Thread.sleep(3000);
	// enter into the frame
	call.switchTo().frame("rightMenu");
	call.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	System.out.println("click on add btn");
	Thread.sleep(4000);
	call.findElement(By.name("txtEmpFirstName")).sendKeys("Bhanu");
	call.findElement(By.name("txtEmpLastName")).sendKeys("Prasad");
	call.findElement(By.id("btnEdit")).click();
	System.out.println("new emp added");
	Thread.sleep(3000);
	// exit into frame
	call.switchTo().defaultContent();
	call.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	call.close();
	}
}
