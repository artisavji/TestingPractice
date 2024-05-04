import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Creating Instance of WebDriver to access any Browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.firstcry.com/"); //Launch Browser
        driver.manage().window().maximize();
        Thread.sleep(2000);//navigate URL
        driver.quit();
        driver.findElement(By.xpath(""));

    }
}
