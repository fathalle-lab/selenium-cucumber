#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Login
 En tant que  utilisateur je souhaite tester la page de connexion 

  @login_valid_credential
  Scenario: Login avec des données valides
    Given Je me connecte sur une application Orange
    When Je saisie mon username "Admin"
    And Je saisie le mot de passe"admin123"
    And Je clique sur le bouton Login
    Then Je me dérige vers la page Dashboard "Dashboard"
   
 