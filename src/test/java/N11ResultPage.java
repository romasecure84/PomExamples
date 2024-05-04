import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class N11ResultPage {
    private final WebDriver driver;
    private final By resultTextLocator=By.xpath("//*[@class='resultText ']");
    private final By productNameLocator=By.xpath("(//*[@class='columnContent'])[2]");

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
