package com.example.aibuytestautomationframework.steps

import com.example.aibuytestautomationframework.pages.BookDemoPage
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired

class BookDemoSteps {

    @Autowired
    private lateinit var bookDemoPage: BookDemoPage

    @When("I select available date")
    fun iSelectAvailableDate() {
        this.bookDemoPage.iSelectAvailableDate()
    }

    @When("I select thirty minutes demo")
    fun iSelectThirtyMinDemo() {
        this.bookDemoPage.iSelectThirtyMinDemo()
    }

    @When("I select one hour demo")
    fun iSelectOneHourDemo() {
        this.bookDemoPage.iSelectOneHourDemo()
    }

    @When("I select Timezone")
    fun iSelectTimeZone() {
        this.bookDemoPage.iSelectTimezone()
    }

    @When("I select Demo Time")
    fun iSelectDemoTime() {
        this.bookDemoPage.iSelectDemoTime()
    }

    @When("I enter First Name to Book: {string}")
    fun iEnterFirstNameToBook(firstName: String) {
        this.bookDemoPage.iEnterFirstNameToBook(firstName)
    }

    @When("I enter Last Name to Book: {string}")
    fun iEnterLastNameToBook(lastName: String) {
        this.bookDemoPage.iEnterLastNameToBook(lastName)
    }

    @When("I enter Email to Book: {string}")
    fun iEnterEmailToBook(email: String) {
        this.bookDemoPage.iEnterEmailToBook(email)
    }

    @When("I click Submit Button")
    fun iClickSubmitButton() {
        this.bookDemoPage.iClickSubmitButton()
    }

    @When("I click Back Button")
    fun iClickBackButton() {
        this.bookDemoPage.iClickBackButton()
    }

    @Then("I see Success Message after book")
    fun iSeeSuccessMessageAfterBook() {
        this.bookDemoPage.iSeeSuccessMessageAfterBook()
    }

    @When("I click on Home Page Button from Book")
    fun iClickOnHomePageButton() {
        this.bookDemoPage.iClickOnHomePageButton()
    }
}