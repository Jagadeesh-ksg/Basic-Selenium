package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.makemytrip.com/");
            Thread.sleep(3000);

            String monthname="March 2026";
            String date="10";

            driver.findElement(By.xpath("//img[contains(@src,'https://jsak.mmtcdn.com/pwa/platform-myra-ui/static/sub_icons/close-icon.png')]")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@class='coachmark']")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//label[@for='departure']")).click();
            Thread.sleep(2000);

            WebElement monthbox=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));

            for(;;)
            {
                if(monthbox.getText().equals(monthname))
                {
                    driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/following::p[text()='"+date+"']")).click();
                    break;
                }
                else {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
