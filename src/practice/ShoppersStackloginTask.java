package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppersStackloginTask {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.shoppersstack.com/");

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']"))).click();

            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jagadeesh@gmail.com");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jagadeesh");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
