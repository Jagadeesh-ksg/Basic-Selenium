package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingClickAndHoldMethod {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://yonobusiness.sbi.bank.in/");


            driver.findElement(By.xpath("//span[@class='ng-tns-c2785778308-3 icon-cancel']")).click();
            Actions action= new Actions(driver);
            action.click(driver.findElement(By.xpath("//div[@id='login-dropdown']"))).pause(Duration.ofSeconds(5))
                    .click(driver.findElement(By.xpath("//li[@id='loginOfmenu']"))).perform();

            Thread.sleep(2000);
            action.sendKeys(driver.findElement(By.xpath("//input[@type='password']")),"Password@1234").pause(Duration.ofSeconds(2))
                    .clickAndHold(driver.findElement(By.xpath("//img[@src='assets/img/Revamp/icon_eye_close.svg']")))
                    .pause(Duration.ofSeconds(5)).release()
                    .perform();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
