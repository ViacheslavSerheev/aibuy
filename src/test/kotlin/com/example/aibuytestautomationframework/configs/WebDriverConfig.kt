package com.example.aibuytestautomationframework.configs

import io.cucumber.spring.ScenarioScope
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WebDriverConfig {

    @Bean
    @ScenarioScope
    fun webDriverFirefox(): WebDriver {
        WebDriverManager.firefoxdriver().setup()

        return FirefoxDriver()
    }
}