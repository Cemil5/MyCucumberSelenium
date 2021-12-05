package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ContactsPage extends BasePage {


    @FindBy(css = "input[type='number']")
    public WebElement defaultPageNumber;

    @FindBy(xpath = "//button[@class = 'btn dropdown-toggle ']")
    public WebElement toggleBtn;

    public void changeView(String str){
        BrowserUtils.waitFor(10);
        toggleBtn.click();
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.partialLinkText(str)).click();
    }

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

    public void getOneContact(){
        Random random = new Random();
        int anyRow = random.nextInt(Driver.get().findElements(By.xpath("//table/tbody/tr")).size());
        Driver.get().findElement(By.xpath("//table/tbody/tr["+ anyRow +"]//td//i[@class='fa-edit hide-text']"));

    }


}
