package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingValidationMethods {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://demo.automationtesting.in/Register.html");
            WebElement hockeyCheckBox= driver.findElement(By.xpath("//label[text()='Hockey']/preceding-sibling::input "));
            if(hockeyCheckBox.isDisplayed())
            {
                System.out.println("the hockey checkbox is displayed");
                if(hockeyCheckBox.isSelected())
                {
                    System.out.println("hockey checkbox is selected");
                }
                else {
                    System.out.println("The hockey checkbox is not selected");
                    hockeyCheckBox.click();
                    System.out.println("The hockey checkbox is selected");
                }
            }
            else{
                System.out.println("The hockey checkbox is not displayed");
            }

            WebElement sumbit= driver.findElement(By.xpath("//button[@id='submitbtn']"));

            if(sumbit.isEnabled())
            {
                System.out.println("the submit button is enabled");
                sumbit.click();
                System.out.println("the submit button is clicked");
            }
            else{
                System.out.println("the submit button is disabled");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
