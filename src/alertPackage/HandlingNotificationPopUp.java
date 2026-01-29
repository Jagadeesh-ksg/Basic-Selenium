package alertPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopUp {
    public static void main(String[] args) {
        try {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriver driver=new ChromeDriver(options);

            driver.manage().window().maximize();
            driver.get("https://www.easemytrip.com/");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
