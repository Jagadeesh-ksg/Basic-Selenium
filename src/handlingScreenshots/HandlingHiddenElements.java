package handlingScreenshots;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingHiddenElements {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.facebook.com/r.php?entry_point=login");
            JavascriptExecutor executor=(JavascriptExecutor) driver;

            executor.executeScript("document.querySelector('input#custom_gender').value='call me flower'");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
