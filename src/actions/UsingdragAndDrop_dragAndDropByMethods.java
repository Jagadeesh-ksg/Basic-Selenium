package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingdragAndDrop_dragAndDropByMethods {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.qa-practice.com/elements/dragndrop/images");
            Actions action=new Actions(driver);
            WebElement sourceElement= driver.findElement(By.xpath("//img[@src='/static/home/smile.png']"));
            WebElement targetElement= driver.findElement(By.xpath("//div[@id='rect-droppable2']"));
            //action.dragAndDrop(sourceElement,targetElement ).perform();
//            action.dragAndDropBy(sourceElement,100,100)
//                    .pause(Duration.ofSeconds(1))
//                    .dragAndDropBy(sourceElement,150,100)
//                    .pause(Duration.ofSeconds(1))
//                    .dragAndDropBy(sourceElement,75,-100)
//                    .pause(Duration.ofSeconds(1))
//                    .dragAndDropBy(sourceElement,50,50)
//                    .perform();
            action.pause(Duration.ofSeconds(1))
                    .moveToElement(driver.findElement(By.xpath("//a[text()='Boxes']")))
                    .click().perform();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
