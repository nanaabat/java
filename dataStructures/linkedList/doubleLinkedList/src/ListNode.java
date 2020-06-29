/**
 * ListNode.java - will be implemented by DoubleLinkedListNode
 *
 * @author Nana Aba Turkson
 * @version 18th June 2020
 */

 public interface ListNode<T>{

   //setters
   public void setData(T d);

   public void setPrevious (Node<T> n);

   public void setNext(Node<T> n);

   //getters
   public T getData();

   public ListNode<T> getPrevious ();

   public ListNode<T> getNext ();



 }
