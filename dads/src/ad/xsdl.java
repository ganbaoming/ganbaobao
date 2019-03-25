package ad;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class xsdl {
	 private WebDriver driver;
	  private String baseUrl;
	@BeforeClass
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		 driver=new ChromeDriver();//启动谷歌浏览器
		    baseUrl = "http://localhost:8080/examsys/login.thtml";

	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  @Test
	  public void testUntitled() throws Exception {
	    driver.get(baseUrl);
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("hujianming");
	    driver.findElement(By.name("userpass")).clear();
	    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	    new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("管理员");
	    Thread.sleep(8000);
	    driver.findElement(By.cssSelector("button.tm_btn")).click();
	  }

	  @AfterClass
	  public void tearDown() throws Exception {
	    //driver.quit();
	  }
}
