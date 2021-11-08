package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(5);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information()  {
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Given("the user logged in as {string}")
    public void theUserLoggedInAs(String usertype) {
        the_user_is_on_the_login_page();
        String username ="";
        String password ="";
        switch (usertype.toLowerCase()){
            case "store manager":
            case "storemanager":
                username = ConfigurationReader.get("storemanager_username");
                password = ConfigurationReader.get("storemanager_password");
                break;
            case "sales manager":
            case "salesmanager":
                username = ConfigurationReader.get("salesmanager_username");
                password = ConfigurationReader.get("salesmanager_password");
                break;
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            default:
                System.out.println("usertype is not defined in Configuration file");
        }
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.titleContains("Dashboard"));
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        System.out.println("menuOptions.size() = " + menuOptions.size());
        System.out.println("menuOptions = " + menuOptions);

        List<String> actualOptions = new ArrayList<>();
        DashboardPage dashboardPage = new DashboardPage();
        //  dashboardPage.waitUntilLoaderScreenDisappear();
        //  actualOptions = BrowserUtils.getElementsText(dashboardPage.menuOptions) // for döngüsüyle ayný iþi yapýyor
        for (WebElement menuOption : dashboardPage.menuOptions) {
            actualOptions.add(menuOption.getText());
        }

        Assert.assertEquals(menuOptions,actualOptions);
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userInfo) {
        System.out.println(userInfo);

        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));

        BrowserUtils.waitForVisibility(new DashboardPage().userName, 10);
        String actualName = new DashboardPage().userName.getText();
     //   actualName = new DashboardPage().getUserName();       // yukarýdaki iki satýrla ayný iþi yapar.

        String expectedName = userInfo.get("firstname") +" "+ userInfo.get("lastname");
        System.out.println("expectedName = " + expectedName);
        Assert.assertEquals(expectedName,actualName);

    }



}