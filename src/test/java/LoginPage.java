import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameLocator=By.id("username");
    private By passwordLocator=By.id("password");
    private By submitButtonLocator=By.id("submit");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public  void enterUsername(String username){
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButtonLocator).click();
    }

}
