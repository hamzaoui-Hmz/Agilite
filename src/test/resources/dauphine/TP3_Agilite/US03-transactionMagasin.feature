
#Author: Hamzaoui Mohamed && Sersour Katia 

@tag
Feature: transaction passée dans le magasin
         étant donnée la création du magasin
         On veut avoir un résultat sur les transactions qui sont faites dans le magasin 

  @tag1
   Scenario: transaction passé dans le magasin
    Given somme de tous les fonds de caisse 40 avec les jetons 70 qu'on a dans le magasin 
    When  l'utilisateur décide d'avoir le total des fonds dans le magasin 
    Then  Total des fonds dans le magasin 110 
