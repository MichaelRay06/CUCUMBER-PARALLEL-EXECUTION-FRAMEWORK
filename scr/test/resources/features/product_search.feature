@parallelRunner 
Feature: verifying search module of a Car Guruji site 




Scenario: verify produt search using chrome driver 

Given I am on gurigisite using "chrome"
And I log in to site with "bfatogun@yahoo.com" and "sonsofgod"
 And I serch "blouse"
Then I verify search "BLOUSE"




Scenario: verify produt search using firefox driver 

Given I am on gurigisite using "firefox"
And I log in to site with "bfatogun@yahoo.com" and "sonsofgod"
 And I serch "blouse"
Then I verify search "BLOUSE"

