package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRelativeLocators {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
            driver.findElement(RelativeLocator.with(By.xpath("//input[@id='small-searchterms']")).below(By.xpath("//a[text()='Log in']"))).sendKeys("mobile");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
