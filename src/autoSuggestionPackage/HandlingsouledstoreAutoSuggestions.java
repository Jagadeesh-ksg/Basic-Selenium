package autoSuggestionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class HandlingsouledstoreAutoSuggestions {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.thesouledstore.com/");

            driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sneakers");


            List<WebElement> allOps=driver.findElements(By.xpath("//li[contains(@class,'autocomplete-result')]/descendant::p[@class='autocomplete-list text-capitalize']"));

            for(WebElement option:allOps)
            {
                if(option.getText().equals("High Ankle Sneakers"))
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
