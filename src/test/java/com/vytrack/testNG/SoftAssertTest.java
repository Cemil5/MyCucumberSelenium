package com.vytrack.testNG;

import io.cucumber.java.bs.A;
import org.junit.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void test1(){
        softAssert.assertEquals(5,4,"5 == 4");
        softAssert.assertEquals(7, 6, "7 == 6");
        softAssert.assertEquals(9,8, "9 == 8");
        softAssert.assertAll("soft assert end 1");    // assertAll method has to be used at the end of each test case.
        // doesn't execute after this, if there is a fail in the assertions.

        softAssert.assertEquals(9,1,"test after all1");
        softAssert.assertAll("soft assert end 1a");
    }

    //@CsvFileSource
    @Test
    public void test2(){
        Assert.assertEquals(50, 51, "test2");
    }

    @Test
    public void test3(){
        softAssert.assertEquals(11,12,"11 == 12");
        softAssert.assertAll("soft assert end 3");
        softAssert.assertEquals(16,15, "16 == 15");
        Assert.assertEquals(1, 2, "hard assert");
    }
}
