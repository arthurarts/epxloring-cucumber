package it.codedvalue.meetup.cucumber.exploring.cameracollection.stepdefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;

/**
 * @author Arthur Arts
 */
@Component
public class WebStepDefinitions {

    private static WebDriver driver = null;

    @Given("^I have started a browser$")
    public void iHaveStartedABrowser() throws Throwable {
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }

    @When("^I go to url \"(.*?)\"$")
    public void iGoToUrl(final String url) throws Throwable {
        driver.navigate().to(url);
    }

    @When("^I click on the link with name \"(.*?)\"$")
    public void iClickOnLinkWithName(final String linkTitle) {
        driver.findElement(By.linkText(linkTitle)).click();
    }

    @When("^I fill in field \"(.*?)\" with \"(.*?)\"$")
    public void iFillInFieldWith(String fieldName, String value) {
        WebElement inputField = driver.findElement(By.xpath("//label[contains(text(), '" + fieldName + "')]"));
        inputField.findElement(By.tagName("input")).sendKeys(value);
    }

    @Then("^the title should be \"(.*?)\"$")
    public void titleShouldBe(final String title) {
        assertEquals(driver.getTitle(), title);
        cleanUp();
    }

    private void cleanUp(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
