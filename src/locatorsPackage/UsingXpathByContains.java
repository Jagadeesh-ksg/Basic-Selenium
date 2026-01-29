package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByContains {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://x.com/");
            Thread.sleep(4000);

            driver.findElement(By.xpath("//a[@data-testid='signupButton']")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("(//input[contains(@class,'r-30o5oe r-1dz5y72 r-13qz1uu r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-fdjqy7')])[1]")).sendKeys("abc");
            //driver.findElement(By.xpath("//input[@name='name']")).sendKeys("abc");
            driver.findElement(By.xpath("(//input[contains(@class,'r-30o5oe r-1dz5y72 r-13qz1uu r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-fdjqy7')])[2]")).sendKeys("hi");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(@class,'css-175oi2r r-sdzlij r-1phboty r-rs99b7 r-lrvibr r-2yi16 r-1qi8awa r-1loqt21 r-o7ynqc r-6416eg r-1ny4l3l')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
