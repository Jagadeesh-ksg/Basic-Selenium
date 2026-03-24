package alertPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class HandlingAutoFillAction {
    public static void main(String[] args) {
        try{

            ChromeOptions options=new ChromeOptions();

            Map<String,Object> prefs=new HashMap<>();
            prefs.put("autofill.profile_enabled",false);
            prefs.put("autofill.enabled",false);
            WebDriver driver=new ChromeDriver(options);

            driver.get("https://chat.qspiders.com/");




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
