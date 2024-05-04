import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class N11ResultPage {
    WebDriver driver;
    By resultTextLocator=By.className("resultText");
    By productNameLocator=By.className("productName");

    public N11ResultPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getResultWE(){
        return driver.findElement(resultTextLocator);
    }

    public void clickToFirstProduct(){
        driver.findElement(productNameLocator).click();
    }
}
