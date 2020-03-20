package com.revature.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Driver {
  
  //We can use the throws keyword on the main method.  Any Exception thrown from the main method
  // will crash your program.
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
    
    //Remember <?> means not specifying the type for a generic
    Class<?> inspectClass = Class.forName("com.revature.reflections.InspectMe");
    
    //These print method and constructor signatures:
    System.out.println(Arrays.toString(inspectClass.getDeclaredMethods()));
    System.out.println(Arrays.toString(inspectClass.getConstructors()));
    
    //We're not limited to just inspecting the class com.revature.reflections.InspectMe,
    // we can use these methods and constructors.
    //Get all declared methods and loop through them:
    Method[] inspectClassMethods = inspectClass.getDeclaredMethods();
    for(int i=0; i<inspectClassMethods.length; i++) {
      //We're going to need an instance of InspectMe in order to invoke methods
      // so let's create one using Reflections instead of a Constructor.
      InspectMe dynamicReflectionObject = (InspectMe) inspectClass.getConstructors()[0].newInstance();
      
      System.out.println(dynamicReflectionObject);
      
      //let's call the 2 parameter method on InspectMe:
      if(inspectClassMethods[i].getParameterCount() == 2) {
        //invoke takes the object that should call the method as its first argument
        // and all arguments to the method itself come afterwards.
        inspectClassMethods[i].invoke(dynamicReflectionObject, 1,14324);
      }
    }
  }
  
  
  
  
  
  
  
  
  
  

}
