/**
 * LinkedList.java deletes duplicates appearing in a list
 *
 * @author Nana Aba Turkson
 * @version 9th June, 2020
 */

 import java.util.Hashtable;
 import java.util.*;
 //import java.util.LinkedList;


 public class LinkedList{

   static LinkedListNode head;

   public static class LinkedListNode{

     int data;
     LinkedListNode next;

     public LinkedListNode(int data){
       this.data = data;
       next = null;
     }
   }



   public static void deleteDup(LinkedListNode n){
     Hashtable table = new Hashtable();
     LinkedListNode previous = null;

     while(n != null){

       if(table.containsKey(n.data)){
         previous.next = n.next;
       }
       else{
         table.put(n.data, true);
         previous = n;
       }
       n = n.next;
     }
   }

   public static void printList(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


   public static void main(String [] args){

     LinkedListNode start = new LinkedListNode(10);
     start.next = new LinkedListNode(12);
     start.next.next = new LinkedListNode(11);
     start.next.next.next = new LinkedListNode(11);
     start.next.next.next.next = new LinkedListNode(12);
     start.next.next.next.next.next = new LinkedListNode(11);
     start.next.next.next.next.next.next = new LinkedListNode(10);

     System.out.println(" ");
     System.out.println("First List: ");
     printList(start);
     System.out.println(" ");
     deleteDup(start);
     System.out.println(" ");
     System.out.println("After deletion: ");
     printList(start);
     System.out.println("");




     LinkedList list = new LinkedList();
     list.head = new LinkedListNode(10);
     list.head.next = new LinkedListNode(12);
     list.head.next.next = new LinkedListNode(11);
     list.head.next.next.next = new LinkedListNode(11);
     list.head.next.next.next.next = new LinkedListNode(12);
     list.head.next.next.next.next.next = new LinkedListNode(11);
     list.head.next.next.next.next.next.next = new LinkedListNode(10);

     System.out.println(" ");
     System.out.println("Second List: ");
     list.printList(head);
     System.out.println(" ");
     list.removeDuplicates(head);
     System.out.println(" ");
     System.out.println("After deletion: ");
     list.printList(head);
     System.out.println("");




     LinkedList llist = new LinkedList();
     llist.head = new LinkedListNode(10);
     llist.head.next = new LinkedListNode(10);
     llist.head.next.next = new LinkedListNode(11);
     llist.head.next.next.next = new LinkedListNode(11);
     llist.head.next.next.next.next = new LinkedListNode(11);
     llist.head.next.next.next.next.next = new LinkedListNode(12);
     llist.head.next.next.next.next.next.next = new LinkedListNode(12);

     System.out.println(" ");
     System.out.println("Third List - Sorted List: ");
     list.printList(head);
     System.out.println(" ");
     //list.sort();
     llist.removeDup(head);
     System.out.println(" ");
     System.out.println("After deletion: ");
     llist.printList(head);
     System.out.println("");



     LinkedList lllist = new LinkedList();
     lllist.head = new LinkedListNode(10);
     lllist.head.next = new LinkedListNode(12);
     lllist.head.next.next = new LinkedListNode(11);
     lllist.head.next.next.next = new LinkedListNode(11);
     lllist.head.next.next.next.next = new LinkedListNode(12);
     lllist.head.next.next.next.next.next = new LinkedListNode(11);
     lllist.head.next.next.next.next.next.next = new LinkedListNode(10);

     System.out.println(" ");
     System.out.println("Fourth List: ");
     lllist.printList(head);
     System.out.println(" ");
     //list.sort();
     lllist.delDup(head);
     System.out.println(" ");
     System.out.println("After deletion: ");
     lllist.printList(head);
     System.out.println("");








   }


   public static void removeDuplicates(LinkedListNode start){

     //fields
     Hashtable table = new Hashtable();
     LinkedListNode previous = null;
     LinkedListNode temp = start;

     //looping through the linkedlist
     while(temp != null){

       //make decisions to elminate the duplicate figure
       if(table.containsKey(temp.data)){
         //change the next button
         previous.next = temp.next;
       }
       else{
         table.put(temp.data, true);
         previous = temp;


       }

       temp = temp.next;
     }
   }


   public static LinkedListNode removeDup(LinkedListNode head){

     //sort the List
     //Collections.sort(list);

       if(head == null){
         return null;
       }

       else{

         //LinkedListNode temp = head;


         //if temp's data is equal to next
         if(head.data == head.next.data){

           head.next = head.next.next;
           removeDup(head);
         }
         removeDuplicates(head.next);
       }

       return head;
     }


    public static LinkedListNode delDup(LinkedListNode head){


      //if head is null
      if(head == null){
        return null;
      }

      else{
        while(head != null){

          LinkedListNode temp = head.next;
          LinkedListNode previous = null;

          while(temp != null){
            if(head.data == temp.data){
              if(previous == null){
                  previous = head;
                 //head = temp.next;
                 }
                previous.next = temp.next;
                //temp = temp.next;
            }
            else{
            previous = temp;
            //temp = temp.next;
          }

          //go to the next element - to keep the loop from operating
          temp = temp.next;
          }

          head = head.next;
        }
      }
      return head;
    }


 }
