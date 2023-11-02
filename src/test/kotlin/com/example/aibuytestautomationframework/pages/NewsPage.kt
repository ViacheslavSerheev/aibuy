package com.example.aibuytestautomationframework.pages

import jakarta.annotation.PostConstruct
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory
import org.springframework.stereotype.Service
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired
import java.time.Duration

@Service
class NewsPage {

    @FindBy(xpath = "//div[contains(@class, 'elementor-tab-title') and contains(text(), 'News')]")
    private lateinit var newsTabButton: WebElement

    @FindBy(xpath = "//div[contains(@class, 'elementor-tab-title') and contains(text(), 'Videos')]")
    private lateinit var videosTabButton: WebElement

    @FindBy(xpath = "//h2[contains(text(), 'Videos')]")
    private lateinit var videosTabTitle: WebElement

    @FindBy(xpath = "//h2[contains(text(), 'News')]")
    private lateinit var newsTabTitle: WebElement

    @FindBy(css = "span[aria-label='Go to slide 6']")
    private lateinit var slideSixSwiperBullet: WebElement

    @FindBy(css = "span[aria-label='Go to slide 4']")
    private lateinit var slideFourSwiperBullet: WebElement

    @FindBy(css = "article[class='elementor-post elementor-grid-item post-6819 post type-post status-publish format-standard has-post-thumbnail hentry category-news']")
    private lateinit var newsArticle: WebElement

    @Autowired
    private lateinit var webDriver: WebDriver

    @PostConstruct
    fun init() {
        PageFactory.initElements(AjaxElementLocatorFactory(this.webDriver, 10000), this)
    }

    fun iAmOnPage(): NewsPage {
        this.webDriver.get("https://aibuy.io/category/news/")

        return this
    }

    fun iClickOnVideosTabButton() {
        this.videosTabButton.click()
    }

    fun iSeeVideosTitle() {
        this.videosTabTitle.isDisplayed
    }

    fun iClickOnNewsTabButton() {
        this.newsTabButton.click()
    }

    fun iSeeNewsTitle() {
        this.newsTabTitle.isDisplayed
    }

    fun iNavigateOnNewsSlider() {
        this.slideSixSwiperBullet.click()
        this.slideFourSwiperBullet.click()
    }

    fun iCLickOnNewsArticle() {
        val jsExecutor = webDriver as JavascriptExecutor
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", newsArticle)

        this.newsArticle.click()
    }

    fun iNavigateToNewsArticleSourcePage() {
        var newsArticleURL = "https://www.retailcustomerexperience.com/news/many-social-media-users-dont-trust-products-sold-via-platforms/"

        var wait = WebDriverWait(webDriver, Duration.ofSeconds(10))
        wait.until(ExpectedConditions.urlToBe(newsArticleURL))
    }
}