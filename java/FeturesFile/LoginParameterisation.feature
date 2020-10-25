@toRun
Feature: Jbk Test
Background:
Given user fill "file:///E:/Offline%20Website/index.html"

@Logo
Scenario: logo test
Then logo  display

@Login
Scenario Outline:login Test
When user fill "<username>" and <"password">
Then user  on Home page

Examples:
|username|password|
|kiran@gmail.com|123456|
|mangesh@gmail.com|123456|
|neelam@gmail.com|123456|
