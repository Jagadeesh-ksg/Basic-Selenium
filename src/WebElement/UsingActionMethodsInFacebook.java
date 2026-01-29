package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingActionMethodsInFacebook {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.facebook.com/");
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jagadeesh@gmail.com");
            driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jagadeesh");
//            driver.findElement(By.xpath("//button[@name='login']")).submit();
            WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
            System.out.println(loginbutton.getCssValue("background-color"));

//            Thread.sleep(2000);
//            driver.get("https://x.com/i/flow/login");
//            driver.findElement(By.xpath("//input[@name='text']")).sendKeys("7893788193");
//            //driver.findElement(By.xpath("//span[text()='Next']")).submit();
//            driver.findElement(By.xpath("//span[text()='Next']")).click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
