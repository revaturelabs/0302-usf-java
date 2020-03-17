package com.revature.accountconsole;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Driver {
  
  /**
   * Canonical scanner for reading console input.
   */
  private static Scanner sc = new Scanner(System.in);
  
  /**
   * All user accounts created.  We don't have file or DB storage just yet.
   */
  private static Set<Account> accounts = new HashSet<Account>();

  public static void main(String[] args) {
    //Run the menu repeatedly until the runMenu method returns 0, telling us to exit.
    while(true) {
      int menuOutput = runMenu();
      if(menuOutput == 0) {
        break;
      }
    }
  }
  
  /**
   * Runs a menu that lets the user select a feature of our program.
   * Returns a 0 if the program should exit, returns a 1 otherwise.
   */
  public static int runMenu() {
    System.out.println("Welcome to the menu:");
    System.out.println("Choose 1 for echo program.");
    System.out.println("Choose 2 for token program.");
    System.out.println("Choose 3 for division program");
    System.out.println("Choose 4 to create Account");
    System.out.println("Choose Accounts to list all Accounts");
    
    System.out.println("Choose 0 to exit.");
    String userOption = sc.nextLine();
    switch(userOption) {
      case "1":
        runEcho();
        return 1;
      case "2":
        getTokens();
        return 1;
      case "3":
        runDivision();
        return 1;
      case "4":
        createAccount();
        return 1;
      case "Accounts":
        System.out.println(Driver.accounts);
        return 1;
      case "0":
        return 0;
      default:
        System.out.println("failed to recognize option");
        return 1;
    }
  }
  
  public static void createAccount() {
    System.out.println("Welcome to Account creation.");
    //just one retry count, we'll let the user retry until 3 retries then boot them
    int retryCount = 0;
    while(retryCount<3) {
      System.out.println("Please provide a username:");
      String username =  sc.nextLine();
      System.out.println("Please provide a password:");
      String password = sc.nextLine();
      System.out.println("Please provide a name for the Account");
      String name = sc.nextLine();
      try {
        //attempt to create new account:
        Account account = new Account(username, password, name);
        //add newly created account to our registry of Accounts
        Driver.accounts.add(account);
        break;
      } catch (PasswordTooShortException e) {
        System.out.println("Password too short, please retry with password of 8 more characters");
        retryCount++;
      } catch (DuplicateUsernameException e) {
        //TODO: make suggested username logic instead of retrying.
        System.out.println("Username already exists in our system, please retry with another");
        retryCount++;
      }
    }
    //for better UX:
    if(retryCount >=3) {
      System.out.println("Retries exceeded, exiting account creation.");
    }
    
  }
  
  /**
   * Runs the program that lets the user divide 2 numbers
   * We'll keep our exception handling logic for division inside of this method
   */
  public static void runDivision() {
    System.out.println("Starting division program:");
    System.out.println("Input numerator:");
    String numeratorInput = sc.nextLine(); //this is easier to deal with than sc.nextInt();
    System.out.println("Input denominator:");
    String denominatorInput = sc.nextLine();
    try {
      System.out.println(numeratorInput + " / " + denominatorInput + " = " +
          (Integer.parseInt(numeratorInput)/Integer.parseInt(denominatorInput)));
    } catch(NumberFormatException e) {
      System.out.println("Your input could not be parsed as a number");
      System.out.println("Please run division program again to solve this problem."); //provides guidance to user
    } catch(ArithmeticException e) {
      System.out.println("Cannot divide by 0.  Please provide a different denominator:"); //prompt for different input
      denominatorInput = sc.nextLine();
      //We could solve this by looping, or through nested try-catch -- they can input 0 again:
      System.out.println(numeratorInput + " / " + denominatorInput + " = " +
          (Integer.parseInt(numeratorInput)/Integer.parseInt(denominatorInput)));
    }
  }
  
  /**
   * Runs the program that echoes user input
   */
  public static void runEcho() {
    System.out.println("Starting echo, STOP to stop:");
    //int nextInt =  sc.nextInt(); //grabs a single int, leaving the newline character
    while(true) {
      //whatever the user types comes to the scanner after they hit enter:
      
      String input = sc.nextLine();
      if(input.equals("STOP")) {
        break; //exit the loop
      } else {
        System.out.println(input);
      }
    }
  }
  
  /**
   * Less commonly used with System.in, your Scanner splits input into "tokens".
   * For your projects, use the nextLine() example unless you know what you're doing!
   */
  public static void getTokens() {
    System.out.println("Splitting input into tokens, STOP to stop:");
    while(sc.hasNext()) {
      String word = sc.next();
      if(word.equals("STOP")) {
        break;
      } else {
        System.out.println(word); //default setting is to get you a single word.
      }
    }
  }

}
