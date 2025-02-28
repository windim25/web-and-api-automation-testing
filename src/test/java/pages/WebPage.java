package pages;
import static helper.Utility.driver;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

public class WebPage {
    By input_username = By.id("user-name");
    By input_pwd= By.id("password");
    By btn_login = By.id("login-button");
    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    By icon_cart_item = By.xpath("//span[@class='shopping_cart_badge']");
    By addToCart = By.xpath("(//*[text()='Add to cart'])[1]");
    By removeToCart = By.xpath("(//*[text()='Remove'])[1]");
    By text_err_msg(String msg) {
        return By.xpath("//*[contains(text (), '" + msg + "')]");
    }
    By btn_checkout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']");
    By input_firstname = By.id("first-name");
    By input_lastname = By.id("last-name");
    By input_zip = By.id("postal-code");
    By btn_continue = By.id("continue");
    By btn_finish = By.id("finish");
    By btn_backhome = By.id("back-to-products");
    By icon_menu = By.id("react-burger-menu-btn");
    By btn_logout = By.id("logout_sidebar_link");

    public void openBrowser() {
        driver.get("https://saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPwd(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnLogin() {
        driver.findElement(btn_login).click();
    }

    public void assertHomePage() {
        driver.findElement(icon_cart).isDisplayed();
    }

    public void assertErrMsg(String errmsg) {
        driver.findElement(text_err_msg(errmsg)).isDisplayed();
    }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void removeAddToCart() {
        driver.findElement(removeToCart).click();
    }

    public void assertCartItem(String cartItem) {
        String itemExpected = cartItem;
        String itemActual = driver.findElement(icon_cart_item).getText();

        Assertions.assertThat(itemActual).isEqualTo(itemExpected);
    }

    public void proceedToCheckout() {
        driver.findElement(icon_cart_item).click();
    }

    public void clickCheckout() {
        driver.findElement(btn_checkout).click();
    }

    public void inputFirstname(String firstname) {
        driver.findElement(input_firstname).sendKeys(firstname);
    }

    public void inputLastname(String lastname) {
        driver.findElement(input_lastname).sendKeys(lastname);
    }

    public void inputPostalcode(String postalcode) {
        driver.findElement(input_zip).sendKeys(postalcode);
    }

    public void confirmOrderDetails() {
        driver.findElement(btn_continue).click();
    }

    public void completeThePurchase() {
        driver.findElement(btn_finish).click();
    }

    public void assertConfirmMsg() {
        driver.findElement(btn_backhome).click();
    }

    public void assertMenuInHomepage() {
        driver.findElement(icon_menu).click();
    }

    public void clickLogout() {
        driver.findElement(btn_logout).click();
    }
}
