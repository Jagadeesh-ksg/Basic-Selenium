package framesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingBITSPilaniMapFrame {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.bits-pilani.ac.in/hyderabad/");

            Actions action=new Actions(driver);
            action.scrollToElement(driver.findElement(By.xpath("//h2[text()='BITS Hyderabad in 360°']")))
                    .perform();
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15216.864931279373!2d78.571838!3d17.5448888!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bcb83594a86132d%3A0xc3e06e9e76cebf3d!2sBirla%20Institute%20of%20Technology%20%26%20Science%20Pilani%2C%20Hyderabad%20Campus!5e0!3m2!1sen!2sin!4v1682093837024!5m2!1sen!2sin']")));

            driver.findElement(By.xpath("//button[@class='gm-inset-map gm-inset-light']")).click();






        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
