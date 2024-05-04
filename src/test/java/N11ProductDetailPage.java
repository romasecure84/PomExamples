import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class N11ProductDetailPage {
    private final WebDriver driver;
    private final By addToBasketLocator= By.xpath("//*[@class='addBasketUnify']");

    public N11ProductDetailPage(WebDriver driver){
        this.driver=driver;
    }

    public void addToCard(){
        driver.findElement(addToBasketLocator).click();
    }
}
