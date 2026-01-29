package framesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingNestedFrames {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://www.globalsqa.com/demo-site/draganddrop/ ");

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/droppable/photo-manager.html']")));

            WebElement srcElement=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
            WebElement destElement= driver.findElement(By.xpath("//div[@id='trash']"));

            Actions action=new Actions(driver);
            action.dragAndDrop(srcElement,destElement).perform();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
