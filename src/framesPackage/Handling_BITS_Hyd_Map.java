package framesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Handling_BITS_Hyd_Map {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.bits-pilani.ac.in/hyderabad/");

            Actions action=new Actions(driver);

            action.pause(Duration.ofSeconds(2))
                    .scrollToElement(driver.findElement(By.xpath("//h2[text()='BITS Hyderabad in 360°']")))
                    .perform();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://www.google.com/maps/embed?')]")));

            Thread.sleep(2000);

           driver.findElement(By.xpath("//button[@aria-label='Show satellite imagery']")).click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
