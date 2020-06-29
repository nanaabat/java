/**
* TestForEach.java
*
* @author Nana Aba Turkson
* @version 21st May, 2020
*/

import java.util.*;

public class TestForEach{

  public static void main(String[] args){

    //fields
    Collection<String> collection = new ArrayList<>();

    //adding elements to the collectionOne
    collection.add("New York");
    collection.add("Atlanta");
    collection.add("Dallas");
    collection.add("Maddison");

    collection.forEach(e -> System.out.print(e.toUpperCase() + " "));

    /**
    *forEach(e -> ..) sign can be represented as

    forEach (
      new java.util.function.COnsumer<String>(){
        public void accept(String e){
          System.out.println(e.toUpperCase() + " ");
        }
      }
      )
    */
  }
}
