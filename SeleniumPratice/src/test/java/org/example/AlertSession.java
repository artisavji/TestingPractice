package org.example;
//Alert &PopUp
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertSession {
    public static void main(String[] args) throws InterruptedException {
        //Launch Browser
        WebDriverManager.chromedriver().setup();
        //Creating variable Object
        WebDriver driver=new ChromeDriver();
        //navigate URL
        driver.get("https://demo.nopcommerce.com");
        //maximize browser
        driver.manage().window().maximize();
        //        Handle notification box
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notification");
        // Navigate to URL
        driver.get("https://demo.automationtesting.in/Alerts.html");
        // Simple Alert
       //Locating web element
        driver.findElement(By.xpath("/button[@class='btn btn-danger']")).click();
        Thread.sleep(3000);
        //      // switch to alert
       // driver.switchTo().alert().accept();
        //Thread.sleep(3000);
        //        //Confirmation Alert
        WebElement AlertWithOkAndCancel=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
       AlertWithOkAndCancel.click();
       //Click On Alert Button
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        //Switch to Alert box and accept it
            driver.switchTo().alert();
            Thread.sleep(3000);
            //How to Dismiss/cancel the alert
        driver.switchTo().alert().dismiss();
      Thread.sleep(3000);

      //Prompt Alert
        WebElement AlertwithText=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
AlertwithText.click();
//click on Alert button
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        //switch to alert box
        driver.switchTo().alert().sendKeys("Arti");
        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
          Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        //capturing text fro popup
        String popup_Text=alert.getText();
        System.out.println("Popup Text:"+popup_Text);
        Thread.sleep(3000);
        alert.accept();
        //Closing Browser
        driver.quit();
    }
}
