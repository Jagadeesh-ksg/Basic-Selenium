package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Handlingsingleselectdropdown {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


            driver.get("https://www.amazon.in/");

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))))
                    .sendKeys("Bayblade");

            Select selectCategory=new Select(driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")));


            selectCategory.selectByVisibleText("Apps & Games");

            driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

            Select selectPrice=new Select(driver.findElement(By.xpath("//select[@aria-label='Sort by:']")));

            selectPrice.selectByVisibleText("Price: High to Low");




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
