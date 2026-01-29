package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocators {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.facebook.com/");
            Thread.sleep(2000);
            driver.findElement(By.name("email")).sendKeys("7893788193");
            Thread.sleep(2000);
            driver.findElement(By.id("pass")).sendKeys("jagadeesh@123");
            Thread.sleep(2000);
            driver.findElement(By.name("login")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
