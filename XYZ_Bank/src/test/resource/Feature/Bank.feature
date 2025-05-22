Feature: I am automating the XYZ Bank

Background: Common-Points

Given user launch the chrome browser 
Then user enter the url as "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"

Scenario:

When user click the bank manager login 
And Bank manager add customer Fname as "John" and Lname as "Wick" and zipcode as "110001" add customer button
Then Bank manager open the bank account on customer and choose the customer and currency and click procees button
And user can click the customer details and you have to search as "John"
And user click on home button 
Then user can click customer Login and user can choose your name and click login btn
And user click deposit and add some amount as "10000" and deposited successfull
When user click withdraw some amount as "5000" and Withdrawed Successfull
And user click transactions to check the transactions
Then user close the brower

 