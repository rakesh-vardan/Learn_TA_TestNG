
---

# TestNG Concepts

Welcome to the **TestNG** repository! This repository is created to help students understand and practice the core concepts of TestNG, with comprehensive examples. The project uses **Maven** as the build tool to manage dependencies, run tests, and build the project.

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Key TestNG Concepts Covered](#key-testng-concepts-covered)

## Overview

This repository demonstrates the following TestNG concepts:
- Test Annotations (`@Test`, `@BeforeMethod`, `@AfterMethod`, etc.)
- Test Groups
- Data Providers
- Parallel Testing
- Parameterized Tests
- TestNG XML Configuration
- Listeners, Assertions, and more.

Each concept is explained with working code examples.

## Prerequisites

Before using this repository, ensure you have the following installed on your system:

- **Java Development Kit (JDK) 8 or later**  
  Download and install from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).

- **Maven**  
  Download and install from [Maven](https://maven.apache.org/install.html).

- **Git**  
  To clone the repository, ensure Git is installed. Download it from [here](https://git-scm.com/downloads).

## Setup Instructions

1. **Clone the Repository**  
   Open a terminal and run the following command to clone the repository to your local machine:
   ```bash
   git clone https://github.com/rakesh-vardan/Learn_TA_TestNG.git
   ```

2. **Navigate to the Project Directory**  
   Move into the project folder:
   ```bash
   cd Learn_TA_TestNG
   ```

3. **Build the Project**  
   Use Maven to clean and install the project dependencies:
   ```bash
   mvn clean install
   ```

4. **Open the Project in Your IDE**  
   You can open this project in your favorite IDE, such as **IntelliJ IDEA** or **Eclipse**. Maven will automatically configure the project dependencies.

## Running Tests

You can run the tests using Maven from the command line or directly from your IDE.

### To run tests from the command line:

```bash
mvn clean test
```

### To run specific test suites:

To run a specific TestNG suite from the command line, use the following command:

```bash
mvn test "-DsuiteXMLFile=testng-smoke.xml"
```

## Key TestNG Concepts Covered

The project contains detailed examples of the following TestNG features:

- **Annotations**: `@Test`, `@BeforeMethod`, `@AfterMethod`, `@BeforeClass`, etc.
- **TestNG XML**: How to configure test execution in `testng.xml`.
- **Groups**: Grouping and prioritizing tests.
- **Data Providers**: Parameterizing tests with `@DataProvider`.
- **Listeners**: Implementing TestNG listeners for advanced reporting.
- **Parallel Execution**: Running tests in parallel.
- **Assertions**: Using TestNG assertions for validation.

Each feature is explained with comments in the code to help you understand the concepts clearly.

---
