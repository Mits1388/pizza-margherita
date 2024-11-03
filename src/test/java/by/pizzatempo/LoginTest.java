package by.pizzatempo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    private LoginPage loginPage;


    @BeforeClass
    public void setUpLoginTest() {
        loginPage = new LoginPage(driver);
    }

    @Test(testName = "тест: заказ пиццы Маргарита")
    public void testOrderPizza() {
        loginPage.clickButtonPizza().clickButtonSize31().clickButtonOrderOne().clickButtonOrderTwo().clickButtonBasketPizza();
        Assert.assertEquals(loginPage.textPizza(), LoginMessage.TEXT_PIZZA_XPATH);
    }

    @Test(testName = "тест: заказ пиццы Маргарита и напитка")
    public void testOrderPizzaAndDrink() {
        loginPage.clickButtonPizza().clickButtonSize31().clickButtonOrderOne().clickButtonOrderTwo().clickButtonDrink().clickButtonCola().clickButtonBasketPizzaDrink();
        Assert.assertEquals(loginPage.textPizza(), LoginMessage.TEXT_PIZZA_XPATH);
        Assert.assertEquals(loginPage.textDrink(), LoginMessage.TEXT_COLA_XPATH);
    }
}