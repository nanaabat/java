/**
* TestIterator.java
*
* @author Nana Aba Turkson
* @version 21st May, 2020
*/


import java.util.*;


public class TestIterator{

  public static void main(String[] args){

    //fields
    Collection<String> collection = new ArrayList<>();

    //adding elements to the collectionOne
    collection.add("New York");
    collection.add("Atlanta");
    collection.add("Dallas");
    collection.add("Maddison");


    Iterator<String> iterator = collection.iterator();

    while(iterator.hasNext()){
      System.out.print(iterator.next().toUpperCase() + " ");
    }

    System.out.println();


    for(String element:collection){
      System.out.print(element.toUpperCase() + " ");
    }
  }


}
