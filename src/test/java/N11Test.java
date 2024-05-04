import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class N11Test extends BaseTest{
    N11TabBarPage tabBarPage;
    N11ResultPage resultPage;
    N11ProductDetailPage productDetailPage;
    @Test(priority = 1)
    public void searchTest() {
        driver.get("https://www.n11.com/");
        tabBarPage=new N11TabBarPage(driver);
        tabBarPage.search("laptop");
    }

    @Test(priority = 2)
    public void resultPageTest() throws InterruptedException {
        resultPage=new N11ResultPage(driver);
        Thread.sleep(2000);
        WebElement resultWebElement=resultPage.getResultWE();
        Assert.assertTrue(resultWebElement.isDisplayed());
        resultPage.clickToFirstProduct();
    }

    @Test(priority = 3)
    public void addToCardTest() throws InterruptedException {
        productDetailPage=new N11ProductDetailPage(driver);
        tabBarPage=new N11TabBarPage(driver);
        productDetailPage.addToCard();
        Thread.sleep(2000);
        Assert.assertTrue(tabBarPage.getBasketTotalNumber().equals("1"));
    }


}
