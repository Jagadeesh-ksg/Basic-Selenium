package handlingScreenshots;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class CapturingYouTubeLogo {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.youtube.com/");

            WebElement youtubeLogo=driver.findElement(By.xpath("//yt-icon[@id='logo-icon']"));

            File tempFile=youtubeLogo.getScreenshotAs(OutputType.FILE);
            File srcFile=new File("./ScreenshotFolder/youtubelogo.png");
            FileHandler.copy(tempFile,srcFile);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
