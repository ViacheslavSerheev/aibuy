package com.example.aibuytestautomationframework

import io.cucumber.spring.CucumberContextConfiguration
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    classes = [AibuyTestAutomationFrameworkApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
@CucumberContextConfiguration
class AibuyTestAutomationFrameworkApplicationTests
