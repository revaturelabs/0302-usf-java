package com.revature.accountconsole;

import java.util.Scanner;

public class Driver {
  
  /**
   * Canonical scanner for reading console input.
   */
  private static Scanner sc = new Scanner(System.in);

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
      case "0":
        return 0;
      default:
        System.out.println("failed to recognize option");
        return 1;
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
