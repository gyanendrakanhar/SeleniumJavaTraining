# Selenium WebDriver Commands Practice

This repository contains practice examples and test scripts demonstrating the usage of various Selenium WebDriver commands. It is designed to help testers and developers gain hands-on experience and enhance their skills in Selenium-based test automation.

## Project Structure
The test scripts are organized under the `src/test/java/org/examples/tests` directory, showcasing practical use cases for different WebDriver commands. You can explore the complete list of Selenium WebDriver command examples by visiting the repository:

[GitHub Repository: Selenium WebDriver Commands Practice](https://github.com/gyanendrakanhar/SeleniumJavaTraining/tree/433de75b9bab6bd934b3f7f6c8b5784b7f06c160/src/test/java/org/examples/tests)

## Selenium WebDriver Commands Covered
Below is a categorized list of Selenium WebDriver commands demonstrated in this project:

### Chrome Headless Mode
- Example scripts demonstrating the execution of tests in Chrome headless mode.

### WebDriver Commands
1. **Click Methods**: Demonstrating various click actions on web elements.
2. **CSS Selectors Method**: Examples of locating elements using CSS selectors.
3. **Deselect Methods**: Handling deselection in multi-select dropdowns.
4. **Find Element Method**: Locating a single element on the page.
5. **Find Elements Method**: Locating multiple elements matching a specific locator.
6. **Get Attribute Method**: Retrieving attributes of web elements.
7. **Get Methods**: Examples of various `get` commands, including `getCurrentUrl()` and `getTitle()`.
8. **Get Text Methods**: Extracting visible text from elements.
9. **isDisplayed Methods**: Checking element visibility status.
10. **JavaScript Executor Methods**: Executing JavaScript within the browser context.
11. **Keyboard Actions Methods**: Simulating keyboard interactions.
12. **Manage Cookies**: Managing browser cookies.
13. **Mouse Actions Methods**: Simulating mouse interactions like hover, click, and drag-and-drop.
14. **Navigate Methods**: Navigating between pages and refreshing.
15. **Options Methods**: Configuring WebDriver options.
16. **Select Methods**: Handling dropdown selections.
17. **SwitchTo Methods**: Switching to frames, windows, and alerts.
18. **WebElement Methods**: Comprehensive use of WebElement methods.
19. **Window Handle Method**: Managing window handles.
20. **Window Methods**: Managing browser windows.

### XPath Methods
21. **XPath Axes Methods**: Navigating through elements using XPath axes.
22. **XPath Locator Index Method**: Locating elements by index.
23. **XPath Locator Text Method**: Locating elements by text content.
24. **XPath Selector Contains Methods**: Using `contains()` in XPath expressions.
25. **XPath Selector Logical Methods**: Applying logical operators in XPath expressions.
26. **XPath Selector Starts With Method**: Using `starts-with()` in XPath expressions.

## Prerequisites
- Java Development Kit (JDK)
- Maven
- ChromeDriver
- Selenium WebDriver Library

## How to Run the Tests
1. Clone this repository:
   ```bash
   git clone https://github.com/gyanendrakanhar/SeleniumJavaTraining.git
   ```
2. Navigate to the project directory.
3. Use Maven to execute the test suite:
   ```bash
   mvn test
   ```



# Selenium Java Training Projects

Welcome to the **Selenium Java Training** repository! This repository contains various projects and scripts to practice software testing using Selenium WebDriver with Java. Below is a brief overview of each project, along with usage instructions.

---

## Repository Link
Access the codebase here: [Selenium Java Training Repository](https://github.com/gyanendrakanhar/SeleniumJavaTraining/tree/433de75b9bab6bd934b3f7f6c8b5784b7f06c160/src/main/java)

---

## Project Descriptions

### 1. Account_Registration_Automation
**Description:**
Automates the account registration process on a sample web application.

**Features:**
- Automated form filling.
- Validations for mandatory fields.
- Submission and confirmation.

**Usage Instructions:**
1. Open `AccountRegistrationAutomation.java`.
2. Ensure the required dependencies (Selenium, TestNG, etc.) are set up.
3. Run the script to test the registration flow.

---

### 2. Login
**Description:**
Tests the login functionality for an application.

**Features:**
- Valid login scenario.
- Invalid login scenario handling.

**Usage Instructions:**
1. Navigate to `LoginAutomation.java`.
2. Configure the correct login credentials.
3. Run the script to validate login flows.

---

### 3. Automated_Testing_of_Ecommerce_application
**Description:**
Performs comprehensive automated testing on an e-commerce website.

**Features:**
- Search functionality testing.
- Add to cart and checkout.
- Payment flow simulation.

**Usage Instructions:**
1. Open `EcommerceAutomation.java`.
2. Adjust configuration for the target website.
3. Run the script to automate the e-commerce application.

---

### 4. FirstScript
**Description:**
A simple introductory Selenium script for learning.

**Features:**
- Browser launch.
- Navigating to a webpage.
- Simple assertions.

**Usage Instructions:**
1. Open `FirstScript.java`.
2. Ensure browser drivers are correctly set up.
3. Execute to verify basic Selenium operations.

---

### 5. GmailTitle
**Description:**
Tests the title of the Gmail homepage.

**Features:**
- Browser navigation.
- Title verification.

**Usage Instructions:**
1. Open `GmailTitleCheck.java`.
2. Verify Gmail URL configuration.
3. Run to check the title assertion.

---

## Prerequisites
- Java Development Kit (JDK) 8 or higher.
- Selenium WebDriver.
- Maven for dependency management.
- TestNG or JUnit (depending on the project).
- Browser drivers (ChromeDriver, GeckoDriver, etc.).

---

## Setup Instructions
1. Clone the repository:
   ```sh
   git clone https://github.com/gyanendrakanhar/SeleniumJavaTraining.git
   ```
2. Navigate to the appropriate directory:
   ```sh
   cd SeleniumJavaTraining/src/main/java
   ```
3. Import the project into your preferred IDE (Eclipse, IntelliJ, etc.).
4. Configure dependencies using Maven or manually add required libraries.
5. Update browser driver paths if necessary.
