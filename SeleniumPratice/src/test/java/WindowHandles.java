import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();




       /*String current_windowID=driver.getWindowHandle();
        System.out.println("Current WindowID:"+current_windowID );
        Thread.sleep(2000);*/
       // driver.quit();



        // Click on link to open new tab
      driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
      Thread.sleep(2000);
      driver.quit();



      // Handle windows
        Set<String>wid= driver.getWindowHandles();
        List<String>wids=new ArrayList(wid); //converting set into list
        String ParentWindow=wids.get(0);
        String ChildWindow=wids.get(1);



        //Second Method  //Second Way
        Iterator<String> itr= wid.iterator();
        String Parentwindow=itr.next();
        String Childwindow=itr.next();
        System.out.println("parent windowID:"+Parentwindow +"Child WindowID:"+Childwindow);



        //Switch to Window
        driver.switchTo().window(Childwindow);
        System.out.println("Tittle of second Window:"+driver.getTitle());
        driver.quit();



    }
}
