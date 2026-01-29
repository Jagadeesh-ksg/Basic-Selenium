package webdrivermethodspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetterMethods {
    public static void main(String[] args) {


        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://chat.qspiders.com/");
            System.out.println("The Title is:"+driver.getTitle());
            System.out.println("The fetched URL:"+driver.getCurrentUrl());
            System.out.println(driver.getPageSource());
            if(driver.getTitle().equals("Qtalk"))
            {
                System.out.println("The title is as expected.");
            }
            else {
                System.out.println("The title is wrong");
            }
            String url="https://chat.qspiders.com/";
            if(driver.getCurrentUrl().equals(url))
            {
                System.out.println("The url is as expected.");
            }
            else {
                System.out.println("The url is wrong.");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
