package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationAssignment {
    WebDriver wd;
    @BeforeTest
    public void openChromeBrowser() throws InterruptedException {
        //set chrome browser drive
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //create ChromeDriver instance
        wd = new ChromeDriver();

        //Open Browser
        wd.get("https://www.toolsqa.com/automation-practice-form/");
        //Maximize Browser
        wd.manage().window().maximize();
    }
        //verify the partial link test exists and it links to /automation-practice-form/
        @Test
        public void PartialLinkTest() throws InterruptedException{
            String expectedLinkText = "Partial Link Test";
            String actualText = wd.findElement(By.partialLinkText("Partial")).getText();
            System.out.println(actualText);
            Assert.assertEquals(expectedLinkText, actualText);
        }



        //verify link test text exists and links to /automation-practice-table
        @Test
        public void LinkTest() throws InterruptedException {
            String expectedLinkText1 = "Link Test";
            String actualText1 = wd.findElement(By.linkText("Link Test")).getText();
            System.out.println(actualText1);
            Assert.assertEquals(expectedLinkText1, actualText1);
            //wd.findElement(By.linkText("Link Test")).isDisplayed();
        }

        //Enter first name
        @Test
    public void FirstName() throws InterruptedException{
        wd.findElement(By.name("firstname")).sendKeys("sona");
        Thread.sleep(2000);


        //Enter last name
        //@Test
    //public void LastName() throws InterruptedException{
        wd.findElement(By.id("lastname")).sendKeys("yadav");
        Thread.sleep(2000);
        }

      //choose sex as Female
        @Test
    public void Female() throws InterruptedException{
            JavascriptExecutor js= (JavascriptExecutor) wd;
            js.executeScript("windows.scrollBy(0,800)");
            WebElement radio = wd.findElement(By.xpath("//*[@id=\"sex-1\"]"));
        Actions actions =  new Actions(wd);
        actions.moveToElement(radio).click().build().perform();
        Thread.sleep(2000);
    }

    //Year of experience should be 5 only
    @Test
    public void Experience() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor)wd;
        js.executeScript("window.scrollBy(0,800)");
        WebElement radio2=wd.findElement(By.xpath("//*[@id=\"exp-4\"]"));
        Actions actions=new Actions(wd);
        actions.moveToElement(radio2).click().build().perform();
    }

    //put date of todays date, read system date
    @Test
    public void Date() throws InterruptedException{
     wd.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("02/20/2020");
        Thread.sleep(2000);
    }

    //profession should ne manual and automation both
    @Test
    public void Profession() throws InterruptedException{
        wd.findElement(By.xpath("//*[@id=\"profession-0\"]")).sendKeys("Manual Tester");
        Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"profession-1\"]")).sendKeys("Automation Tester");

    }

    //browse a pic and verify te fle has been attached








    }








