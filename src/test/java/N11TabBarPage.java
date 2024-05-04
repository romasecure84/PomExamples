import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class N11TabBarPage{
    WebDriver driver;

    By searchBoxLocator=By.id("searchData");
    By basketTotalNumberLocator=By.className("basketTotalNum");

    public N11TabBarPage(WebDriver driver){
        this.driver=driver;
    }

    public void search(String searchKey){
        driver.findElement(searchBoxLocator).sendKeys(searchKey + Keys.ENTER);
    }

    public String getBasketTotalNumber(){
        return  driver.findElement(basketTotalNumberLocator).getText();
    }
}
