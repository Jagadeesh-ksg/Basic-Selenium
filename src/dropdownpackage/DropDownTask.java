package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropDownTask {
    public static void main(String[] args) {
        try{

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/select-menu");

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
           wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//b[text()='Multiselect drop down']/../../descendant::div[@class='css-19bb58m']"))))
                   .click();

            List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='css-1nmdiq5-menu']/descendant::div[@class='css-10wo9uf-option']"));

            for(WebElement option:allOptions)
            {
                String color=option.getText();
                if(color.equals("Blue")||color.equals("Red"))
                {
                    option.click();
                }
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
