package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class AutomationExcercise {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://automationexercise.com/login");
            Actions action = new Actions(driver);
            action.click(driver.findElement(By.xpath("//input[@type='text']"))).sendKeys("abcd").perform();
            action.click(driver.findElement(By.xpath("//input[@data-qa='signup-email']"))).sendKeys("testing123@gmail.com").perform();
            action.click(driver.findElement(By.xpath("//button[text()='Signup']"))).click().perform();
            String s1 = driver.findElement(By.xpath("//label[@for='password']")).getText();
            if (s1.contains("*")) {
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
            }

            WebElement form = driver.findElement(By.xpath("//section[@id='form']"));
            List<WebElement> labels = form.findElements(By.tagName("label"));
            for (WebElement label : labels) {
                System.out.println(label.getText());
                if(label.getText().contains("First name *"))
                {
                    driver.findElement(By.xpath("//label[text()='First name ']/following::input[@data-qa='first_name']")).sendKeys("kurma");
                }
                if(label.getText().contains("Last name *"))
                {
                    driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("jagadeesh");
                }
                if(label.getText().contains("Address *"))
                {
                    driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("sri nagar colony,hyderabad");
                }
                if(label.getText().contains("State *"))
                {
                    driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Telengana");
                }
                if(label.getText().contains("City *"))
                {
                    driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("hyderabad");
                }
                if(label.getText().contains("Zipcode *"))
                {
                    driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("5000012");
                }
                if(label.getText().contains("Mobile Number *"))
                {
                    driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("9652147335");
                }


            }


            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
