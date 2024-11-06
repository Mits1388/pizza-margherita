package by.pizzatempo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickButtonPizza() {
        By buttonPizzaBy = By.xpath(LoginXpath.BUTTON_PIZZA_XPATH);
        WebElement element = driver.findElement(buttonPizzaBy);
        element.click();
        return this;
    }

    public LoginPage clickButtonSize31() {
        By buttonSize31By = By.xpath(LoginXpath.BUTTON_SIZE_31_XPATH);
        WebElement element = driver.findElement(buttonSize31By);
        element.click();
        return this;
    }

    public LoginPage clickButtonOrderOne() {
        By buttonOrderOneBy = By.xpath(LoginXpath.BUTTON_ORDER_ONE_XPATH);
        WebElement element = driver.findElement(buttonOrderOneBy);
        element.click();
        return this;
    }

    public LoginPage clickButtonOrderTwo() {
        By buttonOrderTwoBy = By.xpath(LoginXpath.BUTTON_ORDER_TWO_XPATH);
        WebElement element = driver.findElement(buttonOrderTwoBy);
        element.click();
        return this;
    }

    public LoginPage clickButtonBasketPizza() {
        By buttonBasketPizzaBy = By.xpath(LoginXpath.BUTTON_BASKET_PIZZA_XPATH);
        WebElement element = driver.findElement(buttonBasketPizzaBy);
        element.click();
        return this;
    }

    public String textPizza() {
        By textPizzaBy = By.xpath(LoginXpath.TEXT_PIZZA_XPATH);
        WebElement element = driver.findElement(textPizzaBy);
        return element.getText();
    }

    public String textDrink() {
        By textDrinkBy = By.xpath(LoginXpath.TEXT_COLA_XPATH);
        WebElement element = driver.findElement(textDrinkBy);
        return element.getText();
    }

    public LoginPage clickButtonCola() {
        By buttonColaBy = By.xpath(LoginXpath.BUTTON_COLA_XPATH);
        WebElement element = driver.findElement(buttonColaBy);
        element.click();
        return this;
    }

    public LoginPage clickButtonDrink() {
        By buttonDrinkBy = By.xpath(LoginXpath.BUTTON_DRINK_XPATH);
        WebElement element = driver.findElement(buttonDrinkBy);
        element.click();
        return this;
    }

    public LoginPage clickButtonBasketPizzaDrink() {
        By buttonBasketPizzaDrinkBy = By.xpath(LoginXpath.BUTTON_BASKET_PIZZA_DRINK_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonBasketPizzaDrinkBy));
        element.click();
        return this;
    }
}
