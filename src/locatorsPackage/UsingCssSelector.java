package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.instagram.com/");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[name='username']")).sendKeys("123");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[name='password']")).sendKeys("567");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button._aswp._aswr._aswu._asw_._asx2")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
