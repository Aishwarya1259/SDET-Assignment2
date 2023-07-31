import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC_01_MakeMyTripLogoTest extends TestBase{
	@Test
	public void testMakeMyTrip(){
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/a/picture/img"));
if (logo.isDisplayed())
	System.out.println("MakeMyTrip logo is present ");
else
	System.out.println("MakeMyTrip logo is not present ");
	}
}