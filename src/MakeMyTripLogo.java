
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripLogo {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\USER\\workspace\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;   
        
        WebElement logoElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/a/picture/img"));
        
        // Verify if the logo element is displayed on the page
        if (logoElement.isDisplayed()) {
            System.out.println("MakeMyTrip logo is present ");
        } else {
            System.out.println("MakeMyTrip logo is not present ");
        }
        
        // Close the browser
        driver.close();
    }
}
