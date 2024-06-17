package testD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Tc_verify {
	static String url=("http://183.82.103.245/nareshit/login.php");
	static String username=("nareshit");
	static String password=("nareshit");
	static String title1=("Orange HRM-New level of HR management");
    static String title2=("Orange HRM");
	public static void main(String[] args)throws Exception {
	System.setProperty("Webdriver.chromedriver","C:\\Users\\bhadd\\Downloads\\"
			                                     + " chromedriver_win32 (4).zip\\chromedriver.exe");
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
   driver.findElement(By.name("txtUserName")).sendKeys(username);
   driver.findElement(By.name("txtPassword")).sendKeys(password);
   Thread.sleep(3000);
   driver.findElement(By.name("Submit")).click();
   System.out.println("login completed");
   Thread.sleep(4000);
   if(driver.getTitle().equals(title2)){
   System.out.println("title matched");
  }
	else{
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
    System.out.println("logout completed");
	Thread.sleep(4000);
	driver.close();
}
}