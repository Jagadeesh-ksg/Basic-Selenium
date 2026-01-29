package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class VerifyingProductNameInDemoBlaze {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.ebay.com/");
            String parentId= driver.getWindowHandle();

            driver.findElement(By.xpath("//a[contains(@href,'https://www.ebay.com/b/Cell-Phones-Smartphones/9355/bn_320094?_')]")).click();

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));

            WebElement firstMobile=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@target='_blank' and @class='bsig__title__wrapper' and contains(@href,'https://www.ebay.com')])[1]")));

            String desiredMobileName= firstMobile.getText().substring(0,23);

            firstMobile.click();

            Set<String>allPageId=driver.getWindowHandles();

            for(String pageId:allPageId)
            {
                if(pageId.equals(allPageId))
                {
                    continue;
                }
                else {
                    driver.switchTo().window(pageId);
                    System.out.println("the window is switched");
                    break;
                }
            }

            String productPageMobileName=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(@class,'x-item-title__mainTitle')]")))).getText();

            if(productPageMobileName.contains(desiredMobileName))
            {
                System.out.println("In both pages the mobile name is same");
            }
            else {
                System.out.println("Different mobile name");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
