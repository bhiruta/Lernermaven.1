
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;


public class LearnerMaven
{
    protected static WebDriver driver;
    private long expected;


    @Before
    public void steps() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
     //The implict() wait is set for the life of the webDriver object instance.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Asking driver to get the URL.
        driver.get("https://nopcommerce.com/");
    }

    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {
        //Register for a new user
        driver.findElements(By.xpath("//a[@class='ico-register']")).click();


        //Enter first name
        driver.findElements(By.xpath("//input[@name= 'FirstName']")).Sendkeys(...charsequence:"Raj");

        //Enter last name
        driver.findElements(By.xpath("//input[@name= 'LastName']")).Sendkeys(...chaesequence:
        "Patel");

        //Enter email id
        driver.findElements(By.xpath("//input[@name= 'Email']")).Sendkeys(...chaesequence:
        "RajPatel@gamil.com");

        //Enter password
        driver.findElements(By.xpath("//input[@name='password']")).Sendkeys(...charsequence:
        "234567");

        //Confirm password
        driver.findElements(By.xpath("//INPUT[@NAME= 'Confirmpassword']")).Sendkeys(...charsequence:
        "234567");

        //click on the Register
        driver.findElements(By.xpath("//input[@type= 'submit' and @ value= 'Register']")).click();

        //Get actual registeration message
        String actualRegistrationSucessMessage = driver.findElements(xpath("//div[@class='resul']")).gettest();

        //System.out.print(actualRegistrationSucessMessage);

        Object expected;
        Assert.assertEquals(expected: "your registration completed", actualRegistrationSucessMessage)

        System.out.println("Test pass");
    }



    @Test
    public void login() {
        //click on login
        driver.findElements(By.xpath("//a[@class='ico-login']")).click();
        //enter email id
        driver.findElements(By.xpath("//input[@name='Email']")).sendkeys(...charsequence:"RajPatel@gmail.com");
        //enter password
        driver.findElements(By.xpath("//input[@name='password']")).sendkeys(...charsequence:"234567");
        //click on log in button
        driver.findElements(By.xpath("//input[@class='button-1 login-button']")).click();
        //actual result

        String actualresult=driver.findElement(By.linkText("Log out")).getText();


        Assert.assertEquals(expected:"Log out",actualresult);
        System.out.println("user should be able to register successfully");
    }

    @Test
    public void compute() {
        //click on computer link
        driver.findElements(linkText("Computer")).click();

        //click on notebook
        driver.findElements(By.partialLinkText("Notebooks")).click();

        //actual result
        String actresult = driver.findElement(By.xpath("//div[@class='pagetitle']")).getText();

        Assert.assertEquals(expected:"Notebooks", actresult);
        System.out.println("User should be able to navigate to Notebook categetory page");

    }
     @Test
     public void electronics() {
         //click on electronics categetory link
         driver.findElements(By.partialLinkText("Electronics")).click();

         //click on cellphones link
         driver.findElements(By.partialLinkText("Cell phone")).click();
         // actual result
         String actresult = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
         Assert.assertEquals(expected:"Cell phone", actresult);
         System.out.println("User should be able to navigate to Cell phone page via Electronics");

     }
     @Test
    public void jewelery() {
         //click on jewelerry categetory link
         driver.findElements(By.partialLinkText("jewelry")).click();
         //click on product name girl earring
         driver.findElements(By.partialLinkText("Girl Earring")).click();
         //click on add to jewelery
         driver.findElements(By.xpath("//input[@id='jewelery button-20']")).click();
         // actual result
         String actresult = driver.findElement(By.xpath("//P[@[class='content']")).getText();
         long expected;
         Assert.assertEquals(expected: "The product has been added to your shopping", actresult);
         System.out.println("User shoud be able to navigate to Jewelery page via Girl Earrings");

     }


    @After
    public void closeBrowser() {
        driver.quit();

    }
}
