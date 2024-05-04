package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.N11ProductDetailPage;
import pages.N11ResultPage;
import pages.N11TabBarPage;

public class N11Test extends BaseTest {
    N11TabBarPage tabBarPage;
    N11ResultPage resultPage;
    N11ProductDetailPage productDetailPage;
    @Test(priority = 1)
    public void searchTest() {
        tabBarPage=new N11TabBarPage(driver);
        tabBarPage.navigateTo("https://www.n11.com/");
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
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(2000);
        Assert.assertTrue(tabBarPage.getBasketTotalNumber().equals("1"));
    }


}
