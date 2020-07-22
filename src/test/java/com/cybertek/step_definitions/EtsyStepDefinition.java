package com.cybertek.step_definitions;

import com.cybertek.Utilities.Driver;
import com.cybertek.pages.EtsySearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class EtsyStepDefinition {

      EtsySearchPage etsySearchPage=new EtsySearchPage();

    public EtsyStepDefinition()  {
    }

    @Given("User is on https:\\/\\/www.etsy.com")
    public void user_is_on_https_www_etsy_com() throws MalformedURLException {
        Driver.getDriver().get("https://www.etsy.com");
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Then("User should see Etys title is expected")
    public void user_sees_etys_title_is_expected()  {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(actualTitle, expectedTitle);
    }



    @Then("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsySearchPage.searchBox.sendKeys("wooden Spoon");
    }

    @And("User click search button")
    public void userClickSearchButton() {
        etsySearchPage.searchButton.click();
    }

    @Then("User sees Wooden Spoon on the title")
    public void userSeesWoodenSpoonOnTheTitle()  {
       String actualTtile= Driver.getDriver().getTitle();
       String expectedTitle="Wooden spoon | Etsy";
       Assert.assertEquals(expectedTitle,actualTtile);
    }

    @Then("User types {string} in the search box")
    public void userTypesInTheSearchBox(String searchValue) {
        etsySearchPage.searchBox.sendKeys(searchValue);
        etsySearchPage.searchButton.click();

    }

    @Then("User sees {string} on the title")
    public void userSeesOnTheTitle(String searchValue)  {
        String actualTtile=Driver.getDriver().getTitle();
        String excepteTile=searchValue+" | Etsy";
        Assert.assertTrue(excepteTile.equalsIgnoreCase(actualTtile));
    }
}





