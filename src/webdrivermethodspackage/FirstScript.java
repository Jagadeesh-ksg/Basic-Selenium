package webdrivermethodspackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
    public static void main(String[] args) {
        try{
            ChromeDriver driver=new ChromeDriver();
            Thread.sleep(2000);
            //driver.manage().window().maximize();
            driver.get("http://www.instagram.com");
            //Thread.sleep(2000);
            //driver.close();


        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
