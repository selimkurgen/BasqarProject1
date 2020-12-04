package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.SomeCountryPage;

public class SomeCountrySteps {

    SomeCountryPage someCountryPage = new SomeCountryPage();

    @When("^user create a someCountry name as \"([^\"]*)\" and code as \"([^\"]*)\" and save$")
    public void user_create_a_someCountry_name_as_and_code_as_and_save(String newcountryName, String newCountryCode) {
        someCountryPage.add(newcountryName, newCountryCode);
    }

    @Then("^someCountry should be created$")
    public void somecountry_should_be_created() {
        Assert.assertTrue(someCountryPage.notificationResult(NotificationResults.Created));

    }

    @Then("^select name as \"([^\"]*)\" and create a someCity name as \"([^\"]*)\" and save$")
    public void select_name_as_and_create_a_someCity_name_as_and_save(String selectCountry, String newCity) {


        someCountryPage.getPageForCity();
        someCountryPage.addCity(selectCountry, newCity);
    }


    @Then("^Somecity should be created$")
    public void somecity_should_be_created() {
            Assert.assertTrue(someCountryPage.notificationResult(NotificationResults.Created));


    }

    @Then("^delete name as \"([^\"]*)\"$")
    public void delete_name_as(String newCountyName) {
            someCountryPage.getPageForCountry();
            someCountryPage.delete(newCountyName);

    }

    @Then("^Selimcountry should be error$")
    public void selimcountry_should_be_error() {
            someCountryPage.notificationResult(NotificationResults.Error);

    }
    @Then("^delete  cityName as \"([^\"]*)\"$")
    public void delete_cityName_as(String newCity)
    {
        someCountryPage.getPageForCity();
        someCountryPage.deleteCity(newCity);

    }

    @Then("^Beycity should be deleted$")
    public void beycity_should_be_deleted()  {
     someCountryPage.notificationResult(NotificationResults.Created);

    }

    @Then("^delete again name as \"([^\"]*)\"$")
    public void delete_again_name_as(String newCountyName)
    {
        someCountryPage.getPageForCountry();
        someCountryPage.delete(newCountyName);

    }

    @Then("^Selimcountry should be successfully deleted$")
    public void selimcountry_should_be_successfuly_deleted()
    {
        someCountryPage.notificationResult(NotificationResults.Deleted);

    }

}