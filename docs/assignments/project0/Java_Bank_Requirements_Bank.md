# Bank

## Description

   The Bank app is a console-based application that simulates banking operations. A customer can apply for an account, view their balance, and make withdrawals and deposits. An employee can aprove or deny accounts and view account balances for their customers.
	
## Purpose

   We want to see that you can meet deadlines and that you can code. You are expected to complete the following requirements and give a 5 minute presentation of your project to our QC team.

## Requirements
1. Functionality should reflect the below user stories.
2. Data is stored in a database.
3. A custom stored procedure is called to perform some portion of the functionality.
4. Data Access is performed through the use of JDBC in a data layer consisting of Data Access Objects.
5. All input is received using the java.util.Scanner class.
6. Log4j is implemented to log events to a file.
7. A minimum of one (1) JUnit test is written to test some functionality.


## User Stories

* As a user, I can login.
* As a customer, I can apply for a new bank account with a starting balance.
* As a customer, I can view the balance of a specific account.
* As a customer, I can make a withdrawal or deposit to a specific account.
* As the system, I reject invalid transactions.
	* Ex:
		* A withdrawal that would result in a negative balance.
		* A deposit or withdrawal of negative money.
* As an employee, I can approve or reject an account.
* As an employee, I can view a customer's bank accounts.
* As a user, I can register for a customer account.
* As a customer, I can post a money transfer to another account.
* As a customer, I can accept a money transfer from another account.
* A an employee, I can view a log of all transactions.
