package Table;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SumMarks {
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

    //Open Browser
    @Test
    public void openW3schools() throws InterruptedException {
        double sum = 0.00; //sum:90.35
        double expectedSum = 90.35;  //expectedSum:91.35

        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row : rows) //rows: size 5
        {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;
        }
        //system.out.println(sum)
        Assert.assertEquals(sum, expectedSum, 2); //delta is two decimal place value
    }

    //Close Browser
    @AfterTest
    public void close() {
        wd.quit();


    }

}