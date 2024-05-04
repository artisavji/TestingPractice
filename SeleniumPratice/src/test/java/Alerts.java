import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {
    //22 April Alert Types
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();

        //handle Notification Box //after end of program, can add this code
       /* ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notification");
        */
       //Thread.sleep(2000);

        //Simple Alerts
        //Locating Webelements
        /*driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Thread.sleep(2000);
          //Switch to Alert
        driver.switchTo().alert().accept();
        Thread.sleep(2000);*/

        /*//Conformation PopUp
        WebElement AlertWithOkAndCancel=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
        AlertWithOkAndCancel.click();
        //Click on Alert
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        //switch to alert box & accept it
       *//*driver.switchTo().alert().accept();
       Thread.sleep(4000);*//*

       //Dismiss Alert
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);*/

         //Prompt Alert
        WebElement AlertWithText = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
        AlertWithText.click();
        //Click on alert button
        //driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        //switch to alert box
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Arti");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.quit();
    }
}
