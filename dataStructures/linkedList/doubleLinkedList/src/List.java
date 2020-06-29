/**
 * List.java - an abstract class that will be implemented by the DoubleLinkedList
 * @author Nana Aba Turkson
 * @version 18th June, 2020
 *
 */

 public interface List<T>{

   public void add(T d);
   public void addIndex(T d, int index);
   public void addLast(T d);
   public T get(int index);
   public T deleteFirst(T d);
   public T deleteLast(T d);
   public T delete(int index);
   public int delete(T d);
   public boolean isEmpty();
   public int size();
   public void displayForward();
   public void displayBackwards();
   public String toString();

 }
