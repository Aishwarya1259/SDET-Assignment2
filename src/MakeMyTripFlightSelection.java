import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MakeMyTripFlightSelection {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\workspace\\geckodriver.exe");//"C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        
        //select Flights
        driver.findElement( By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/a[1]"));
        //Select one-way
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
        
        //Give the FROM city
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]")).sendKeys("Delhi");
        
        //Give TO city
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).sendKeys("Bengaluru");
        
        String URL=driver.getCurrentUrl();
        if(URL=="https://www.makemytrip.com/flights/") {
        	 
                 System.out.println("Flight search is sucessfull.");
             } else {
                 System.out.println("Flight search is not sucessfull. ");
             }
        }
        
    }
