package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ContactUsSteps extends StepDefinitions{


    @And("The ContactUs link is clicked")
    public void theContactUsLinkIsClicked() {
        driver.findElement(By.id("contact-link")).click();
    }

    @Given("The Send link is clicked")
    public void theSendLinkIsClicked() {
        driver.findElement(By.id("submitMessage")).click();
    }

    @Then("Invalid email address")
    public void invalidEmailAddress() {
        List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
        assertEquals("Invalid email address.",elements.get(0).getText());
    }

    @Given("Valid email filled")
    public void validEmailFilled() {
        driver.findElement(By.id("email")).sendKeys("valid@email.com");
    }

    @Then("The message cannot be blank")
    public void theMessageCannotBeBlank() {

        List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
        assertNotEquals(0,elements.size());
        assertEquals("The message cannot be blank.",elements.get(0).getText());
    }

    @And("Valid message filled")
    public void validMessageFilled() {
        driver.findElement(By.id("message")).sendKeys("Teszt üzenet");
    }

    @Then("Please select a subject from the list provided")
    public void pleaseSelectASubjectFromTheListProvided() {

        List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
        assertNotEquals(0,elements.size());
        assertEquals("Please select a subject from the list provided.",elements.get(0).getText());

    }

    @And("Subject Selected")
    public void subjectSelected() {
        Select subjectDropdown =new Select(driver.findElement(By.id("id_contact")));
        subjectDropdown.selectByIndex(1);
    }

    @Then("Your message has been successfully sent to our team")
    public void yourMessageHasBeenSuccessfullySentToOurTeam() {

        assertEquals("Your message has been successfully sent to our team.",driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText());

    }


}
