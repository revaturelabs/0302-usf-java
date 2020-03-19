package com.revature.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {
    // dictionaryDemo();
    System.out.println(wordCount("the quick brown fox jumped over the lazy dog"));
    System.out.println(wordCount("the the red blue red"));

    System.out.println(letterCount("the the red blue red"));
  }

  public static void dictionaryDemo() {
    // Map declaration. HashMap is default
    Map<String, String> myDictionary = new HashMap<String, String>();

    myDictionary.put("mug", "container for coffee");
    myDictionary.put("cat", "animal that kills mice");
    myDictionary.put("webcam", "enables remote training");

    // print dictionary
    System.out.println(myDictionary);

    // print a defintion retrieved by its word:
    System.out.println(myDictionary.get("cat"));

    // keys not associated with a value in the Map get null:
    System.out.println(myDictionary.get("dog"));

    // Each key can only have one value associated, so if we put() with an existing
    // key it overrides the current value.
    myDictionary.put("cat", "fuzzy animal");

    System.out.println(myDictionary);

    // The reason Map is considered part of the Collections Framework is that its methods deal with
    // Collections:
    System.out.println(myDictionary.keySet());
    System.out.println(myDictionary.values());

    // We're not limited to Map<String, String>, we can have keys that are any Object and values
    // that are any Object
    // no real reason to do this, but its possible:
    Map<Integer, Scanner> mySillyExampleMap = new HashMap<Integer, Scanner>();

    // put our scanner as the value in a map, with key 4
    mySillyExampleMap.put(4, new Scanner(System.in));

    // We can use the Scanner stored in our Map, no problem:
    System.out.println(mySillyExampleMap.get(4).nextLine());

    String input = mySillyExampleMap.get(4).nextLine(); // this is a reference to our Scanner

    System.out.println(input);

  }

  /**
   * wordCount counts the number of each word in an input text and returns a Map pairing each word
   * with the number of incidences of it.
   * 
   * Example: wordCount("the the red blue red") will return {the=2, red=2, blue=1}
   * 
   * @param text
   * @return
   */
  public static Map<String, Integer> wordCount(String text) {
    // Let's begin by creating our output map:
    Map<String, Integer> wordCounts = new HashMap<String, Integer>();

    // We need to get words from our input text:
    String[] words = text.split(" "); // words is an array of words

    System.out.println(Arrays.toString(words));

    // Now that we have an array of words, what do we do next? We need to count each word.
    // starting with a loop is a good idea:
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      // We want to add one to the count for word, and create the entry for word if it doesn't
      // exist.

      // lets first create the entry for our word if it doesn't yet exist:
      if (!wordCounts.containsKey(word)) { // if wordCounts does not contain word
        wordCounts.put(word, 0);
      }

      // then we add one to the count for that word
      // wordCounts.put(word, wordCounts.get(word) + 1); //increment by one

      // longform of the above: does the same as line 90.
      Integer oldCount = wordCounts.get(word); // the count of word before this iteration of the
                                               // loop.
      Integer newCount = oldCount + 1; // add one to oldCount because we see the word in this
                                       // iteration of the loop
      wordCounts.put(word, newCount);

      System.out.println(wordCounts);
    }

    return wordCounts;
  }

  /**
   * Returns a count of each letter appearing in the input text as a map. Ignores spaces.
   * 
   * Example: letterCount("the the red blue red") will return {t=2,h=2,e=5,r=2,d=2,b=1,l=1,u=1}
   * 
   * @param text
   * @return
   */
  public static Map<String, Integer> letterCount(String text) {
    Map<String, Integer> letterCounts = new HashMap<String, Integer>();

    String[] letterz = text.split("");

    System.out.println(Arrays.toString(letterz));

    for (int i = 0; i < letterz.length; i++) {
      String letter = letterz[i];

      if (!letter.contentEquals(" ")) {
        if (!letterCounts.containsKey(letter)) {

          letterCounts.put(letter, 0);

        }
        letterCounts.put(letter, letterCounts.get(letter) + 1);

      }

    }



    return letterCounts;
  }



}

