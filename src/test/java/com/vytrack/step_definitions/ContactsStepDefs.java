package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactsStepDefs {

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedNumber) {
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.waitUntilLoaderScreenDisappear();
        Integer actualNumber = Integer.parseInt(contactsPage.defaultPageNumber.getAttribute("value"));
        Assert.assertEquals(expectedNumber,actualNumber);
    }



}
