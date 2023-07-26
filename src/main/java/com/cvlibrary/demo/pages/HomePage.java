package com.cvlibrary.demo.pages;

import com.cvlibrary.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//section[@id='home-search-new']")
    WebElement homePage;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(id= "location")
    WebElement location;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobType;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsButton;
    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;
    @CacheLookup
    @FindBy(id = "save")
    WebElement acceptCookiesButton;

    public void setAcceptCookies()
    {
        driver.switchTo().frame(acceptIFrame);
        clickOnElement(acceptCookiesButton);
    }
    public void clickOnHomePage()
    {
        clickOnElement(homePage);
        log.info("Click on HomePage"+homePage.toString());
    }
    public void enterJobTitle(String jobTitleText)
    {
        sendTextToElement(jobTitle,jobTitleText);
        log.info("Click on Job title Element"+jobTitle.toString());
    }
    public void enterLocation(String locationText)
    {
        sendTextToElement(location,locationText);
        log.info("enter Location"+locationText.toString());
    }
    public void setDistanceDropDown(String distance)
    {
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
        log.info("Set Distance"+distanceDropDown.toString());
    }
    public void clickOnMoreSearchOptionLink()
    {
        clickOnElement(moreSearchOptionLink);
        log.info("click on More Search Option"+moreSearchOptionLink.toString());
    }
    public void enterMinimumSalary(String minSalary)
    {
        sendTextToElement(salaryMin,minSalary);
        log.info("Enter Minimum Salary"+salaryMin.toString());
    }
    public void enterMaximumSalary(String maxSalary)
    {
        sendTextToElement(salaryMax,maxSalary);
        log.info("Enter Maximum Salary"+salaryMax.toString());
    }
    public void setSalaryType(String SalaryTypeDropDownList)
    {
        selectByVisibleTextFromDropDown(salaryType,SalaryTypeDropDownList);
        log.info("Select salary Type"+SalaryTypeDropDownList.toString());
    }
    public void setJobType(String jobTypeDropDownList)
    {
        selectByVisibleTextFromDropDown(jobType,jobTypeDropDownList);
        log.info("Select Job Type"+jobTypeDropDownList.toString());
    }
    public void clickOnFindJobButton()
    {
        clickOnElement(findJobsButton);
        log.info("Click On FindJobButton:"+findJobsButton.toString());
    }
}
