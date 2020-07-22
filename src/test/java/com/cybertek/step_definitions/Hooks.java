package com.cybertek.step_definitions;


import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("--> 2 Before annotation: Setting up browser");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabaseConnection(){
        System.out.println("--> 1 before annotation: DB connection created <--");
    }

    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
      //   System.out.println("--> 1 After annotation: Closing browser");
      //  System.out.println("scenario.getName() = " + scenario.getName());
      //  scenario.getSourceTagNames();
      // scenario.isFailed();

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }


    @After(value = "@db", order = 2)
    public void tearDownDatabaseConnection(){
        System.out.println("--> 2 after annotation: DB connection closed <--");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("===> BEFORESTEP: TAKING SCREENSHOT <===");
    }

    @AfterStep()
    public void tearDownStep(){
        System.out.println("===> AFTERSTEP: TAKING SCREENSHOT <===");

    }
}
