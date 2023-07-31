import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class TC_02_MakeMyTripFlightSelection extends TestBase{

@Test
public void testMakeMyTrip(){
	//select flight
	WebElement flight=driver.findElement( By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/a[1]"));
	flight.click();;
	//Select one-way
    WebElement oneway=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
    oneway.click();
    //Give the FROM city
    WebElement from=driver.findElement(By.id("fromCity"));
    from.clear();
    from.sendKeys("Mumbai");
    
    //Give TO city
    WebElement to=driver.findElement(By.id("toCity"));
    to.clear();
    to.sendKeys("Bengaluru");
    
    String URL=driver.getCurrentUrl();
    if(URL=="https://www.makemytrip.com/flights/") {
    	 
             System.out.println("Flight search is sucessfull.");
         } else {
             System.out.println("Flight search is not sucessfull. ");
         }
    }


}



