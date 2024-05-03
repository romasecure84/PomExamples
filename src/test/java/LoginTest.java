import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        WebElement successMes=driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
        Assert.assertTrue(successMes.isDisplayed());
    }

}
