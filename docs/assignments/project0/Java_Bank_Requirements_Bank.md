# Banking Project

## Presentations (Monday ~ Wednesday of Week 3)
* Presentations will start when QC team joins.

## Create a bank that users can interact with
* As a user I can login and logout.
* As a user I can view my balance.
* As a user I can withdraw money.
* As a user I can deposit money.
* As a user I can register.
* Optional: As a user I can view all my transactions.
* Optional: As a user I can transfer money from my account to another account.

## Requirements
* Data is persisted (saved) to an Postgres database with JDBC.
    * While you don't know these technologies, use interface driven development and
    start with a concrete implementation that return static data (a List with something for example) or use Serialization and persist data to a text file.
    * Once you learn JDBC and basics of SQL, you can create a new concrete implementation from that interface that you created and proceed to develop the actual data access code.
* Make at least 2 JUnit test cases.
    * Remember: a test case should involve more than one Test involving the same 
    functionality, example: Authentication test case - Tests: Successful Login, Failed Login.
* Use Log4j for error tracking and tracing.
* Create at least 2 custom exceptions.
* Input/Output through the console.

## Reminder
* Stick to the requirements, don't go overboard with extra features and if you do have extra features, make sure the main requirements are met.
* It is *not* mandatory to follow the package structure provided in this project, however, I totally recommend you to try to follow it because this is the way that you develop following the *single responsibility principle*, and the way that we are going to code for the rest of the training.
   * If it becomes to hard for you to follow a modular approach for this project, use your own.
