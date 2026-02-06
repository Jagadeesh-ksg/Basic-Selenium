package javaScriptExecutorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DownloadingJDK {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.oracle.com/java/technologies/javase-jdk21-doc-downloads.html");

            driver.findElement(By.xpath("//a[text()='jdk-21.0.10_doc-all.zip']")).click();

            //WebElement requiredInput= driver.findElement(By.xpath("//label[@for='licenseAccept']/child::input[@value='194']"));

            JavascriptExecutor executor=(JavascriptExecutor) driver;

            executor.executeScript("document.querySelector(\"a[class='download-file icn-download']\").click();");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
