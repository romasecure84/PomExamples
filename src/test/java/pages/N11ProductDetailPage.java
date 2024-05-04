package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class N11ProductDetailPage extends BasePage{
    private final By addToBasketLocator= By.xpath("//*[@class='addBasketUnify']");

    public N11ProductDetailPage(WebDriver driver){
        super(driver);
    }

    public void addToCard(){
        driver.findElement(addToBasketLocator).click();
    }
}
