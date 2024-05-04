import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Xpath Practice


public class SeleniumXpathPractice4 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        //Relative X path
        driver.findElement(By.xpath("//label[text()='Enter your search keyword']"));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sold out");

    }

}
