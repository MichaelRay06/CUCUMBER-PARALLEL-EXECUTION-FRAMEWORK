Feature: search

Scenario Outline: I serch for a product
Given I am on gurigisite using "<browaseName>"
And I log in to site with "<userName>" and "<password>"
 And I serch "<item>"
Then I verify search "<product>" 

Examples:
|browaseName|userName             |password  |item   |product|
|chrome     |bfatogun@yahoo.com   |sonsofgod |blouse |BLOUSE |
|firefox    |bfatogun@yahoo.com   |sonsofgod |blouse |BLOUSE |




