package alertPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandlingPopUpInFirefox {
    public static void main(String[] args) {
        try{
            FirefoxOptions options=new FirefoxOptions();
            options.addPreference("dom.webnotifications.enabled",false);
            options.addPreference("dom.popup.enabled",false);
            options.addPreference("geo.enabled",false);
            options.addPreference("signon.rememberSignons",false);

            WebDriver driver=new FirefoxDriver(options);
            //driver.get("https://www.easemytrip.com/");
            driver.manage().window().maximize();





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
