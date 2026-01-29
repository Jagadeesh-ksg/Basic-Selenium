package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingRemainingGetters {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://chat.qspiders.com/");

            WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
            System.out.println(loginbtn.getLocation());
            System.out.println(loginbtn.getLocation().getX());
            System.out.println(loginbtn.getSize());
            System.out.println(loginbtn.getSize().width);
            System.out.println(loginbtn.getLocation().x);
            System.out.println(loginbtn.getRect().getDimension());
            System.out.println(driver.findElement(By.xpath("//input[@name='password']")).getAttribute("placeholder"));
            System.out.println(driver.findElement(By.xpath("//input[@name='password']")).getDomAttribute("placeholder"));
            System.out.println(driver.findElement(By.name("username")).getTagName());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
