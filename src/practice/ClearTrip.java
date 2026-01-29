package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
    public static void main(String[] args) {
       try
       {
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.cleartrip.com/");
           Thread.sleep(2000);

           driver.findElement(By.xpath("//div[contains(@class,'pb-1 px-1 flex flex-middle nmx-1')]")).click();
           Thread.sleep(2000);

           driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']")).click();
           Thread.sleep(2000);

           WebElement monthbox=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
           for(;;)
           {
               if(monthbox.getText().contains("January 2026"))
               {
                   driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/../..//div[text()='22']")).click();
                   break;
               }
               else {
                   Thread.sleep(2000);

                   driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']")).click();

               }

           }
           Thread.sleep(3000);
           driver.findElement(By.xpath("//div[@data-testid='dateSelectReturn']")).click();


           WebElement e1=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]"));
           for(;;)
           {
               if(e1.getText().contains("March 2026"))
               {
                   driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]/..//div[text()='19']")).click();
                   break;
               }
               else {
                   Thread.sleep(2000);

                   driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']")).click();

               }
           }
          // Thread.sleep(2000);
          // driver.findElement(By.xpath("//button[@class='sc-dhKdcB jkDAfz flex-1']")).click();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
