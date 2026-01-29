package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingMoveToElementMethod {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://excalidraw.com/");
            Actions action=new Actions(driver);
            action.pause(Duration.ofSeconds(1))
                    .click(driver.findElement(By.xpath("//input[@aria-label='Draw']")))
                    .moveByOffset(-200,80)
                    .clickAndHold()
                    .moveByOffset(500,0)
                    .release()
                    .pause(Duration.ofSeconds(1))
                    .clickAndHold()
                    .moveByOffset(0,200)
                    .release()
                    .pause(Duration.ofSeconds(1))
                    .clickAndHold()
                    .moveByOffset(-500,0)
                    .release()
                    .pause(Duration.ofSeconds(1))
                    .clickAndHold()
                    .moveByOffset(0,-200)
                    .perform();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
