package alertPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;

public class Handlingpasswordpopup {
    public static void main(String[] args) {
        try{
            ChromeOptions options=new ChromeOptions();
//            options.addArguments("--guest"); to perform in guest mode
            HashMap<String,Object> prefs=new HashMap<>();
            prefs.put("credentials_enable_service",false);
            prefs.put("profile.password_manager_enable",false);
            prefs.put("profile.password_manager_leak_detection", false);

            options.setExperimentalOption("prefs",prefs);


            WebDriver driver=new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//input[@placeholder='Username']"))
                    .sendKeys("standard_user");
            driver.findElement(By.xpath("//input[@placeholder='Password']"))
                    .sendKeys("secret_sauce");
            driver.findElement(By.xpath("//input[@type='submit']"))
                    .click();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
