package javaScriptExecutorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PerfromLoginFacebook {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.facebook.com/");

            JavascriptExecutor executor=(JavascriptExecutor) driver;

            executor.executeScript("document.querySelector(\"input#email\").value='John Doe'");

            WebElement passwordField=driver.findElement(By.xpath("//input[@id='pass']"));
            WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));

            executor.executeScript("arguments[0].value='password';arguments[1].click()",passwordField,loginButton);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
