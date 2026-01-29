package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Amazomautosuggestionandswitchwindow {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");
            String homePage=driver.getWindowHandle();

            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")));

            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watches");
            List<WebElement> allOps=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']"));

            for(WebElement option:allOps)
            {
                if(option.getText().equals("watches for man"))
                {
                    option.click();
                    break;
                }
            }

            driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71yFoyoeMlL._AC_UL320_.jpg']"))
                    .click();
            Set<String> allPages=driver.getWindowHandles();
            for(String currentpage:allPages)
            {
                if(currentpage.equals(homePage))
                {
                    continue;
                }
                else {
                    driver.switchTo().window(currentpage);
                    break;
                }
            }
            WebElement element= driver.findElement(By.xpath("//span[@id='productTitle']"));

            System.out.println("The name of the product is:"+element.getText());

            WebElement price= driver.findElement(By.xpath("//span[@class='a-price-symbol']/following::span[text()='4,223']"));

            String newprice=price.getText();
            String cost=newprice.replace(",","");
            System.out.println("cost of the watch:"+cost);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
