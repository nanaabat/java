/**
* TestCollection.java
*
* @author Nana Aba Turkson
* @version 21st May, 2020
*/


import java.util.*;

public class LinkedListCollection{



  public static void main(String [] args){

    //fields
    LinkedList<String> collectionOne = new LinkedList<>();
    LinkedList<String> collectionTwo = new LinkedList<>();


    //adding elements to the collectionOne
    collectionOne.add("New York");
    collectionOne.add("Atlanta");
    collectionOne.add("Dallas");
    collectionOne.add("Maddison");

    //printout
    System.out.println("\nList of cities in the first Collection");
    System.out.println(collectionOne);

    //checking if Dallas is in the collectionOne
    System.out.println("\nIs Dallas still in collectionOne? : " + collectionOne.contains("Dallas"));


    //removing Dallas from collectionOne
    collectionOne.remove("Dallas");

    //size of the collectionOne
    System.out.println("\n" + collectionOne.size()
    + " cities are in the collectionOne now");


    //adding elements to collectionTwo
    collectionTwo.add("Seattle");
    collectionTwo.add("Portland");
    collectionTwo.add("Los Angelos");
    collectionTwo.add("Atlanta");


    //printing out collectionTwo
    System.out.println("\nList of cities in the second Collection");
    System.out.println(collectionTwo);


    //cloning collectionOne
    LinkedList<String> cloneC1 = (LinkedList<String>)(collectionOne.clone());
    cloneC1.addAll(collectionTwo); //add all of cities in the 2nd collection
    System.out.println("\nCities in the first or second collection");
    System.out.println(cloneC1);

    //rewriting cloneC1
    cloneC1 = (LinkedList<String>)(collectionOne.clone());
    cloneC1.retainAll(collectionTwo); //retainAll
    System.out.println("\nCities in the first and second collection");
    System.out.println(cloneC1);


    //rewritng cloneC1
    cloneC1 =(LinkedList<String>)(collectionOne.clone());
    cloneC1.removeAll(collectionTwo);
    System.out.println("\nCities in the first collection and not in the second collection");
    System.out.println(cloneC1);


  }
}
