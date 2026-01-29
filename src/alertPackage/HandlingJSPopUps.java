package alertPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingJSPopUps {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demo.automationtesting.in/Alerts.html");

            driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
            Thread.sleep(2000);
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert=driver.switchTo().alert();

            //alert.accept();

            alert.dismiss();

            driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
            driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            wait.until(ExpectedConditions.alertIsPresent()).accept();

            driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
            driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

            Thread.sleep(2000);
            Alert promptAlert=driver.switchTo().alert();
            promptAlert.sendKeys("Demo tester");
            promptAlert.accept();
            //promptAlert.dismiss();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
