package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySurrounding {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.get("https://www.tgsrtcbus.in/");
            Thread.sleep(4000);

            driver.findElement(By.xpath("//i[@class='fa fa-close']")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//span[@aria-required='true']")).click();
            Thread.sleep(2000);
            WebElement monthbox= driver.findElement(By.xpath("//div[@class='ant-picker-header-view']"));

            for(;;)
            {
                if(monthbox.getText().contains("Mar") && monthbox.getText().contains("2026"))
                {
                    driver.findElement(By.xpath("//div[@class='ant-picker-header-view']/../..//div[text()=10]")).click();
                    break;
                }
                else
                {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("//button[@aria-label='next-year']")).click();
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
