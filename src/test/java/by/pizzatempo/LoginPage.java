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

    public LoginPage clickButtonBasketPizza() {
        By by = By.xpath(LoginXpath.BUTTON_BASKET_PIZZA_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public String textPizza() {
        By by = By.xpath(LoginXpath.TEXT_PIZZA_XPATH);
        WebElement element = driver.findElement(by);
        return element.getText();
    }

    public String textDrink() {
        By by = By.xpath(LoginXpath.TEXT_COLA_XPATH);
        WebElement element = driver.findElement(by);
        return element.getText();
    }

    public LoginPage clickButtonCola() {
        By by = By.xpath(LoginXpath.BUTTON_COLA_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public LoginPage clickButtonDrink() {
        By by = By.xpath(LoginXpath.BUTTON_DRINK_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public LoginPage clickButtonBasketPizzaDrink() {
        By by = By.xpath(LoginXpath.BUTTON_BASKET_PIZZA_DRINK_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.click();
        return this;
    }
}
