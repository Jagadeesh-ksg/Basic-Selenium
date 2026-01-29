package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowInInstagram {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.instagram.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("7893788193");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("11021a2543");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//span[@aria-describedby='_r_3_']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[contains(@aria-label,'Search input')]")).sendKeys("nani");
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//span[contains(@class,'x1lliihq x1plvlek xryxfnj x1n2onr6 xyejjpt x15dsfln x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x1i0vuye xvs91rp x1s688f x5n08af x10wh9bi xpm28yp x8viiok x1o7cslx')])[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(@class,' _aswp _aswr _aswu _aswy _asw_ _asx2')]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswv _aswy _asw_ _asx2'][@type='button']")).click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
