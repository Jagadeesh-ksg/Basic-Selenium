package alertPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingJsPopUp {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://vinothqaacademy.com/alert-and-popup/");

            driver.findElement(By.xpath("//button[@name='alertbox']")).click();

            Thread.sleep(2000);
            Alert alert=driver.switchTo().alert();

            alert.accept();

            driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
            Thread.sleep(2000);
            alert.dismiss();

            driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
            Thread.sleep(2000);
            alert.sendKeys("Yes");
            Thread.sleep(2000);
            alert.accept();




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
