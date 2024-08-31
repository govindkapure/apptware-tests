/** This class is expected to be a singleton. Please make necessary changes. */
package com.apptware.interview.singleton;

public class Singleton {
  private static Singleton single_instance = null;
  private static boolean isInstanceCreated = false;

  public String s;

  private Singleton() {
    if (isInstanceCreated) {
      throw new RuntimeException("Use getInstance() method to create");
    } else {
      isInstanceCreated = true;
      s = "Hello I am a string part of Singleton class";
    }
  }

  public static synchronized Singleton getInstance() {
    if (single_instance == null) single_instance = new Singleton();
    isInstanceCreated = true;
    return single_instance;
  }
}
