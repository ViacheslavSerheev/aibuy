# AiBUY Test Automation Framework

## Overview
Welcome to the AiBUY Test Automation Framework, an automation solution for testing AiBUY's software products. This framework is built using Kotlin, Spring Boot, and Cucumber, enabling efficient and reliable test automation.

## Prerequisites
Before using the AiBUY Test Automation Framework, ensure you have the following prerequisites installed on your system:

- **Java Development Kit (JDK):** You should have JDK 17 or a compatible version installed.
- **Gradle:** We recommend using Gradle as the build tool. If you don't have it installed, you can download it from [Gradle's official website](https://gradle.org/install/).

## Getting Started
Follow these steps to set up and run the AiBUY Test Automation Framework:

1. **Clone the Repository:** Begin by cloning this repository to your local machine.
2. **Configure WebDriver:** Download and configure the WebDriver compatible with your system. In the provided build.gradle.kts file, the project uses Selenium WebDriver for FireFox. You can modify the dependencies to use other WebDriver options.
3. **Download FireFox Browser**
3. **Run Tests:** Run tests from feature files.

## Project Structure
- `src/test/resources`: Contains feature files for Cucumber tests.
- `src/test/kotlin`: Includes the test automation code written in Kotlin.
- `build.gradle.kts`: The build script that defines project dependencies and tasks.
- `settings.gradle.kts`: Configuration for the project settings.

## Dependencies
The AiBUY Test Automation Framework relies on the following main dependencies:

- Kotlin
- Spring Boot
- Cucumber
- WebDriverManager
- Selenium WebDriver

## Test Execution
Tests are executed using Cucumber. Test scenarios are defined in feature files located in the `src/test/resources` directory. Test automation code is written in Kotlin under `src/test/kotlin`.

### Test Scenario Stability

- **newspage.feature** and **scheduledemo.feature**: These scenarios are stable and have no reported issues.

- **bookdemo.feature**:
    - This scenario involves interacting with elements inside an iframe.
    - The Submit button and Back button do not work as expected, as they do not return a valid URL in response, causing test failures.

- **solutionpage.feature**:
    - In this scenario, the "Our Solutions" and "Our Platforms" elements are not clickable due to an obscuring element `<a class="ekit-menu-nav-link" href="https://aibuy.io/category/news/">`.

Please keep in mind that the stability issues in `bookdemo.feature` and `solutionpage.feature` require bug fixing. Tests will perform fine after fixing is done.