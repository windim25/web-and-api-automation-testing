package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {

    WebPage webPage;

    public WebStep() {
        this.webPage = new WebPage();
    }

    @Given("open web login page")
    public void openWebLoginPage() {
        webPage.openBrowser();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String pwd) {
        webPage.inputPwd(pwd);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.clickBtnLogin();
    }

    @And("user will see icon cart in homepage")
    public void userWillSeeIconCartInHomepage() {
        webPage.assertHomePage();
    }

    @And("user will see err message {string}")
    public void userWillSeeErrMessage(String errMsg) {
        webPage.assertErrMsg(errMsg);
    }

    @And("user add item to cart")
    public void userAddItemToCart() {
        webPage.clickAddToCart();
    }

    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String cartItem) {
        webPage.assertCartItem(cartItem);
    }

    @And("user remove item to cart")
    public void userRemoveItemToCart() {
        webPage.removeAddToCart();
    }

    @And("user proceed to checkout")
    public void userProceedToCheckout() {
        webPage.proceedToCheckout();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        webPage.clickCheckout();
    }

    @And("user input checkout information firstname {string}")
    public void userInputCheckoutInformationFirstname(String firstname) {
        webPage.inputFirstname(firstname);
    }

    @And("user input checkout information lastname {string}")
    public void userInputCheckoutInformationLastname(String lastname) {
        webPage.inputLastname(lastname);
    }

    @And("user input checkout information postalcode {string}")
    public void userInputCheckoutInformationPostalcode(String postalcode) {
        webPage.inputPostalcode(postalcode);
    }

    @And("user confirm order details")
    public void userConfirmOrderDetails() {
        webPage.confirmOrderDetails();
    }

    @And("user complete the purchase")
    public void userCompleteThePurchase() {
        webPage.completeThePurchase();
    }

    @Then("user should see confirmation message {string}")
    public void userShouldSeeConfirmationMessage(String confirmMsg) {
        webPage.assertConfirmMsg();
    }

    @And("user will see icon menu in homepage")
    public void userWillSeeIconMenuInHomepage() {
        webPage.assertMenuInHomepage();
    }

    @And("user click logout button")
    public void userClickLogoutButton() {
        webPage.clickLogout();
    }
}
