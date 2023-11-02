package com.example.aibuytestautomationframework.steps

import com.example.aibuytestautomationframework.AibuyTestAutomationFrameworkApplicationTests
import com.example.aibuytestautomationframework.pages.NewsPage
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired

class NewsPageSteps {

    @Autowired
    private lateinit var newsPage: NewsPage

    @Given("I am on news page")
    fun iAmOnHomePage() {
        this.newsPage.iAmOnPage()
    }

    @When("I click on Videos Tab Button")
    fun iClickOnVideosTabButton() {
        this.newsPage.iClickOnVideosTabButton()
    }

    @Then("I see Videos Title")
    fun iSeeVideosTitle() {
        this.newsPage.iSeeVideosTitle()
    }

    @When("I click on News Tab Button")
    fun iClickOnNewsTabButton() {
        this.newsPage.iClickOnNewsTabButton()
    }

    @Then("I see News Title")
    fun iSeeNewsTitle() {
        this.newsPage.iSeeNewsTitle()
    }

    @When("I navigate on News Slider")
    fun iNavigateOnNewsSlider() {
        this.newsPage.iNavigateOnNewsSlider()
    }

    @When("I click on News article")
    fun iCLickOnNewsArticle() {
        this.newsPage.iCLickOnNewsArticle()
    }

    @When("I navigate to news article source")
    fun iNavigateToNewsArticleSourcePage() {
        this.newsPage.iNavigateToNewsArticleSourcePage()
    }
}