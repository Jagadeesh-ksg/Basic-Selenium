package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardMethods {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.youtube.com/");
            Actions action=new Actions(driver);
            action.click(driver.findElement(By.xpath("//input[@name='search_query']")))
                    .keyDown(Keys.SHIFT)
                    .sendKeys("s")
                    .keyUp(Keys.SHIFT)
                    .sendKeys("eleniu")
                    .keyDown(Keys.SHIFT)
                    .sendKeys("mfullc")
                    .keyUp(Keys.SHIFT)
                    .sendKeys("ourse").perform();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
