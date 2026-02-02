package alertPackage;

import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Supplier;

public class HandlingAuthPopUp {
    public static void main(String[] args) {
        try {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

            HasAuthentication authentication=(HasAuthentication) driver;
          authentication.register(new Supplier<Credentials>() {
              @Override
              public Credentials get() {
                  return new UsernameAndPassword("admin","admin");
              }
          });
            //authentication.register(() -> new UsernameAndPassword("admin","admin"));

          driver.get("https://the-internet.herokuapp.com/basic_auth");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
