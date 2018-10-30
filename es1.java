package p1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class es1 {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws Exception {
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("venkatmanojm13");
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("manu131141510");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(15000);
		System.out.println("the total number of inbox mail are:");
		Thread.sleep(15000);
		String a=driver.findElement(By.xpath("//*[@id=':jw']/span/span[2]")).getText();
		Thread.sleep(15000);
		
		System.out.println(a);
		System.out.println("The unread mails are:");
		driver.findElement(By.xpath("//*[@id=':k9']/div")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=':k9']/div/div[2]/div")).getText());
		
	}
@After
public void tearDown() throws Exception {
	System.out.println("done ");
	driver.quit();
}
}