import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class Pets {
    @Test
    public void addOwner() {
        System.setProperty("webdriver.chrome.driver", "/Users/mateuszbaj/IdeaProjects/chromedriver85/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://petclinic.akademia.testowanie.pl/petclinic/owners/add");

        WebElement firstName = driver.findElement(By.xpath("//*[@id='firstName']"));
        firstName.sendKeys("Mariano");


        WebElement lastName = driver.findElement(By.xpath("//*[@id='lastName']"));
        lastName.sendKeys("Italiano");

        WebElement address = driver.findElement(By.xpath("//*[@id='address']"));
        address.sendKeys("Klatka Lwa");

        WebElement city = driver.findElement(By.xpath("//*[@id='city']"));
        city.sendKeys("Warszawa");

        WebElement telephone = driver.findElement(By.xpath("//*[@id='telephone']"));
        telephone.sendKeys("666666666");

        WebElement addOwner = driver.findElement(By.xpath("//*[@type='submit']"));
        addOwner.click();

    }

    @Test
    public void addPet() {
        System.setProperty("webdriver.chrome.driver", "/Users/mateuszbaj/IdeaProjects/chromedriver85/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://petclinic.akademia.testowanie.pl/petclinic/owners/185");
        WebElement addNewPet = driver.findElement(By.xpath("//button[contains(text(),'Add New Pet')]"));
        addNewPet.click();

        WebElement name = driver.findElement(By.xpath("//*[@id='name']"));
        name.sendKeys("Jasminka");

        WebElement birthDate = driver.findElement(By.xpath("//*[@viewBox='0 0 24 24']"));
        birthDate.click();

        WebElement selectDate = driver.findElement(By.xpath("//*[@aria-label='2020/09/08']"));
        selectDate.click();

        WebElement selectType = driver.findElement(By.xpath("//*[@id='type']"));
        selectType.click();
        WebElement cat = driver.findElement(By.xpath("//*[@value='5: Object']"));
        cat.click();

        WebElement savePet = driver.findElement(By.xpath("//*[@type='submit']"));
        savePet.click();


    }

    @Test
    public void addVisit() {
        System.setProperty("webdriver.chrome.driver", "/Users/mateuszbaj/IdeaProjects/chromedriver85/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://petclinic.akademia.testowanie.pl/petclinic/pets/46/visits/add");
        WebElement birthDate = driver.findElement(By.xpath("//*[@viewBox='0 0 24 24']"));
        birthDate.click();

        WebElement selectDate = driver.findElement(By.xpath("//*[@aria-label='2020/09/10']"));
        selectDate.click();
       WebElement description = driver.findElement(By.xpath("//*[@id='description']"));
       description.sendKeys("kotek wstaje o 5 rano i biega po całym mieszkaniu bez celu");
       WebElement addVisit = driver.findElement(By.xpath("//*[@type='submit']"));
       addVisit.click();
    }
}
