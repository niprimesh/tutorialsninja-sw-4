package com.tutorialninja.testbase;

import com.tutorialninja.propertyreader.PropertyReader;
import com.tutorialninja.utilities.Utility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterTest
    public void tearDown(){
        closeBrowser();
    }
}

