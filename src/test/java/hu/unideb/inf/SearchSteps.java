package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class SearchSteps extends StepDefinitions{


    @Given("The Search link is clicked")
    public void theContactUsLinkIsClicked() {
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
    }


    @Then("Please enter a search keyword")
    public void pleaseEnterASearchKeyword() {

        assertEquals("Please enter a search keyword",driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText());
    }

    @Given("The {string} is filled with {string}")
    public void theFieldIsFilledWithValues(String field, String value) {
        driver.findElement(By.id(field)).sendKeys(value);
    }

    @Then("An {string} found shown")
    public void anMsgFoundShown(String msg) {

        assertEquals(msg,driver.findElement(By.className("heading-counter")).getText());

    }
}
