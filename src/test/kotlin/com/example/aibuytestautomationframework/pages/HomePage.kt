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
class HomePage {

    @FindBy(xpath = "//a[@href='/schedule-demo/']/span/span[contains(text(),'Schedule Demo')]")
    private lateinit var scheduleDemoButton: WebElement

    @FindBy(xpath = "//a[@href='/bookademo/']/span/span[contains(text(), 'Book A Demo')]")
    private lateinit var bookDemoButton: WebElement

    @Autowired
    lateinit var webDriver: WebDriver

    @PostConstruct
    fun init() {
        PageFactory.initElements(AjaxElementLocatorFactory(this.webDriver, 10000), this)
    }

    fun iAmOnPage(): HomePage {
        this.webDriver.get("https://aibuy.io")

        return this
    }

    fun iClickOnScheduleDemoButton() {
        this.scheduleDemoButton.click()
    }

    fun iClickOnBookDemoButton() {
        this.bookDemoButton.click()
    }
}