package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.DBUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
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

    @When("the user clicks on {string} from contacts")
    public void the_user_clicks_on_from_contacts(String email) {
        contactsPage.clickEmailBox(email);
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
                "where e.email = \"mbrackstone9@example.com\"");

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



}
