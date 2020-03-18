package com.revature.accountconsole;

import java.util.HashSet;
import java.util.Set;

public class Account {
  
  private static Set<String> usernames = new HashSet<String>();
  //constant with descriptive name for easier-to-read code
  private static final int REQUIRED_PASSWORD_LENGTH = 8;

  // private fields, public getters and setters
  private String username;
  private String password;
  private String name;
  
  public Account(String username, String password, String name) throws DuplicateUsernameException, PasswordTooShortException {
    //instead of using this.username=username and skipping our setter logic, lets just use it:
    this.setUsername(username);
    this.setPassword(password);
    this.setName(name);
  }
  
  /**
   * Returns true if the username and password input matches the username and password for this account
   * Returns false otherwise.
   * @param username
   * @param password
   * @return
   */
  public boolean authenticate(String username, String password) {
    return this.username.equals(username) && this.password.equals(password);
  }

  public String getUsername() {
    return username;
  }
    
  /**
   * Attempts to set the username on this Account.
   * 
   * The "throws DuplicateUsernameException" part of the method signature signifies that we won't
   * handle DuplicateUsernameExceptions here.  Instead, calling classes must handle that Exception.
   * @param username
   * @throws DuplicateUsernameException
   */
  public void setUsername(String username) throws DuplicateUsernameException {
    if(Account.usernames.contains(username)) {
      throw new DuplicateUsernameException();
    }
    Account.usernames.add(username);
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  /**
   * Attempts to set the password on this Account.
   * 
   * @param password
   */
  public void setPassword(String password) throws PasswordTooShortException {
    if(password.length() < REQUIRED_PASSWORD_LENGTH) {
      throw new PasswordTooShortException();
    }
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Account [username=" + username + ", password=" + password + ", name=" + name + "]";
  }

  

}
