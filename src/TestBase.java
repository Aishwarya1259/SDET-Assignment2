import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class TestBase {
 public WebDriver driver= new FirefoxDriver();


@BeforeMethod
public void setup(){
	System.setProperty("webdriver.firefox.driver", "C:\\Users\\USER\\workspace\\geckodriver.exe");
	 //WebDriver driver = new FirefoxDriver();
      driver.get("https://www.makemytrip.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}
	