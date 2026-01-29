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

public class Task1 {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");
           String homePage= driver.getWindowHandle();
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))));

            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");

            List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']"));

            String desiredOption="shoes for men sports";

            for(WebElement option:allOptions)
            {
                if(option.getText().contains(desiredOption))
                {
                    option.click();
                    break;
                }
            }

            driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
            List<WebElement> dropDown=driver.findElements(By.xpath("//div[@class='a-popover-inner']/descendant::li"));

            String desiredDropDown="Price: Low to High";

            for(WebElement op:dropDown)
            {
                if(op.getText().equals(desiredDropDown))
                {
                    op.click();
                    break;
                }
            }

            driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/31xSYaFlbgL._AC_UL320_.jpg']")).click();
            Set<String> allPages=driver.getWindowHandles();

            for(String page:allPages)
            {
                if(page.equals(homePage))
                {
                    driver.switchTo().window(page);
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
