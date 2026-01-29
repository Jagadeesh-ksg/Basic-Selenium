package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingScrollbyAmount {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://www.amazon.in/");

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")));

            Actions action=new Actions(driver);
          // action.scrollByAmount(0,6000).perform();
            action.scrollToElement(driver.findElement(By.xpath("//div[@class='navFooterBackToTop']")))
                    .pause(Duration.ofSeconds(1)).perform();
            action.click(wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='a-button a-spacing-mini a-spacing-top-mini a-button-span2 a-button-primary']")))))
                    .perform();
            //driver.findElement(By.xpath("//span[@class='a-button a-spacing-mini a-spacing-top-mini a-button-span2 a-button-primary']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
