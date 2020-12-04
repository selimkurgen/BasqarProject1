package StepDefinitions;

import PageModels.NotificationResults;
import Pages.CityPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CitySteps {


    CityPage cityPage = new CityPage();


    @And("^user navigate to city page$")
    public void userNavigateToCityPage() {
        cityPage.getPage();
    }

    @When("^user create a city to the country \"([^\"]*)\" which name is \"([^\"]*)\"$")
    public void userCreateACityToTheCountryWhichNameIs(String countryName, String cityName) {
        cityPage.add(countryName, cityName);
    }

    @Then("^city should be created$")
    public void cityyShouldBeCreated() {
        Assert.assertTrue(cityPage.notificationResult(NotificationResults.Created));
    }

    @When("^user delete the data name as \"([^\"]*)\"$")
    public void user_delete_the_data_name_as(String city) {
      cityPage.delete(city);
    }
    @Then("^city should be deleted$")
    public void city_should_be_deleted()  {
     Assert.assertTrue(cityPage.notificationResult(NotificationResults.Deleted));
    }

    }
