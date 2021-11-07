package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationMenuStepDefs {

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.titleContains(expectedTitle));
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }



    @When("the user navigates to Fleet - Vehicles")
    public void theUserNavigatesToFleetVehicles() {
        System.out.println("user navigates Fleet - Vehicles");
    }

    @Then("the title should be Vehicles")
    public void theTitleShouldBeVehicles() {
        System.out.println("title should be Vehicles");

    }

    @When("the user navigates to Marketing, Campaigns")
    public void theUserNavigatesToMarketingCampaigns() {
        System.out.println("user navigates Fleet - Vehicles");

    }

    @Then("the title should be Campaigns")
    public void theTitleShouldBeCampaigns() {
        System.out.println("title should be Vehicles");

    }

    @When("the user navigates to Activities - Calendar Events")
    public void theUserNavigatesToActivitiesCalendarEvents() {
        System.out.println("user navigates Fleet - Vehicles");

    }

    @Then("the title should be Calendars")
    public void theTitleShouldBeCalendars() {
        System.out.println("title should be Vehicles");

    }


}
