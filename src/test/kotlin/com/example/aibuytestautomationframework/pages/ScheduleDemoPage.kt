package com.example.aibuytestautomationframework.pages

import jakarta.annotation.PostConstruct
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ScheduleDemoPage {

    @FindBy(css = "#field_qh4icy")
    private lateinit var firstNameInputField: WebElement

    @FindBy(css = "#field_71zk1")
    private lateinit var lastNameInputField: WebElement

    @FindBy(css = "#field_29yf4d")
    private lateinit var emailInputField: WebElement

    @FindBy(css = "#field_1hufy")
    private lateinit var phoneInputField: WebElement

    @FindBy(xpath = "//button[contains(@class,'frm_button')]")
    private lateinit var submitButton: WebElement

    @FindBy(xpath = "//p[contains(text(), 'Your responses were successfully submitted. Thank you!')]")
    private lateinit var successMessage: WebElement

    @FindBy(xpath = "//div[@class='frm_error_style' and contains(text(), 'There was a problem with your submission. Errors are marked below.')]")
    private lateinit var errorAlertMessage:WebElement

    @FindBy(xpath = "//div[@class='frm_error' and contains(text(), 'Please enter a valid email address')]")
    private lateinit var emailErrorMessage: WebElement

    @Autowired
    lateinit var webDriver: WebDriver

    @PostConstruct
    fun init() {
        PageFactory.initElements(AjaxElementLocatorFactory(this.webDriver, 10000), this)
    }

    fun iEnterFirstName(firstName: String) {
        this.firstNameInputField.click()
        this.firstNameInputField.sendKeys(firstName)
    }

    fun iEnterLastName(lastName: String) {
        this.lastNameInputField.click()
        this.lastNameInputField.sendKeys(lastName)
    }

    fun iEnterEmail(email: String) {
        this.emailInputField.click()
        this.emailInputField.sendKeys(email)
    }

    fun iEnterPhoneNumber(phoneNumber: String) {
        this.phoneInputField.click()
        this.phoneInputField.sendKeys(phoneNumber)
    }

    fun iClickOnSubmitButton() {
        this.submitButton.click()
    }

    fun iSeeSuccessMessage() {
        this.successMessage.isDisplayed
    }

    fun iSeeEmailErrorMessage() {
        this.errorAlertMessage.isDisplayed
        this.emailErrorMessage.isDisplayed
    }
}