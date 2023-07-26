package com.cvlibrary.demo.steps;

import com.cvlibrary.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobSearchSteps
{
    @Given("i am on homepage")
    public void iAmOnHomepage() {
    }

    @When("i accept cookies")
    public void iAcceptCookies() {
    }

    @And("i enter jobTitle {string}")
    public void iEnterJobTitle(String jobTitle)
    {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("i enter jobLocation {string}")
    public void iEnterJobLocation(String jobLocation)
    {
        new HomePage().enterLocation(jobLocation);
    }

    @And("i select  distance {string}")
    public void iSelectDistance(String distance)
    {
        new HomePage().setDistanceDropDown(distance);
    }

    @And("i click on more search option link")
    public void iClickOnMoreSearchOptionLink()
    {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("i enter minimum salary {string}")
    public void iEnterMinimumSalary(String minSalary)
    {
        new HomePage().enterMinimumSalary(minSalary);
    }

    @And("i enter maximum salary {string}")
    public void iEnterMaximumSalary(String maxSalary)
    {
        new HomePage().enterMaximumSalary(maxSalary);
    }

    @And("i select salary type {string}")
    public void iSelectSalaryType(String salaryType)
    {
        new HomePage().setSalaryType(salaryType);
    }

    @And("i select job type {string}")
    public void iSelectJobType(String jobType)
    {
        new HomePage().setJobType(jobType);
    }

    @And("i click on job find button")
    public void iClickOnJobFindButton()
    {
        new HomePage().clickOnFindJobButton();
    }

    @Then("i verify the job result {string}")
    public void iVerifyTheJobResult(String text)
    {
        //new HomePage().clickOnElement(ResultPage);
    }
}
