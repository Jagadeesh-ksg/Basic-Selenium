package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingScrollToElementMethod {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.flipkart.com/");
           Actions action=new Actions(driver);
            action.scrollToElement(driver.findElement(By.xpath("//span[text()='Most searched for on Flipkart']")))
                    .click(driver.findElement(By.xpath("//a[@href='/brands']")))
                    .perform();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
