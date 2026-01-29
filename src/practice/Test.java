package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try{
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriver driver=new ChromeDriver(options);

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
            driver.get("https://www.demoblaze.com/");
            //entering username and password and then click on login
            driver.findElement(By.xpath("//a[text()='Log in']")).click();
            driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("jagadeesh2543");
            driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("11021a2543");
            driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

          //moving cursor to required element and clicking on it
           Thread.sleep(2000);
           Actions action=new Actions(driver);
          // driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Monitors']")).click();
            action.moveToElement(driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Monitors']")))
                    .click().perform();

            //getting the product name in the form of string

            String desProductName=driver.findElement(By.xpath("//div[@class='card-block']/descendant::a[@href='prod.html?idp_=10']")).getText();

            System.out.println(desProductName);

            driver.findElement(By.xpath("//div[@class='card-block']/descendant::a[@href='prod.html?idp_=10']")).click();

            String productName=driver.findElement(By.xpath("//div[contains(@class,'col-md-7 col-sm-12 col-xs-12')]/child::h2")).getText();
            System.out.println(productName);

            //getting the price and converting to double
            String price=driver.findElement(By.xpath("//div[contains(@class,'col-md-7 col-sm-12 col-xs-12')]/child::h3")).getText();
            System.out.println(price);
            String priceStr=price.split("\\*")[0].trim();
            double newprice = Double.parseDouble(priceStr.replace("$", ""));
            System.out.println(newprice);
            //getting description
            String description=driver.findElement(By.xpath("//div[@id='myTabContent']")).getText();
            System.out.println(description);

            System.out.println(productName.equals(desProductName));
            // comparing homepage name and description page name and perform add to cart click
            if(productName.equals(desProductName))
            {
                driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
                System.out.println(desProductName);
                System.out.println(newprice);
                System.out.println(description);
            }
           //handling the alert pop up
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent()).accept();

            //navigating to cart page
            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[text()='Cart']")).click();

            //verifying the product name matches and price matches

            String cartProductName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped']//tbody//tr//td[2]")).getText();
            System.out.println(cartProductName);
            String cartPrice=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped']//tbody//tr//td[3]")).getText();
            double newCartPrice=Double.parseDouble(cartPrice);
            System.out.println(newCartPrice);
            Thread.sleep(2000);

            //comparing name and price with cart price and names
            if(productName.equals(cartProductName)&&newprice==newCartPrice)
            {
                System.out.println(true);
                driver.findElement(By.xpath("//button[text()='Place Order']")).click();
            }
            List<WebElement> allLabels = driver.findElements(By.tagName("label"));
            for (WebElement label : allLabels) {
                System.out.println(label.getText());
                if(label.getText().equals("Name:"))
                {
                    driver.findElement(By.xpath("//label[text()='"+label.getText()+"']/following-sibling::input")).sendKeys("jagadeesh");
                }
                if(label.getText().equals("Country:"))
                {
                    driver.findElement(By.xpath("//label[text()='"+label.getText()+"']/following-sibling::input")).sendKeys("India");
                }
                if(label.getText().equals("City:"))
                {
                    driver.findElement(By.xpath("//label[text()='"+label.getText()+"']/following-sibling::input")).sendKeys("Hyderabad");
                }
                if(label.getText().equals("Credit card:"))
                {
                    driver.findElement(By.xpath("//label[text()='"+label.getText()+"']/following-sibling::input")).sendKeys("Abc11043");
                }
                if(label.getText().equals("Month:"))
                {
                    driver.findElement(By.xpath("//label[text()='"+label.getText()+"']/following-sibling::input")).sendKeys("october");
                }
                if(label.getText().equals("Year:"))
                {
                    driver.findElement(By.xpath("//label[text()='"+label.getText()+"']/following-sibling::input")).sendKeys("2027");
                }


            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[text()='Purchase']")).click();
            String msgDisplayed=driver.findElement(By.xpath("//div[@class='sa-icon sa-custom']/following-sibling::h2")).getText();
            System.out.println(msgDisplayed);

            String transDetails=driver.findElement(By.xpath("//div[@class='sa-icon sa-custom']/following-sibling::p")).getText();
            System.out.println(transDetails);

            Thread.sleep(2000);
            driver.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
