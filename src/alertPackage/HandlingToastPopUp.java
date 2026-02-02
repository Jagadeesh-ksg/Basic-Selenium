package alertPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingToastPopUp {
    public static void main(String[] args) {
        try {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://chat.qspiders.com/");
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("lakjlksdflj");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("fjdfjfkjlki");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));

            String toastPopUp= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")))).getText();
            System.out.println("Message inside the toast popup is:"+toastPopUp);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
