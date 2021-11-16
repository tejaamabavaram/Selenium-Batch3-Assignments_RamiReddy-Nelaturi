Feature: IIM Login, Homepage & Search

  @Regression @SMOKE
  Scenario:1 - Login page objects check
    When User is on IIM Login Page
    Then User should see Login Page breadcrumb
    And User should see Welcome message
    And User should see Username, password, Forgot password, showicon and Login button

  @Regression @SMOKE
  Scenario:2 - Login page password text check
    When User is on IIM Login Page
    And User set 'password'
    And User click on showicon
    Then User should see password in text format

  @Regression @SMOKE
  Scenario:3 - Login page password encryption check
    When User is on IIM Login Page
    And User set 'password'
    Then User should see password in encrypted format

   @Regression @SMOKE
  Scenario Outline:4 - Login mandatory field validation check
    Given User is on IIM Login Page
    When User invalid credentials are entered "<username>","<password>"
    Then User should see field validation message
    Examples:
      | username     | password     |
      |              | S2VlcnRoeUAx |
      | S2VlcnRoeQ== |              |
      |              |              |