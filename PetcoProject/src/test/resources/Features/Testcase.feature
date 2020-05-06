@PetCo_Project
Feature: Petco Website

@tc_01_login
Scenario Outline: validate the login functionality

Given Launch the browser and enter the url
When Petco page is opened
Then Go to Account and Click signin button
Then Login page is displayed
Then enter the "<email>" and "<password>"
Then Click the login
And Take screenshots and quit browser

Examples:
|email |password |
|fakeemail@gmail.com   | admin123 |
|nthanonklin@gmail.com    | Barkbark99 |
