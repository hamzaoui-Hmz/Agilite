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
@tag
Feature: Création du magasin 
         En tant que résponsable je veux créer un magasin afin de le gérer et faire des actions comme 
         ajouter une caisse, faire une transaciton ...  


 @tag1
  Scenario Outline:  Création d'un magasin 
    Given La création dun magasin comprenant <Jeton> 
    When  l'utilisateur décide de créer un magasin 
    Then  Création du magasin  
    
    Examples: 
      |Jeton| 
      | 40  | 
      | 40  |

@tag2
  Scenario Outline: si le responsable souhaite faire une action comme ouverture ou  fermeture du magasin 
    Given voir letat du magasin which si elle est ouverte ou <ouvert>
    When  lutilisateur Décide de modifier louverture du magasin <ferme>
    Then  état du magasin est modifié 

   Examples: 
      |ouvert| ferme|
      | YES  | NO   |


 