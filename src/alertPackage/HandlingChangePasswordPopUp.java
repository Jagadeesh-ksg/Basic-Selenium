package alertPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class HandlingChangePasswordPopUp {
    public static void main(String[] args) {
        try{

            ChromeOptions options=new ChromeOptions();
//            Map<String,Object> prefs=new HashMap<>();
//            prefs.put("profile.password_manager_leak_detection",false);
//            options.setExperimentalOption("prefs",prefs);


           options.addArguments("--guest");

            WebDriver driver=new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.xpath("//input[@placeholder='Username']"))
                    .sendKeys("standard_user");

            driver.findElement(By.xpath("//input[@type='password']"))
                    .sendKeys("secret_sauce");

            driver.findElement(By.xpath("//input[@type='submit']"))
                    .click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
