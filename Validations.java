package p1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Validations {
	WebDriver driver;
  @Test(priority=1)
  public void mandatory() throws InterruptedException {
	  driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);
		String a=driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]")).getText();
//		System.out.println(a);
		Assert.assertEquals(a,"Enter an email or phone number");
		System.out.println("The username mandatory condition verified");
	  
	  
		
  }
  @Test(priority=0)
  public void mandatory2() throws InterruptedException{
	  
	  driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("venkatmanojm13");
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='password']/div[2]/div[2]")).getText(),"Enter a password");
		System.out.println("The password mandatory verified");
  }
  
  @BeforeMethod
  public void beforeSuite() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterSuite() {
	  driver.close();
  }

}
