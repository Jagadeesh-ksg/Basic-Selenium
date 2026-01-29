package alertPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthPopUp {
    public static void main(String[] args) {
        try {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
