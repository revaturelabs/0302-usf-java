package com.revature.collectionsintro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Driver {
  
  public static void main(String[] args) {
    System.out.println("Hello World");
    
    List<String> myStrings = new ArrayList<String>();
    
    //add in order
    myStrings.add("Hi from first element");
    myStrings.add("Hi from second element");
    
    //add at index
    myStrings.add(1, "Inserted element");
    
    //check if myStrings contains a given String:
    // this is false because "Inserted" is not .equals to "Inserted element"
    System.out.println(myStrings.contains("Inserted"));
    
    //get element by index:
    System.out.println(myStrings.get(2));
    
    //get the index of an element:
    System.out.println(myStrings.indexOf("Inserted element"));
    
    System.out.println(myStrings);
    
    //use a classic for loop with lists:
    for(int i=0; i< myStrings.size(); i++) {
      System.out.println("Classic for loop: " + myStrings.get(i));
    }
    
    //use an "enhanced" for loop, or a for-each loop with lists:
    for(String s : myStrings) {
      //s will take as a value all the elements of myStrings
      System.out.println("Enhanced for loop: " + s);
    }
    
    Set<Integer> myIntegers = new HashSet<Integer>();
    
    myIntegers.add(4);
    myIntegers.add(3);
    myIntegers.add(13);
    myIntegers.add(44);
    myIntegers.add(4);
    myIntegers.add(4);
    myIntegers.add(5);
    
    for(int i=0; i<30; i++) {
      myIntegers.add(i+20000);
    }
    
    System.out.println(myIntegers);
    
    System.out.println(myIntegers.contains(44));
    
    //Loops through all the elements of myIntegers.
    // i takes each value for one iteration of the loop
    for(Integer i : myIntegers) {
      System.out.println(i);
    }
    
    //This creates a TreeSet that imposes a sorting
    Set<Integer> mySortedSet = new TreeSet<Integer>(myIntegers);
    
    //new elements are automatically sorted
    mySortedSet.add(0);
    
    System.out.println("Sorted:" + mySortedSet);
    
    //Strings go by ASCII: alphabetical, with all capitals coming before
    // all lowercase
    Set<String> mySortedStrings = new TreeSet<String>();
    mySortedStrings.add("A");
    mySortedStrings.add("C");
    mySortedStrings.add("B");
    mySortedStrings.add("c");
    mySortedStrings.add("b");
    
    System.out.println(mySortedStrings);
    
    
  }
  
}
