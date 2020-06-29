/**
 * Trying some stack implementation whiles learning
 * @author: Nana Aba Turkson
 * @version June, 28, 2020
 */

 import java.util.*;

 public class LinkedStack<E> implements Stack<E> {

   //fields
   private LinkedList<E> list = new LinkedList<>();

   //constructor
   public LinkedStack(){}

   public int size(){
     return list.size();
   }


   public boolean isEmpty(){
     return list.isEmpty();
   }

   public void push(E element){
     list.addFirst(element);
   }

   public E top(){
     return list.getFirst();
   }

   public E pop(){
     return list.removeFirst();
   }

 }
