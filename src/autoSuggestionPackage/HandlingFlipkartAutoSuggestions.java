package autoSuggestionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingFlipkartAutoSuggestions {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.flipkart.com/");
//            driver.findElement(By.xpath("//span[@role='button']")).click();

            driver.findElement(By.xpath("//input[@class='lNPl8b']")).sendKeys("samsung");
            List<WebElement> allOps=driver.findElements(By.xpath("//ul[@class='col-12-12 I01Bvi']"));
            for(WebElement option:allOps)
            {
                if(option.getText().equals(" s24 fe"))
                {
                    option.click();
                    break;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
