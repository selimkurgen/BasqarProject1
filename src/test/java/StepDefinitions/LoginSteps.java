package StepDefinitions;

import PageModels.NotificationResults;
import Utilities.MyUtils;
import cucumber.api.java.en.Given;
import Pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {

    HomePage hp = new HomePage();


    @Given("^user on home page$")
    public void user_on_home_page() {

        hp.getHomePage();
        hp.prepareLogin();
    }

    @Given("^user logged in to basqar$")
    public void user_logged_in_to_basqar() {
        hp.login();


    }


}

