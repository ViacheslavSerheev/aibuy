package com.example.aibuytestautomationframework.steps

import com.example.aibuytestautomationframework.pages.HomePage
import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired

class HomePageSteps {

    @Autowired
    private lateinit var homePage: HomePage

    @Given("I am on home page")
    fun iAmOnHomePage() {
        this.homePage.iAmOnPage()
    }

    @When("I click on Schedule Demo Button")
    fun iClickOnScheduleDemoButton() {
        this.homePage.iClickOnScheduleDemoButton()
    }

    @When("I click on Book Demo Button")
    fun iClickOnBookDemoButton() {
        this.homePage.iClickOnBookDemoButton()
    }
}