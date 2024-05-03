import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickSubmitButton();
//        WebElement successMes=driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
//        Assert.assertTrue(successMes.isDisplayed());
    }

}
