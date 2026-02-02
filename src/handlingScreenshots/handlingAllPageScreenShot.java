package handlingScreenshots;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.time.Duration;

public class handlingAllPageScreenShot {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://pmkisan.gov.in/");
            TakesScreenshot screenshot=(TakesScreenshot) driver;
            File tempFile = screenshot.getScreenshotAs(OutputType.FILE);
            File srcFile = new File("./ScreenshotFolder/PM_kisan.png");
            FileHandler.copy(tempFile,srcFile);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
