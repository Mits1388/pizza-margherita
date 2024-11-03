package by.pizzatempo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickButtonPizza() {
        By by = By.xpath(LoginXpath.BUTTON_PIZZA_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public LoginPage clickButtonSize31() {
        By by = By.xpath(LoginXpath.BUTTON_SIZE_31_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public LoginPage clickButtonOrderOne() {
        By by = By.xpath(LoginXpath.BUTTON_ORDER_ONE_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public LoginPage clickButtonOrderTwo() {
        By by = By.xpath(LoginXpath.BUTTON_ORDER_TWO_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public LoginPage clickButtonBasket() {
        By by = By.xpath(LoginXpath.BUTTON_BASKET_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public String textOrder() {
        By by = By.xpath(LoginXpath.TEXT_ORDER_XPATH);
        WebElement element = driver.findElement(by);
        return element.getText();
    }
}
