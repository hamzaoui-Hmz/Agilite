#Author: Hamzaoui Mohamed && Sersour Katia
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
Feature: étant donnée la création d'un magasin et la création   de  plusieurs caisses dans ce magasin 
         Le résponsable du magasin veut verifier, si les caisses sont bien ajouter dans le magasin 
         Ainsi, d'avoir un bilan sur l'état des caisses. C'est-à-dire, si une caisse est en panne ou pas. 
         Si cette derniere est en panne le résponsable fais appel a un réparteur de caisses pour la réparer.
       


  @tag1
  Scenario: vérifier si les caisses existent dans le magasin  
    Given La vérification  dune caisse dans un magasin   comprenant
    When  l'utilisateur souhaite vérifier une caisse dans un magasin 
    Then  La caisse est attribuer dans ce Magsin 
   
   
     @tag2
  Scenario: vérifier Caisse si elle est ouverte
    Given étant donnée une caisse 
    When  l'utilisateur décide de vérifier si la caisse est ouverte ou pas
    And   la transaction 
    And   vérifier le fond de la ciasse aprés une transaction 
    Then  renvoie l'état de la caisse(ouverte ou pas) 
     
   
  @tag3
  Scenario: CaissePanne : responsable dois vérifier si la caisse est en panne ou pas
    Given étant donne une caisse existante
    When  quand l'utilisateur souhaite verifier la panne d'une caisse
    Then  l'état de la caisse est renvoyée

    @tag4
  Scenario: si la caisse est en panne alors le responsable fera appel a un reparateur, pour reparer la panne 
            de  la caisse 
    Given étant donnée une caisse qui est en panne 
    When  l'utilisateur décide réparer la caisse 
    Then  la caisse est réparé 
