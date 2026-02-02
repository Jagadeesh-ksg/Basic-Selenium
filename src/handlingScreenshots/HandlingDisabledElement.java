package handlingScreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDisabledElement {
    public static void main(String[] args) {
        try{
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//            driver.get("https://practicetestautomation.com/practice-test-exceptions/");
//            JavascriptExecutor executor=(JavascriptExecutor) driver;
//
//
//            executor.executeScript("let inputField=document.querySelector(\"input[class='input-field']\");\n" +
//                    "inputField.disabled=false;\n" +
//                    "inputField.value='Biryani'");

            driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html ");

            JavascriptExecutor executor=(JavascriptExecutor) driver;

            WebElement passwordField= driver.findElement(By.xpath("//input[@id='pass']"));


            executor.executeScript("arguments[0].removeAttribute('disabled');arguments[0].value='password'",passwordField);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
