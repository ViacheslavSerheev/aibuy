package com.example.aibuytestautomationframework.pages

import jakarta.annotation.PostConstruct
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BookDemoPage {

    @FindBy(xpath = "//td[@data-selenium-test-disabled='false' and button[@data-test-id='available-date' and contains(@aria-label, '11')]]")
    private lateinit var availableDate: WebElement

    @FindBy(xpath = "//button[@role='radio' and span[contains(text(), '30')]]")
    private lateinit var thirtyMinDemo: WebElement

    @FindBy(css = "iframe[data-hs-ignore='true']")
    private lateinit var iframeElement: WebElement

    @FindBy(css = "div[id='bsb-1']")
    private lateinit var demoTime: WebElement

    @FindBy(css = "input[name='firstName']")
    private lateinit var firstNameInputField: WebElement

    @FindBy(css = "input[name='lastName']")
    private lateinit var lastNameInputField: WebElement

    @FindBy(css = "input[name='email']")
    private lateinit var emailInputField: WebElement

    @FindBy(xpath = "//a[contains(text(), 'Home')]")
    private lateinit var homePageButton: WebElement

    @Autowired
    lateinit var webDriver: WebDriver

    @PostConstruct
    fun init() {
        PageFactory.initElements(AjaxElementLocatorFactory(this.webDriver, 10000), this)
    }

    fun iSelectAvailableDate() {
        this.webDriver.switchTo().frame(iframeElement)
        Thread.sleep(2000)

        this.webDriver.findElement(By.xpath("//button[@data-test-id='available-date' and contains(@aria-label, '10')]")).click()

        this.webDriver.switchTo().defaultContent()
    }

    fun iSelectTimezone() {
        this.webDriver.switchTo().frame(iframeElement)

        this.webDriver.findElement(By.cssSelector("div[data-selenium-test='timezone-select']")).click()
        this.webDriver.findElement(By.xpath("//span[@data-option-value='US/Pacific']/span/button")).click()

        this.webDriver.switchTo().defaultContent()
    }

    fun iSelectThirtyMinDemo() {
        this.webDriver.switchTo().frame(iframeElement)
        Thread.sleep(2000)

        this.webDriver.findElement(By.xpath("//button[@role='radio' and span[contains(text(), '30')]]")).click()

        this.webDriver.switchTo().defaultContent()
    }

    fun iSelectOneHourDemo() {
        this.webDriver.switchTo().frame(iframeElement)
        Thread.sleep(2000)

        this.webDriver.findElement(By.xpath("//button[@role='radio' and span[contains(text(), '1')]][last()]")).click()

        this.webDriver.switchTo().defaultContent()
    }

    fun iSelectDemoTime() {
        this.webDriver.switchTo().frame(iframeElement)
        Thread.sleep(2000)

        this.webDriver.findElement(By.xpath("(//div[contains(@class, 'uiButton') and div[contains(@id, 'bsb')]])[1]")).click()

        this.webDriver.switchTo().defaultContent()
    }

    fun iEnterFirstNameToBook(firstName: String) {
        this.webDriver.switchTo().frame(iframeElement)
        Thread.sleep(2000)

        this.webDriver.findElement(By.cssSelector("input[name='firstName']")).click()
        this.webDriver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(firstName)

        this.webDriver.switchTo().defaultContent()
    }

    fun iEnterLastNameToBook(lastName: String) {
        this.webDriver.switchTo().frame(iframeElement)

        this.webDriver.findElement(By.cssSelector("input[name='lastName']")).click()
        this.webDriver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(lastName)

        this.webDriver.switchTo().defaultContent()
    }

    fun iEnterEmailToBook(email: String) {
        this.webDriver.switchTo().frame(iframeElement)

        this.webDriver.findElement(By.cssSelector("input[name='email']")).click()
        this.webDriver.findElement(By.cssSelector("input[name='email']")).sendKeys(email)

        this.webDriver.switchTo().defaultContent()
    }

    fun iClickSubmitButton() {
        this.webDriver.switchTo().frame(iframeElement)

        this.webDriver.findElement(By.xpath("//button[contains(@class, 'uiButton')][1]")).click()

        this.webDriver.switchTo().frame(iframeElement)
    }

    fun iSeeSuccessMessageAfterBook() {
        this.webDriver.switchTo().frame(iframeElement)

        this.webDriver.findElement(By.cssSelector("img[src='//static.hsappstatic.net/ui-images/static-2.595/optimized/success.svg']")).isDisplayed

        this.webDriver.switchTo().frame(iframeElement)
    }

    fun iClickBackButton() {
        this.webDriver.switchTo().frame(iframeElement)

        this.webDriver.findElement(By.xpath("//button[contains(@class, 'uiButton')][2]")).click()

        this.webDriver.switchTo().frame(iframeElement)
    }

    fun iClickOnHomePageButton() {
        this.homePageButton.click()
    }
}