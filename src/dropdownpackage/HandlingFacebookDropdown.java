package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandlingFacebookDropdown {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.facebook.com/r.php?entry_point=login");
            Thread.sleep(2000);
            Select selectDay=new Select(driver.findElement(By.xpath("//select[@aria-label='Day']")));
            selectDay.selectByIndex(14);
            Select selectMonth=new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
            selectMonth.selectByValue("8");
            Select selectYear=new Select(driver.findElement(By.xpath("//select[@aria-label='Year']")));
            selectYear.selectByVisibleText("1947");
            Thread.sleep(2000);
            selectDay.deselectByIndex(14);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
