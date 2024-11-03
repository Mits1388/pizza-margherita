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
        loginPage.clickButtonPizza().clickButtonSize31().clickButtonOrderOne().clickButtonOrderTwo().clickButtonBasket();
        Assert.assertEquals(loginPage.textOrder(), LoginMessage.TEXT_ORDER_XPATH);
    }
}
