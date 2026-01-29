package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySingleAttribute {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://x.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@href='/i/flow/signup']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys("abc");
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
