package com.example.aibuytestautomationframework.steps

import com.example.aibuytestautomationframework.pages.ScheduleDemoPage
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired

class ScheduleDemoSteps {

    @Autowired
    private lateinit var scheduleDemoPage: ScheduleDemoPage

    @When("I enter First Name: {string}")
    fun iEnterFirstName(firstName: String) {
        this.scheduleDemoPage.iEnterFirstName(firstName)
    }

    @When("I enter Last Name: {string}")
    fun iEnterLastName(lastName: String) {
        this.scheduleDemoPage.iEnterLastName(lastName)
    }

    @When("I enter Email: {string}")
    fun iEnterEmail(email: String) {
        this.scheduleDemoPage.iEnterEmail(email)
    }

    @When("I enter Phone Number: {string}")
    fun iEnterPhoneNumber(phoneNumber: String) {
        this.scheduleDemoPage.iEnterPhoneNumber(phoneNumber)
    }

    @When("I click on Submit Button")
    fun iClickOnSubmitButton() {
        this.scheduleDemoPage.iClickOnSubmitButton()
    }

    @Then("I see Success Message")
    fun iSeeSuccessMessage() {
        this.scheduleDemoPage.iSeeSuccessMessage()
    }

    @Then("I see email error message")
    fun iSeeErrorMessage() {
        this.scheduleDemoPage.iSeeEmailErrorMessage()
    }
}