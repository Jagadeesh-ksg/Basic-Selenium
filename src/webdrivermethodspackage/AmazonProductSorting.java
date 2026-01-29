package webdrivermethodspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AmazonProductSorting {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))))
                    .sendKeys("samsung");

            driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
            Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Sort by:']")));

            select.selectByVisibleText("Price: Low to High");

            List<WebElement> allPrices=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price']/child::span[@class='a-offscreen']"));
            List<WebElement> copiedList = new ArrayList<>(allPrices);
            allPrices.stream().sorted();
            if(copiedList.equals(allPrices))
            {
                System.out.println("The price is sorted");
            }
            else
            {
                System.out.println("The price is not sorted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
