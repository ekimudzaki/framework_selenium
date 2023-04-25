This Framework based on my last framework template last year.

**This includes several tools:**
- Gradle as dependency tools
- Springboot as java framework library
- Cucumber (Gherkin) as a BDD tools to create test cases
- ReportPortal as reporting framework (if you wanted to use it)
- Selenium GRID to manage parallel test
- Lombok as setter and getter tools

**Prerequisites** 

- Please use JAVA 18 to be able to run this project
- Open this project using intellij idea community editon (Recommended), or any java IDE
- Install cucumber plugin for java (intellij only)
- Don't forget to set up gradle using the same jvm (intellij only)

**How to run this project**

- Using CLI
  ```
  ./gradlew test -Ddataproviderthreadcount=1 -Dcucumber.filter.tags=@signup
  ```

* -Ddataproviderthreadcount _is how many thread are you using when running the test._
* -Dcucumber.filter.tags _is which tag are you running_

**Reporting path**
  ```
  build/test-results/html-report.html
  ```