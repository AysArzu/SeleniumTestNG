import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class IlkClass {

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Click on 'Signup / Login' button
        WebElement signupElementi = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        Actions actions = new Actions(driver);
        actions.click(signupElementi).perform();
        //4. Enter name and email address
        //5. Click 'Signup' button
        WebElement nameKutusu = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(nameKutusu)
                .sendKeys("javacim")
                .sendKeys(Keys.TAB)
                .sendKeys("kardes@java.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        WebElement title = driver.findElement(By.xpath("//input[@id='id_gender2']"));
        actions.click(title)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys("03")
                .sendKeys(Keys.TAB)
                .sendKeys("April")
                .sendKeys(Keys.TAB)
                .sendKeys("2020")
                .sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB)
                .sendKeys("javaci")
                .sendKeys(Keys.TAB)
                .sendKeys("toraman")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("hurriyet sokak no:57")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("Montreal")
                .sendKeys(Keys.TAB)
                .sendKeys("Churcill")
                .sendKeys(Keys.TAB)
                .sendKeys("javaci")
                .sendKeys(Keys.TAB)
                .sendKeys("toraman")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("hurriyet sokak no:57")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("Montreal")
                .sendKeys(Keys.TAB)
                .sendKeys("Churcill")
                .sendKeys(Keys.TAB)
                .sendKeys("123324")
                .sendKeys(Keys.TAB)
                .sendKeys("123456789009")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();


        String expectedResult = "ACCOUNT CREATED!";
        String actualResult = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
        Assert.assertEquals(expectedResult, actualResult);
        driver.close();

    }
}
