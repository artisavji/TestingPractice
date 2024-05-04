package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ScrollDown {
    public static void main(String[] args) throws InterruptedException {
        // Launch Browser
        WebDriverManager.chromedriver().setup();
        // Creating variable Object
        WebDriver driver= new ChromeDriver();
        //navigate URL
        driver.get("https://demo.nopcommerce.com/");
        //maximize browser
        driver.manage().window().maximize();


      /*  // To scroll down to element using pixel
        JavascriptExecutor js= (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        //close Browser
        driver.close();
*/
        /*//To Scroll down to visible element
        WebElement element=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
JavascriptExecutor js1= (JavascriptExecutor) driver;
js1.executeScript("argument[0].scrollIntoView(true)",element);
    Thread.sleep(4000);*/

        // To scroll down to element using action class

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(3000);
        driver.quit();

    }
}
