package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingDropDownDemoqawebsite {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/select-menu");

            Actions action=new Actions(driver);
            action.click(driver.findElement(By.xpath("//div[@id='withOptGroup']"))).perform();

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));

            action.click(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Group 1, option 2']")))).perform();
//            List<WebElement> allOptions=wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[contains(@class,'css-26l3qy-menu')]/descendant::div[contains(@class,'css-1s9izoc')]/descendant::div[contains(@class,'css-yt9ioa-option')]"))));
//
//            for(WebElement element:allOptions)
//            {
//                if(element.getText().equals("Group 1, option 2"))
//                {
//                    element.click();
//                    break;
//                }
//            }

            action.click(driver.findElement(By.xpath("//b[text()='Multiselect drop down']/../following-sibling::div[contains(@class,'css-2b097c-container')]")))
                    .perform();

            List<WebElement>  allColors=wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class=' css-11unzgr']/child::div"))));

            for(WebElement option:allColors)
            {
                String color=option.getText();
                if(color.equals("Red")||color.equals("Black"))
                {
                    option.click();
                }
            }




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
