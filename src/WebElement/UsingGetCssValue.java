package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingGetCssValue {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://tinder.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            System.out.println(driver.findElement(By.xpath("(//div[@class='c9iqosj'])[3]")).getCssValue("background-color"));
            System.out.println(driver.findElement(By.xpath("//div[text()='Create account']")).getCssValue("font-family"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
