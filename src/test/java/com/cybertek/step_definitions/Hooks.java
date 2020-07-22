package com.cybertek.step_definitions;

import com.cybertek.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //@Before(order = 1)
    public void setUpScenario() {
        System.out.println("-----> Before annotation: Setting up browser");
    }

    //@Before(value = "@db", order = 2)
    public void setUpDatabaseConnection() {
        System.out.println("--------> BEFORE ANNOTATION: DB CONNECTION CREATED <------");
    }

    @After
    public void tearDownScenario(Scenario scenario)  {
        System.out.println("scenario.getName()=" + scenario.getName());
        System.out.println("scenario.getSourceTagNames()=" + scenario.getSourceTagNames());
        System.out.println("scenario.isFailed()=" + scenario.isFailed());
        // System.out.println("-----> After annotation: Closing browser");
        //#1 we need to take a screen shot using selenium
        if(scenario.isFailed()){
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        //#2 we are going to attach iy into our report :using attach method
        //attach method accepts 3 argument .#1 :Screenshot itself #2 image typ #3. current scenario's name
        scenario.attach(screenshot, "image/png", scenario.getName());
    }}

    // @After("@db")
    public void tearDownDatabaseConnection() {
        System.out.println("--------> AFTER ANNOTATION: DB CONNECTION CLOSED <------");


    }

    // @BeforeStep
    public void setUpStep() {
        System.out.println("===========> BEFORESTEP: TAKING SCREENSHOT <===========");
    }

    // @AfterStep
    public void tearDownStep() {
        System.out.println("===========> AFTERSTEP: TAKING SCREENSHOT <===========");
    }

}