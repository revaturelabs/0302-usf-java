package com.revature.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Driver {
  
  public static void main(String[] args) {
    //dictionaryDemo();
    wordCount("the quick brown fox jumped over the lazy dog");
    wordCount("the the red blue red");
  }

  public static void dictionaryDemo() {
    //Map declaration.  HashMap is default
    Map<String, String> myDictionary = new HashMap<String, String>();
    
    myDictionary.put("mug", "container for coffee");
    myDictionary.put("cat", "animal that kills mice");
    myDictionary.put("webcam", "enables remote training");
    
    //print dictionary
    System.out.println(myDictionary);
    
    //print a defintion retrieved by its word:
    System.out.println(myDictionary.get("cat"));
    
    //keys not associated with a value in the Map get null:
    System.out.println(myDictionary.get("dog"));
    
    //Each key can only have one value associated, so if we put() with an existing
    // key it overrides the current value.
    myDictionary.put("cat", "fuzzy animal");
    
    System.out.println(myDictionary);
    
    //The reason Map is considered part of the Collections Framework is that its methods deal with Collections:
    System.out.println(myDictionary.keySet());
    System.out.println(myDictionary.values());
    
    //We're not limited to Map<String, String>, we can have keys that are any Object and values that are any Object
    // no real reason to do this, but its possible:
    Map<Integer, Scanner> mySillyExampleMap =  new HashMap<Integer, Scanner>();
    
    //put our scanner as the value in a map, with key 4 
    mySillyExampleMap.put(4, new Scanner(System.in));
    
    //We can use the Scanner stored in our Map, no problem:
    System.out.println(mySillyExampleMap.get(4).nextLine());
    
    String input = mySillyExampleMap.get(4).nextLine(); // this is a reference to our Scanner
    
    System.out.println(input);
    
  }
  
  /**
   * wordCount counts the number of each word in an input text and returns a Map
   * pairing each word with the number of incidences of it.
   * 
   * Example: wordCount("the the red blue red") will return
   * {the=2, red=2, blue=1}
   * 
   * @param text
   * @return
   */
  public static Map<String, Integer> wordCount(String text) {
    //Let's begin by creating our output map:
    Map<String, Integer> wordCounts =  new HashMap<String, Integer>();
    
    //We need to get words from our input text:
    String[] words = text.split(" "); //words is an array of words
    
    System.out.println(Arrays.toString(words));
    
    //Now that we have an array of words, what do we do next? We need to count each word.
    //starting with a loop is a good idea:
    for(int i=0; i<words.length; i++) {
      
    }
    
    
    return wordCounts;
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
}

