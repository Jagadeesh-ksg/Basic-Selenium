package javaScriptExecutorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PerformingScrolling {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.amazon.in/");
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))));
            JavascriptExecutor script=(JavascriptExecutor) driver;
            script.executeScript("window.scrollBy(0,2000)");
            Thread.sleep(2000);
            script.executeScript("window.scrollBy(0,2000)");
            //script.executeScript("window.scrollTo(0,2000)");
            //script.executeScript("window.scrollTo(0,2000)");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
