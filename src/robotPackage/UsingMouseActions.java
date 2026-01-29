package robotPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.time.Duration;

public class UsingMouseActions {
    public static void main(String[] args) {
        try{

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demowebshop.tricentis.com/");
            Actions action=new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath("//a[text()='Log in']"))).perform();

            Robot robot=new Robot();
            Thread.sleep(2000);
//            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
//            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
//
            robot.mouseMove(100,200);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
