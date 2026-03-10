package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Handlingsingleselectdropdownselecttag {
    public static void main(String[] args) {
        try{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://demoqa.com/select-menu");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select Value']/parent::div/following-sibling::div[@class='mt-2 row']/descendant::div[@id='withOptGroup']")))
                    .click();

            List<WebElement> allOptions =  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@id='react-select-2-listbox']/child::div[@class='css-1s9izoc']/descendant::div[@class='css-10wo9uf-option']"))));

            for(WebElement option : allOptions)
            {
                if (option.getText().equals("Group 2, option 2"))
                {
                    option.click();
                    break;
                }
            }








        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
