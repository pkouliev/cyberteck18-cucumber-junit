package com.cybertek.step_definitions;

import com.cybertek.Utilities.Driver;
import com.cybertek.pages.SmartBearPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SmartBearStepDefinitions {
    SmartBearPages smartBearPages = new SmartBearPages();

    public SmartBearStepDefinitions()  {
    }

    @Given("User is on SmartBear login page")
    public void user_is_on_smart_bear_login_page()  {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Then("User logged to SmartBear")
    public void user_logged_to_smart_bear() {
        smartBearPages.UserNameElement.sendKeys("Tester");
        smartBearPages.PassWordElement.sendKeys("test", Keys.ENTER);

    }


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        smartBearPages.orderElement.click();
    }

    @Then("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productDropdown) {
        Select select = new Select(smartBearPages.productDropdownElement);
        select.selectByVisibleText(productDropdown);

    }

    @Then("User enters {string} to quantity")
    public void user_enters_to_quantity(String Quantity) {
        smartBearPages.Quantity.sendKeys(Keys.BACK_SPACE);
        smartBearPages.Quantity.sendKeys(Quantity, Keys.ENTER);

    }

    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String CostumerName) {
        smartBearPages.customerNameElement.sendKeys(CostumerName);

    }

    @Then("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPages.street.sendKeys(string);

    }

    @Then("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPages.city.sendKeys(string);
    }

    @Then("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPages.state.sendKeys(string);
    }

    @Then("User enters zipCode {string}")
    public void user_enters_zip_code(String string) {
        smartBearPages.zip.sendKeys(string);
    }

    @Then("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        smartBearPages.VisaCard.click();
    }

    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPages.cardNumber.sendKeys(string);
    }

    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPages.dateOfBirth.sendKeys(string);
    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPages.processButton.click();

    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        smartBearPages.AllOrder.click();
        for (WebElement each : smartBearPages.names) {
            if (each.getText().equalsIgnoreCase(string)) {
                Assert.assertTrue(each.getText().equals(string));

            }
        }


    }


}
