package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownDemoqa {
    public static void main(String[] args) {
        try{

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://techcanvass.com/Examples/multi-select.html?srsltid=AfmBOoqldbAMDZLXq9UUZG_EZuXPiCrj2FCxNLJe5xrtu-2DJBvTtz0W");


            Select selectMulti=new Select(driver.findElement(By.xpath("//select[@id='multiselect']")));

            if(selectMulti.isMultiple())
            {
//                selectMulti.selectByVisibleText("Honda");
//                selectMulti.selectByVisibleText("Audi");
//                selectMulti.selectByVisibleText("Volvo");

                List<WebElement> elementList=driver.findElements(By.xpath("//select[@id='multiselect']/child::option"));
                for(int i=0;i<elementList.size();i++)
                {
                    if(i%2==0){
                        elementList.get(i).click();
                    }
                }
            }

            Thread.sleep(2000);
            //selectMulti.deselectByVisibleText("Honda");
            selectMulti.deselectAll();





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
