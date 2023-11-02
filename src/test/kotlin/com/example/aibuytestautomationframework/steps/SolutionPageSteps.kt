package com.example.aibuytestautomationframework.steps

import com.example.aibuytestautomationframework.pages.SolutionsPage
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired

class SolutionPageSteps {

    @Autowired
    private lateinit var solutionsPage: SolutionsPage

    @Given("I am on solutions page")
    fun iAmOnHomePage() {
        this.solutionsPage.iAmOnPage()
        Thread.sleep(5000)
    }

    @Then("I see Our Solutions title")
    fun iSeeOurSolutionsTitle() {
        this.solutionsPage.iSeeOurSolutionsTitle()
    }

    @When("I click on Solutions Page Button")
    fun iClickOnSolutionsPageButton() {
        this.solutionsPage.iClickOnSolutionsPageButton()
    }

    @When("I click on Our Solutions Button")
    fun iClickOnOurSolutionsButton() {
        this.solutionsPage.iClickOnOurSolutionsButton()
    }

    @When("I click on Our Platforms Button")
    fun iClickOnOurPlatformsButton() {
        this.solutionsPage.iClickOnOurPlatformsButton()
    }
}