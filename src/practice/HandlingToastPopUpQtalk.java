package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingToastPopUpQtalk {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://chat.qspiders.com/");

            Actions action=new Actions(driver);
             action.sendKeys(driver.findElement(By.xpath("//input[@name='username']")),"jagadeesh").perform();

             action.sendKeys(driver.findElement(By.xpath("//input[@name='password']")),"jagaddeesh").perform();

             action.click(driver.findElement(By.xpath("//button[@type='submit']"))).perform();

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
            WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[contains(@class,'Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter')]/following-sibling::div"))));

            System.out.println("the toast pop up is:"+element.getText());




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
