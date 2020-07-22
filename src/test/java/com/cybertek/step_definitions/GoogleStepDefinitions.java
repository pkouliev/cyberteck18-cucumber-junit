package com.cybertek.step_definitions;

import com.cybertek.Utilities.Driver;
import com.cybertek.pages.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {


  @Given("User is on the google search page")
    public void user_is_on_the_google_search_page()  {
    //opening browser ->getting google.com
    Driver.getDriver().get("https://www.google.com");

  }
  @Then("User should see title is Google")
    public void User_should_see_title_is_Google()  {
    //comparing actual title vs expected title
     String actualTitle=Driver.getDriver().getTitle();
     String expectedTitle="Google";
    Assert.assertTrue("Actual title does not match expected title",actualTitle.equals(expectedTitle));
    Assert.assertEquals("Actual title does not match expected title",actualTitle,expectedTitle);


  }

    @When("User searches apple")
    public void userSearchesApple()  {
      //creating object
      GoogleSearchPage googleSearchPage=new GoogleSearchPage();
      //sending value into search box using page object
      googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);


    }

  @Then("User should see apple in the title")
  public void userShouldSeeAppleInThe()  {
    String actualTitle=Driver.getDriver().getTitle();
    String expectedTitle="apple - Google Search";

  }

  @When("User searches {string}")
  public void userSearches(String searchValue)  {
    //creating object
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    //sending value into search box using page object
    googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);


  }

  @Then("User should see {string} in the")
  public void userShouldSeeInThe(String searchValue)  {
    String actualTitle=Driver.getDriver().getTitle();
    String expectedTitle=searchValue+" - Google Search";
    Assert.assertEquals(actualTitle,expectedTitle);


  }
}
