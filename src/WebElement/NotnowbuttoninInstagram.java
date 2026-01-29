package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class NotnowbuttoninInstagram {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.instagram.com/");
            driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("7893788193");
            driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("11021a2543");
            driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']")).click();


            WebElement rememberbox= driver.findElement(By.xpath("//div[@class='html-div x14z9mp x1lziwak xexx8yu xyri2b x18d9i69 x1c1uobl x9f619 xjbqb8w x78zum5 x15mokao x1ga7v0g x16uus16 xbiv7yw xw7yly9 x1yztbdb x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
            rememberbox.findElement(By.xpath("//div[text()='Not now']")).click();
            driver.findElement(By.xpath("//div[text()='OK']")).click();
            driver.findElement(By.xpath("//span[@aria-describedby='_R_krcldcpbn6b5ipam_']")).click();
            driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("Qspiders");

            List<WebElement> allInstitutenames= driver.findElements(By.xpath("//span[@dir='auto' and contains(text(),'qspiders')]"));

            for(WebElement name:allInstitutenames)
            {
                if(name.getText().contains("dilsukhnagar"))
                {
                    name.click();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
