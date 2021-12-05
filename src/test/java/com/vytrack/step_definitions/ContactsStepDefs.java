package com.vytrack.step_definitions;

import com.github.javafaker.Faker;
import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.DBUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    ContactsPage contactsPage = new ContactsPage();

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedNumber) {
        contactsPage.waitUntilLoaderScreenDisappear();
        Integer actualNumber = Integer.parseInt(contactsPage.defaultPageNumber.getAttribute("value"));
        Assert.assertEquals(expectedNumber,actualNumber);
    }

    String email;
    @When("the user clicks on {string} from contacts")
    public void the_user_clicks_on_from_contacts(String expectedEmail) {
        contactsPage.clickEmailBox(expectedEmail);
        email = expectedEmail;
    }

    @Then("the information should be same with database")
    public void the_information_should_be_same_with_database() {
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullName = contactInfoPage.fullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        System.out.println("actualFullName = " + actualFullName);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhone = " + actualPhone);


        Map<String, Object> rowMap = DBUtils.getRowMap("select concat(first_name,' ', last_name)as \"full_name\", e.email, phone \n" +
                "from orocrm_contact c join orocrm_contact_email e\n" +
                "on c.id = e.owner_id\n" +
                "join orocrm_contact_phone p\n" +
                "on c.id = p.owner_id\n" +
                "where e.email = \""+email+"\"");

        String expectedFullName = (String) rowMap.get("full_name");
        String expectedEmail = (String) rowMap.get("email");
        String expectedPhone = (String) rowMap.get("phone");

        System.out.println("expectedFullName = " + expectedFullName);
        System.out.println("expectedEmail = " + expectedEmail);
        System.out.println("expectedPhone = " + expectedPhone);

        Assert.assertEquals(expectedFullName,actualFullName);
        Assert.assertEquals(expectedEmail,actualEmail);
        Assert.assertEquals(expectedPhone,actualPhone);


    }

    ContactInfoPage infoPage = new ContactInfoPage();
    Object firstName;
    Object lastName;
    Object newEmail;
    Faker faker = new Faker();
    Map<String, Object> uiData = new HashMap<>();


    @And("the user updates one contact details")
    public void theUserUpdatesOneContactDataDetails() {
        contactsPage.waitUntilLoaderScreenDisappear();
        contactsPage.changeView("100");
        BrowserUtils.waitFor(2);
        contactsPage.getOneContact();
        contactsPage.waitUntilLoaderScreenDisappear();

        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        newEmail = faker.internet().emailAddress();

        uiData.put("first_name", firstName);
        uiData.put("last_name", lastName);
        uiData.put("email",email);

        BrowserUtils.waitFor(3);
        infoPage.firstName.clear();
        infoPage.firstName.sendKeys((CharSequence) firstName);
        infoPage.lastName.clear();
        infoPage.lastName.sendKeys((CharSequence) lastName);
        infoPage.newEmail.clear();
        infoPage.newEmail.sendKeys((CharSequence) newEmail);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("newEmail = " + newEmail);
        BrowserUtils.waitFor(1);
        infoPage.saveAndClose.click();
        infoPage.waitUntilLoaderScreenDisappear();
    }

    @Then("verify same data has been modified at the DB")
    public void verifySameDataHasBeenModifiedAtTheDB() {
        String query = "select first_name, last_name, oe.email \n" +
                "from orocrm_contact oc join orocrm_contact_email oe on\n" +
                "oc.id = oe.owner_id\n" +
                "where oe.email = '"+ newEmail +"';";

        Map <String, Object> contactData = DBUtils.getRowMap(query);

        Assert.assertEquals(uiData,contactData);

    }
}
