import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;




public class TestNG {
    @BeforeTest
    public void openPage(){
        System.setProperty("webdriver.chrome.driver","/Users/mateuszbaj/Desktop/Dokumenty/Szkola/Selenium/code-examples-python-master/14/vendor/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://petclinic.akademia.testowanie.pl/petclinic/owners/add");




    }
    @Test
    public void addPet(){
        System.setProperty("webdriver.chrome.driver","/Users/mateuszbaj/Desktop/Dokumenty/Szkola/Selenium/code-examples-python-master/14/vendor/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://petclinic.akademia.testowanie.pl/petclinic/owners/add");
        //WebDriver driver = new ChromeDriver();
       //driver.findElement(By.cssSelector("#firstName"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement lastName = driver.findElement(By.xpath("//*[@id='firstName']"));
lastName.sendKeys("Twoj");

    }
   @AfterClass
   public void close(){
       WebDriver driver = new ChromeDriver();
       driver.close();
   }
}
