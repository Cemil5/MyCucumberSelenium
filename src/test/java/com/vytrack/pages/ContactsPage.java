package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {


    @FindBy(css = "input[type='number']")
    public WebElement defaultPageNumber;


    public void clickEmailBox (String email){

     //   BrowserUtils.waitForPageToLoad(20);
        waitUntilLoaderScreenDisappear();
     //   BrowserUtils.waitForVisibility(By.tagName("table"),20);
    //    BrowserUtils.waitForClickablility(By.tagName("table"),20);
     //   WebElement emailBox = Driver.get().findElement(By.xpath("//td[text()='mbrackstone9@example.com']"));
     //   WebElement emailBox = Driver.get().findElement(By.xpath("//td[text()='" + email + "']"));
        WebElement emailBox = Driver.get().findElement(By.xpath("//td[contains(text(),'" + email + "')][@data-column" +
                "-label='Email']"));

       // BrowserUtils.waitForClickablility(emailBox, 10);

        emailBox.click();
    }




}
