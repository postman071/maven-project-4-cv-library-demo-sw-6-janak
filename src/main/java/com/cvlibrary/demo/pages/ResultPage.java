package com.cvlibrary.demo.pages;

import com.cvlibrary.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;
    public void verifyTheResult(String expected)
    {
        getTextFromElement(resultText);
        //Asserts.assertEquals(getTextFromElement(resultText),expected,"Message is not coming");
    }

}
