package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class FlipkartTaskAddToCart {
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            //Thread.sleep(2000);

            driver.get("https://www.flipkart.com/");
            //Thread.sleep(2000);

            String parentId = driver.getWindowHandle();

            driver.findElement(By.xpath("//input[@class='lNPl8b']")).sendKeys("vivo x300 pro");
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            //Thread.sleep(2000);
            driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[2]")).click();
            //Thread.sleep(2000);


            Set<String> allPageId = driver.getWindowHandles();
            for (String pageId : allPageId) {
                if (pageId.equals(parentId)) {
                    continue;
                } else {
                    driver.switchTo().window(pageId);
                    break;
                }
            }
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='dSM5Ub ugg2XR IUmgrZ']")).click();

            //Thread.sleep(2000);
            driver.switchTo().window(parentId);
            //Thread.sleep(2000);
            driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[1]")).click();

            Set<String> newId = driver.getWindowHandles();
            for(String id:newId)
            {
                if(id.equals(parentId))
                {
                    continue;
                }
                else {
                    driver.switchTo().window(id);
                    String title= driver.getTitle();
                    if(title.equals("vivo X300 Pro (512 GB Storage, 16 GB RAM) Online at Best Price On Flipkart.com")) {
                        //Thread.sleep(2000);
                        driver.findElement(By.xpath("//button[contains(@class,'dSM5Ub ugg2XR IUmgrZ')]")).click();

                    }

                }
            }





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
