package testD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class Tc_mouseover {
static String url=("http://183.82.103.245/nareshit/login.php");	
static String username= "nareshit";
static String password= "nareshit";
static String title1= "Orange HRM-new level of HR managemenet";
static String title2="OrangeHRM";
public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chromedriver",
			"C:\\Users\\bhadd\\Downloads\\chromedriver_win32 (3).zip\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(url);
	if(driver.getTitle().equals(title1)) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//test data: variable: mentioned in same step
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Thread.sleep(4000);
	if(driver.getTitle().equals(title2)) {
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("clicked on submenu");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	Thread.sleep(4000);
	driver.close();
	
}
}
