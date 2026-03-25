package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class EaseMyTripTask1 {
    public static void main(String[] args) {
        try{


            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");

            WebDriver driver=new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.easemytrip.com/");

            driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();

            driver.findElement(By.xpath("//input[@id='a_FromSector_show']")).sendKeys("Hyderabad");
            driver.findElement(By.xpath("//span[@id='spnHyderabad']")).click();
            driver.findElement(By.xpath("//input[@id='a_Editbox13_show']")).sendKeys("Bangalore");
            driver.findElement(By.xpath("//p[@id='airportBengaluru']")).click();


            for(;;)
            {
                String text=driver.findElement(By.xpath("//div[@class='month2']")).getText();
                if (text.equalsIgnoreCase("May 2026"))
                {
                    driver.findElement(By.xpath("//li[text()='20']")).click();
                    break;
                }

                    driver.findElement(By.xpath("//img[@src='/img/nextarrow.png']")).click();
             }


             driver.findElement(By.xpath("//p[text()='  Book a round trip']")).click();


        for(;;)
            {
                String text=driver.findElement(By.xpath("//div[@class='month2']")).getText();
                if (text.equalsIgnoreCase("Jun 2026"))
                {
                    driver.findElement(By.xpath("//li[text()='8']")).click();
                    break;
                }

                driver.findElement(By.xpath("//img[@src='/img/nextarrow.png']")).click();
          }

        driver.findElement(By.xpath("//div[@id='myFunction4']")).click();
        driver.findElement(By.xpath("(//button[@class='add plus_box1'])[1]")).click();
        driver.findElement(By.xpath("//input[@class='srchBtnSe']")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
