package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //Launch Browser
        WebDriver driver=new ChromeDriver();
        //Launch URL
       // driver.get("https://the-internet.herokuapp.com/key_presses");
        //Maximize Browser
        driver.manage().window().maximize();
        //Actions action=  new Actions(driver);
        //action.sendKeys(Keys.ENTER).perform();
       // action.sendKeys(Keys.BACK_SPACE);
      //  Thread.sleep(3000);
        //driver.quit();
        // Right Click
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/async-promise.html");
        Actions act= new Actions(driver);
        //Locate element to perform right click operation
        WebElement rightclickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        act.contextClick(rightclickBtn).perform();
        Thread.sleep(3000);
        act.doubleClick();
        //Close the Browser
        driver.quit();

    }
}
