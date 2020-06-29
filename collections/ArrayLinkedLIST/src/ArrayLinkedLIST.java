/**
* ArrayLinkedLIST.java
* @author Nana Aba Turkson
* @version 3rd June, 2020
*/

import java.util.*;

public class ArrayLinkedLIST{


  public static void main(String [] args){

    //fields
    List <Integer> arrayList = new ArrayList<>();
    List <Integer> linkedList = new LinkedList<>();
    List <String> list1 = Arrays.asList("yellow", "red","green", "blue");
    List <String> list2 = Arrays.asList("yellow", "red", "green", "blue");

    //converting Arrays to LinkedList
    LinkedList < String> listList = new LinkedList(Arrays.asList("yellow", "blue", "green", "gold", "brown","violet"));


    //printing out some list methods
    System.out.println(" ");
    System.out.println("Initial List: " + listList);
    System.out.println(" ");

    //adds element at the bottom
    listList.offer("orange");
    listList.offer("silver");

    //adds elements at the end of the linkedList
    listList.add("black");
    System.out.println("New List: " + listList);
    System.out.println(" ");

    //let you see the element at the beginning
    System.out.println("Element(): " + listList.element());
    System.out.println(" ");

    //removes the element at the beginning
    System.out.println("Pop(): " + listList.pop());
    System.out.println(" ");
    //System.out.println("Peep(): " + listList.peep());

    //descending Iterator - printout the list from the end to the beginning
    Iterator descendIterator = listList.descendingIterator();
    System.out.println("The list is as follows: ");
    while(descendIterator.hasNext()){
      System.out.println(descendIterator.next());
    }
    //System.out.println("descendingIterator: " + listList.descendingIterator());
    System.out.println(" ");
    System.out.println(listList);
    System.out.println(" ");

    //listIterator - prints out list from the beginning to the end
    ListIterator listIterate = listList.listIterator();

    System.out.println("The iterate list is as follows ");
    while(listIterate.hasNext()){
      System.out.println(listIterate.next());
    }

    System.out.println(" ");
    System.out.println("listIterator: "+ listList.listIterator());
    System.out.println(" ");
    System.out.println(listList);
    System.out.println(" ");


    //printing elements in the list from the beginning to the end
    Spliterator<String> split = listList.spliterator();


    //System.out.println("First Spliterator: ");
    //split.forEachRemaining(System.out::println); // prints out the each elements remaining

    System.out.println("Second Spliterator: ");
    split.forEachRemaining((n) -> System.out.println("Colors: " + n)); // prints out elements like this Colors: (name of the color)
    System.out.println(" ");

    //shuffle, reverse, and sorting
    //shuffle(list1, list2);

    //search for an ELEMENTS
    //search(list1, list2);



    //calling these methods
  //  add(arrayList, "TIME FOR ARRAYLIST IS ");
    //add(linkedList, "TIME FOR LINKEDLIST IS ");

    //System.out.println(" ");

    //addElements(arrayList, "TIME ADDING ELEMENTS FOR ARRAYLIST IS ");
    //addElements(linkedList, "TIME ADDING ELEMENTS FOR LINKEDLIST IS ");

    //System.out.println(" ");

    //random(arrayList, "TIME FINDING ELEMENTS FOR ARRAYLIST IS ");
    //random(linkedList, "TIME FINDING ELEMENTS FOR LINKEDLIST IS ");

  }

  /**
   * Add elements to the list but most importantly trying to calculate the time it takes for arraylist amd linkedList
   * to find an element - this add method, adds to the beginning of the list
   * @param llist liost of Integers
   * @param title title
   */

  public static void add(List<Integer> llist, String title){
    for(int i = 0 ; i < 100040; i ++){
      llist.add(0, i);
    }

    long startTime = System.currentTimeMillis();

    for(int i = 0; i < 10000; i ++){
        llist.get((int)(Math.random() * 100040));
    }

    long time = System.currentTimeMillis() - startTime;
    System.out.println(title + time + " milliseconds");
  }

  /**
   * Add elements to the list but most importantly trying to calculate the time it takes for arraylist amd linkedList
   * to find an element
   * @param llist liost of Integers
   * @param title title
   */

  public static void addElements(List<Integer> llist, String title){
    for(int i = 0; i < 100040; i++){
      llist.add(i, i);
    }

    long startTime = System.currentTimeMillis();

    for(int i = 0; i < 10000; i ++){
        llist.get((int)(Math.random() * 100040));
    }

    long time = System.currentTimeMillis() - startTime;
    System.out.println(title + time + " milliseconds");
  }

  /**
   * Random method, allows an element to be radomly picked/selected from the LIST
   * @param llist list of Integers
   * @param title title
   */

  public static void random(List<Integer> llist, String title){
    long startTime = System.currentTimeMillis();

    for(int i = 0; i < 100040; i ++){
        llist.get((int)(Math.random() * 100040));
    }

    long time = System.currentTimeMillis() - startTime;
    System.out.println(title + time + " milliseconds");
  }


  /**
   * shuffleSortReverse - uses specifies random onject useful generate a list with identical sequences of
   * elements for the same original list, sort the list and also reverses the operation of the list but to the its original
   * @param list1 list of strings
   * @param list2 second list of strings
   *
   */

  public static void shuffleSortReverse(List<String> list1, List<String> list2){


    Collections.shuffle(list1, new Random(20));
    Collections.shuffle(list2, new Random(20));
    System.out.println("Shuffle list1: " + list1);
    System.out.println("Shuffle list2: " + list2);


    //Sort the list
    System.out.println(" ");
    Collections.sort(list1);
    Collections.sort(list2);
    System.out.println("Sort list1: " + list1);
    System.out.println("Sort list2: " + list2);



    //reverse the list
    System.out.println(" ");
    Collections.reverse(list1);
    Collections.reverse(list2);
    System.out.println("Reversed list1: " + list1);
    System.out.println("Reversed list2: " + list2);

  }

  /**
   * Search - search for the elements that need to be searched for
   * @param list1 lists of strings
   * @param list2 second lists of strings
   *
   */

  public static void search(List<String> list1, List<String> list2){

    System.out.println(" ");
    System.out.println("LIST_ONE" + list1);
    System.out.println("LIST_TWO" + list2);
    Collections.sort(list1);
    Collections.sort(list2);
    System.out.println(list1);
    System.out.println(list2);


    System.out.println(" ");
    System.out.println("Index of red : " + Collections.binarySearch(list1, "red"));
    System.out.println(list1.indexOf("red"));
    System.out.println("Index of blue: " + Collections.binarySearch(list2, "blue"));
    System.out.println(list2.indexOf("blue"));

  }
}
