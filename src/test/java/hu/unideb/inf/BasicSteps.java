package hu.unideb.inf;

import io.cucumber.java.en.Given;

public class BasicSteps extends StepDefinitions{


    @Given("The home page is opened")
    public void theHomePageIsOpened() {
        driver.get("http://automationpractice.com/");
    }

}
