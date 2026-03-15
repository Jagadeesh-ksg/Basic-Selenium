package framesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingAnnieBesantCollegeFrame {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://anniebesant.org/");

            Actions action=new Actions(driver);
            action.scrollToElement(driver.findElement(By.xpath("//div[@class='col-md-12 copyright-item']")))
                    .perform();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://www.google.com/maps')]")));

            driver.findElement(By.xpath("//button[@aria-label='Show street map']")).click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
