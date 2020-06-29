/**
 * DoubleLinkedList - some basic implementations of the DoubleLinkedList
 *
 * @author Nana Aba Turkson
 * @version 18th June 2018
 */


 import java.util.*;


 public class DoubleLinkedList{

   //
   Node head;
   Node tail;
   int size;



    /**
     * Create a Node class
     */
     public class Node{

      Node next;
      Node previous;
      int data;

      //Node constructor
      public Node(int d){
        this.data = data;
        this.next = null;
        this.previous = null;
      }
    }


    //DoubleLinkedList constructor
    public DoubleLinkedList(){

      this.head = null;
      this.tail = null;
      this.size = 0;

    }



    /**
     * Adds data to the List
     * @param data data
     */

     public void add(int data){

       Node newNode = new Node(data);

       if(isEmpty()){
         tail = newNode;
       }
       else{
         head.previous = newNode;
       }

       newNode.next = head;
       head = newNode;
       size ++;

     }


     public void addAtIndex(int data, int index){
       Node newNode = new Node(data);

       if(index == 0){
         add(data);
       }

       else{

         Node temp = head.next;
         Node prevNode = temp;
         int count = 1;

         while(temp != null || index == count){

           if(index == count){

             newNode.next = temp;
             newNode.previous = temp.previous;
             temp.previous.next = newNode;
             temp.previous = newNode;
             temp = newNode;
             size ++;
             break;
           }

           prevNode = prevNode.next;
           temp = temp.next;
           count++;

           if(prevNode.next == null && count == index){

             newNode.previous = prevNode;
             prevNode.next = newNode;
             tail = newNode;
             size++;
             break;
           }
         }
       }
     }


     /**
      * Check if the element is isEmpty
      * @return true/false
      */
      public boolean isEmpty(){
        return head == null;
      }


      /**
       * Checks the size of the List
       */
       public int size(){
         return size;
       }

       /**
        * Displays the data in the list in ascending order
        */
       public void displayForward(){

         if(isEmpty()){
           return ;
         }

         Node temp = head;
         while(temp != null){
           System.out.print(temp.data + " ->");
           temp = temp.next;
         }
        }

        /**
         * Displays the data in the list in descending order
         */
        public void displayBackwards(){

          if(!isEmpty()){
            Node temp = tail;
            while(temp != null){
              System.out.print("<- " + temp.data + " ");
              temp = temp.previous;
            }
          }
         }

         /**
          * Displays the data in the list in ascending order
          */
        public String toString(){
           String str = "";

           if(!isEmpty()){
             Node temp = head;
             while(temp.next!= null ){
               str = str + temp.data + " -> ";
               temp = temp.next;
            }
            str = str + temp.data;
          }
          return str;
        }

        public void addLast(int data){
          Node newNode = new Node(data);

          if(isEmpty()){
            head = newNode;
          }
          else{
            newNode.previous = tail;
          }

          tail.next = newNode;
          tail = newNode;
        }



        public static void main(String [] args){

          DoubleLinkedList list = new DoubleLinkedList();
          list.add(2);
          list.add(4);

          System.out.println("Intial List: ");
          System.out.println(list);
          System.out.println(" ");
          System.out.println("Display Forward: ");
          list.displayForward();
          System.out.println("\n");
          System.out.println("Display Backward");
          list.displayBackwards();
          System.out.println("\n");

          list.addAtIndex(3,1);
          System.out.println("Index Insertion List: ");
          System.out.println(list);
          System.out.println("\n");


          list.addLast(10);
          System.out.println("Index Insertion List: ");
          System.out.println(list);
          System.out.println("\n");

        }



//Got some work to be done
//Given me zero














 }
