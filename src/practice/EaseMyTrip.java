package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class EaseMyTrip {
    public static void main(String[] args) {
        try
        {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--diable-notifications--");
            WebDriver driver=new ChromeDriver(options);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.easemytrip.com/");
            Thread.sleep(4000);
            driver.findElement(By.xpath("//p[@id='rtag']")).click();
            Thread.sleep(2000);
            WebElement monthbox= driver.findElement(By.xpath("(//div[@class='month2'])[2]"));
            while(true)
            {
                if(monthbox.getText().contains("Feb 2026"))
                {
                    driver.findElement(By.xpath("(//div[@class='month2'])[2]/../..//li[text()='10']")).click();
                    //driver.findElement(By.xpath("(//ul[@class='bor-d31'])[2]")).click();

                }
                else
                {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
