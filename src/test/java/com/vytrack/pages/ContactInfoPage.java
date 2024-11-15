package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage extends BasePage {

    @FindBy(css = "div.pull-left>h1.user-name")
    public WebElement fullName;

    @FindBy(css = "a.email")
    public WebElement email;

    @FindBy(css = "a.phone")
    public WebElement phone;

    @FindBy(css ="[name='oro_contact_form[firstName]']" )
    public WebElement firstName;

    @FindBy(css = "[name='oro_contact_form[lastName]']")
    public WebElement lastName;

    @FindBy(css = "[name='oro_contact_form[emails][0][email]']")
    public WebElement newEmail;

    @FindBy(xpath = "//button[contains(text(),'Save and Close')]")
    public WebElement saveAndClose;


}
