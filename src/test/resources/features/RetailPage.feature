@Smoke
Feature: Retail Page

Background: 
Given User is on Retail website 
When User click on MyAccount
And User click on Login 
And User enter username 'alex.shah@gmail.com' and password 'md123'
And User click on Login button
Then User should be logged in to MyAccount dashboard

@chequePayment
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on 'Register for an Affiliate Account' link 
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|
|shahinc.|www.shahinc.com|TAX123|Cheque|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 

@bankTransfer
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on 'Edit your affiliate information'
When User click on Bank Transfer radio button
When User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|CityBank|99994545|33663366|Checking|123-44-5678|
And User click on Continue button 
Then User should see a success message 

@accountInfo
Scenario: Edit your account Information
When User click on 'Edit your account information' link 
And User modify below information 
|firstname|lastName|email|telephone|
|Ali|Shafaie|ali.sh@gmail.com|301-355-9900|
And User click on Continue button
Then User should see a final message 'Success: Your account has been successfully updated.'





