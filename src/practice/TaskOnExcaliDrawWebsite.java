package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TaskOnExcaliDrawWebsite {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://excalidraw.com/");
            Actions action=new Actions(driver);
            action.click(driver.findElement(By.xpath("//input[@aria-label='Rectangle']")))
                    .moveByOffset(50,50)
                    .clickAndHold()
                    .moveByOffset(400,200).release()
                    .perform();

            action.click(driver.findElement(By.xpath("//input[@data-testid='toolbar-ellipse']")))
                    .moveByOffset(70,70)
                    .clickAndHold()
                    .moveByOffset(150,150)
                    .release()
                    .perform();
            driver.findElement(By.xpath("//button[@data-testid='color-top-pick-#f08c00']")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
