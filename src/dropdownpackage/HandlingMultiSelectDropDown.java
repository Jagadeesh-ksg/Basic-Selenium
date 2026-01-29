package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandlingMultiSelectDropDown {
    public static void main(String[] args) {
        try{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get(" https://techcanvass.com/Examples/multi-select.html?srsltid=AfmBOooHWgXE0FIeekQMRtOxUijdCtoIZWLe9ixKUAVPuiHPIVzl96DT ");

            Select selectMulti=new Select(driver.findElement(By.xpath("//select[@id='multiselect']")));

            if(selectMulti.isMultiple())
            {
//                selectMulti.selectByVisibleText("Volvo");
//                selectMulti.selectByVisibleText("Maruti Suzuki");
//                selectMulti.selectByVisibleText("Audi");
//                selectMulti.selectByVisibleText("Hyundai");
             List<WebElement> allOptions=   selectMulti.getOptions();

            // for(WebElement element:allOptions)
                for(int i=0;i<allOptions.size();i++)
             {
                 //String compName=element.getText();
                 //if(compName.equals("Volvo")||compName.equals("Maruti Suzuki")||compName.equals("Audi")||compName.equals("Hyundai"))
                 if((i+1)%2==0)
                 {
                     allOptions.get(i).click();
                 }

             }
                for (WebElement element:selectMulti.getAllSelectedOptions())
                {
                    System.out.println(element.getText());
                }

                System.out.println("The first selected option is:"+selectMulti.getFirstSelectedOption().getText());

            }
            else {
                System.out.println("Single select drop down");
            }
            Thread.sleep(2000);
//            selectMulti.deselectByVisibleText("Hyundai");
//            selectMulti.deselectByVisibleText("Audi");
//            selectMulti.deselectByVisibleText("Volvo");
            selectMulti.deselectAll();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
