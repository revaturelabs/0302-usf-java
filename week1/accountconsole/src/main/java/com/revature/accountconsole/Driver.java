package com.revature.accountconsole;

import java.util.Scanner;

public class Driver {
  
  /**
   * Canonical scanner for reading console input.
   */
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
   // runEcho();
    getTokens();
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
   * Less commonly used with System.in, your Scanner splits input into "tokens"
   */
  public static void getTokens() {
    System.out.println("Splitting input into tokens, STOP to stop:");
    while(sc.hasNext()) {
      String word = sc.next();
      if(word.equals("STOP")) {
        break;
      } else {
        System.out.println(sc.next()); //default setting is to get you a single word.
      }
    }
  }

}
