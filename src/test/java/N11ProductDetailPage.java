import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class N11ProductDetailPage {
    WebDriver driver;
    By addToBasketLocator= By.className("addBasketUnify");

    public N11ProductDetailPage(WebDriver driver){
        this.driver=driver;
    }

    public void addToCard(){
        driver.findElement(addToBasketLocator).click();
    }
}
