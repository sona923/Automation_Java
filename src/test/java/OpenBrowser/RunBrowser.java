package OpenBrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.plugin.dom.html.HTMLBodyElement;

public class RunBrowser {
    //@Test
    public void openChromeBrowser() throws InterruptedException {
        //set chrome browser drive
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //create ChromeDriver instance
        WebDriver wd = new ChromeDriver();

        //Open Browser
        wd.get("http://www.gmail.com");
        //Maximize Browser
        wd.manage().window().maximize();

        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmail.com");

        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        Thread.sleep(5000);
        wd.findElement(By.name("password")).sendKeys("Test@123");
        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

        //wait for 5 sec
        Thread.sleep(5000);

        //Close Browser
        wd.quit();
    }

        //Test case: user valid password invalid
        @Test
        public void uservalidPasswordInavlid() throws InterruptedException{
            //create ChromeDriver instance
            WebDriver wd = new ChromeDriver();

            //Open Browser
            wd.get("http://www.gmail.com");
            //Maximize Browser
            wd.manage().window().maximize();

            wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmail.com");

            wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
            Thread.sleep(5000);
            wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Nepal123");
            wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
            //wait for 5 sec
            Thread.sleep(5000);
            WebElement text = wd.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']"));
            String expectedString="Wrong password. Try again or click Forgot password to reset it.";


            Assert.assertEquals(expectedString,text.getText());//matches two condition
            wd.quit();
    }



    //@Test
    public void FirefoxBrowserBrowser() throws InterruptedException{
        //set chrome browser drive
        System.setProperty("webdriver.gecko.driver", "geckodriver");

        //create ChromeDriver instance
        WebDriver wd = new FirefoxDriver();

        //Open Browser
        wd.get("http://www.gmail.com");
        //Maximize Browser
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("yadavsona51@gmail.com");
        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        wd.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).sendKeys("hbdhjb");


        //wait for 5 sec
        Thread.sleep(5000);
        //Close Browser
        wd.quit();

    }
}
