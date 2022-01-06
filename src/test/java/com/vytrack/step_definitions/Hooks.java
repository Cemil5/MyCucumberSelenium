package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.DBUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        if (!ConfigurationReader.get("browser").contains("mobile")) {
            Driver.get().manage().window().maximize();
        }

        if (scenario.getSourceTagNames().contains("@firefox")){     // getSourceTagNames() methods gets all tags of
            // the scenario
            Driver.setDriver("firefox");
        } else  if (scenario.getSourceTagNames().contains("@chrome")){
            Driver.setDriver("chrome");
        }

        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            // cast driver object to TakesScreenshot object and save screenshot as an array of bytes
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            // attach screenshot to the report
            scenario.attach(screenshot,"image/png",scenario.getName()); // interview prep videolardan
          //  scenario.attach(screenshot,"image/png","screenshot"); Jamal'in dersinden
        }
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpDb(){
        System.out.println("connnecting to database");
        DBUtils.createConnection();
    }
    @After("@db")
    public void tearDownDb(){
        System.out.println("disconnecting to database");
        DBUtils.destroy();
    }

}
