package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class MakeMyTripFluentwait {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.makemytrip.com/");

            FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
            wait.pollingEvery(Duration.ofSeconds(2));
            wait.ignoring(Exception.class);
            wait.withTimeout(Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='minimize']"))).click();
            driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
            driver.findElement(By.xpath("//span[@class='coachmark']")).click();
            driver.findElement(By.xpath("//span[contains(@class,'chNavIcon appendBottom2 chSprite chTrains inactive')]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'rsw_inputBox selectRailCity')])[1]"))).click();
           // driver.findElement(By.xpath("(//div[contains(@class,'rsw_inputBox selectRailCity')])[1]")).click();
            //driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("Hyderabad");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-autocomplete='list']"))).sendKeys("Hyderabad");
            driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
            driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Ahmedabad");
            //driver.findElement(By.xpath("//span[text()='Ahmedabad']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Ahmedabad']"))).click();
            WebElement monthbox=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
            while(true)
            {
                if(monthbox.getText().equals("January 2026"))
                {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='5']"))).click();
                    break;
                }
                else {
                    driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]")).click();
                }
            }

            driver.findElement(By.xpath("//div[@data-cy='RailSearchWidget_337']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn borderRadius32')]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'Checkbox_customCheckbox__x_y3g ')]"))).click();
            driver.findElement(By.xpath("//div[contains(@class,'Cards_cardSection__wZahV')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
