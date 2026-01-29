package webdrivermethodspackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingManageMethods {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            Thread.sleep(2000);
            driver.get("http://facebook.com/");
            Thread.sleep(2000);
//            driver.manage().window().maximize();
//            Thread.sleep(2000);
//            driver.manage().window().fullscreen();
//            Thread.sleep(2000);
//            driver.manage().window().minimize();
            System.out.println("The Dimension of the browser:"+driver.manage().window().getSize());
            System.out.println("The position of the browser:"+driver.manage().window().getPosition());
            Thread.sleep(2000);
            driver.manage().window().setSize(new Dimension(500,500));
            Thread.sleep(1000);
            System.out.println(driver.manage().window().getSize());
            driver.manage().window().setPosition(new Point(200,500));
            System.out.println("The new position is:"+driver.manage().window().getPosition());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

