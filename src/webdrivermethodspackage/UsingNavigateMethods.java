package webdrivermethodspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class UsingNavigateMethods {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            Thread.sleep(2000);
            driver.manage().window().maximize();
            driver.get("https://in.linkedin.com/");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().to(new URL("https://www.naukri.com/"));



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
