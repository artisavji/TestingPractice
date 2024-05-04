import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {

        //Launch Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  //maximize browser
        driver.get("https://demo.nopcommerce.com/");

       /* //taking Screenshot of full page
   Thread.sleep(2000);
   TakeScreenshot ts= (TakeScreenshot) driver;
   // File src=ts.
    */

        //Taking Screenshot of Portion or Section
        WebElement section =driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File src=section.getScreenshotAs(OutputType.FILE);
        File target= new File(".//Screenshots//section.png");
        FileUtils.copyFile(src,target);
        Thread.sleep(2000);
            driver.quit();

      //Take screenshot of specific element
        WebElement element=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store'"));
        File src1=element.getScreenshotAs(OutputType.FILE);
        File target1 = new File(".//Screenshots//element.png");
        FileUtils.copyFile(src, target1);
        Thread.sleep(2000);
        driver.close();
    }
}




