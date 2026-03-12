package framesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlinFrameInTutorialsPoint {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='new-tab-sample.php']")));

            String text=driver.findElement(By.xpath("//div[@class='container']/child::div[contains(.,'New Tab')]")).getText();

            System.out.println(text);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
