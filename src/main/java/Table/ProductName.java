package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ProductName {
    WebDriver wd;

    @BeforeTest
    public void openChromeBrowser() throws InterruptedException {
        //set chrome browser drive
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //create ChromeDriver instance
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        //Maximize Browser
        wd.manage().window().maximize();
    }

    @Test
    public void openProductName() throws InterruptedException{
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));
        for (int i=0; i<rows.size(); i++){
        String listText = rows.get(i).getText();
        System.out.println(listText);



        }

        }
    }

