package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
	 System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.get("http://3.17.160.121:32773/addressbook/");
	}
  @Test
  public void verifyaddbook() {
	  
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Neelesh");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Sharma");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("2546566");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("acv@email.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("10/10/1999");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click(); 
  }
  @AfterMethod
  public void close()
  {
	  //driver.close();
  }
  }
  
