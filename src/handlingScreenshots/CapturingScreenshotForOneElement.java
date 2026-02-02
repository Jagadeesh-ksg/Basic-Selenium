package handlingScreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class CapturingScreenshotForOneElement {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.google.com/");
            WebElement googleLogo=driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Google']"));
            File tempFile=googleLogo.getScreenshotAs(OutputType.FILE);
            File srcFile=new File("./ScreenshotFolder/elementSS.png");
            FileHandler.copy(tempFile,srcFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
