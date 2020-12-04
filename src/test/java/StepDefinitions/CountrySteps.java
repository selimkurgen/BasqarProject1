package StepDefinitions;

import PageModels.NotificationResults;
import Pages.CountryPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CountrySteps {
    CountryPage countryPage = new CountryPage();

    @When("^user navigate to country page$")
    public void userNavigateToCountryPage() {

        countryPage.getPage();
    }

    @When("^user create a country as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void userCreateACountryAsAndCodeAs(String country, String code) {
        countryPage.add(country, code);
    }

    @Then("^country should be created$")
    public void countryShouldBeCreated() {
        Assert.assertTrue(countryPage.notificationResult(NotificationResults.Created));
    }

    @When("^user delete the name as \"([^\"]*)\"$")
    public void user_delete_the_name_as(String newCountryName) {
      countryPage.delete(newCountryName);

    }


    @Then("^country should be deleted$")
    public void countryShouldBeDeleted() {
        Assert.assertTrue(countryPage.notificationResult(NotificationResults.Deleted));


    }



}
