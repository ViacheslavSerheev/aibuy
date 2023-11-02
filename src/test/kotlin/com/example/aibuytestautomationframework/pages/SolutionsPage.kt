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
class SolutionsPage {

    @FindBy(css = "a[href='#oursolutions']")
    private lateinit var ourSolutionsButton: WebElement

    @FindBy(css = "a[href='#ourplatforms']")
    private lateinit var ourPlatformsButton: WebElement

    @FindBy(xpath = "//a[contains(text(), 'Solutions')]")
    private lateinit var solutionsPageButton: WebElement

    @Autowired
    lateinit var webDriver: WebDriver

    @PostConstruct
    fun init() {
        PageFactory.initElements(AjaxElementLocatorFactory(this.webDriver, 10000), this)
    }

    fun iAmOnPage(): SolutionsPage {
        this.webDriver.get("https://aibuy.io/solutions/")

        return this
    }

    fun iSeeOurSolutionsTitle() {
        this.ourSolutionsButton.isDisplayed
    }

    fun iClickOnSolutionsPageButton() {
        this.solutionsPageButton.click()
    }

    fun iClickOnOurSolutionsButton() {
        this.ourSolutionsButton.click()
    }

    fun iClickOnOurPlatformsButton() {
        this.ourPlatformsButton.click()
    }
}