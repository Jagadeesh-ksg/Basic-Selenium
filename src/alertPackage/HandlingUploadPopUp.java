package alertPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class HandlingUploadPopUp {
    public static void main(String[] args) {
        try{
          System.setProperty("webdriver.edge.driver","./AllBrowserDrivers/msedgedriver.exe");
          WebDriver driver=new EdgeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://automationtesting.co.uk/fileupload.html");

          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@id='fileToUpload']"))
                  .sendKeys("C:\\Users\\Jagadeesh Kurma\\OneDrive\\Desktop\\dummy.txt");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@name='submit']")).click();

            driver.get("https://practice.expandtesting.com/upload#google_vignette");

            Actions action=new Actions(driver);
            action.scrollToElement(driver.findElement(By.xpath("//button[@id='fileSubmit']"))).perform();
            action.click(driver.findElement(By.xpath("//input[@id='fileInput']"))).perform();

            StringSelection path=new StringSelection("C:\\Users\\Jagadeesh Kurma\\OneDrive\\Desktop\\dummy.txt");

            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
            Thread.sleep(2000);
            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress((KeyEvent.VK_V));
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
