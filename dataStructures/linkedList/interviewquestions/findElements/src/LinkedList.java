/**
 * LinkedList - to find elements from nth to the last element
 * @author Nana Aba Turkson
 * @version 10th June, 2020
 */


 public class LinkedList{

   static Node head;


   //nested Node class
   public static class Node{

     int data; //data at the node
     Node next; //makes it possible to access the next element

     //constructor
     public Node(int data){
       this.data = data;
       next = null;
     }

   }


   public static int size(){

     Node temp = head;
     int size = 0;

     while(temp != null){
       size++;
       temp = temp.next;
     }

     return size;
   }


   public static void printList(Node head){

     while(head != null){
       System.out.print(head.data + " ");
       head = head.next;
     }
   }


   public static void main(String [] args){

     LinkedList list = new LinkedList();
     list.head = new Node(10);
     list.head.next = new Node(12);
     list.head.next.next = new Node(11);
     list.head.next.next.next = new Node(11);
     list.head.next.next.next.next = new Node(12);
     list.head.next.next.next.next.next = new Node(11);
     list.head.next.next.next.next.next.next = new Node(10);

     System.out.println(" ");
     System.out.println("List: ");
     list.printList(head);
     System.out.println(" ");
     System.out.println(" ");
     System.out.println("After finding elements: ");
     list.printList(list.findElement(head, 3));
    // System.out.println("\n");
     System.out.println(" ");
     System.out.println(" ");
     System.out.println("Another operation elements: ");
     list.printList(list.nthToLast(head, 3));
     System.out.println("\n");



     //nthToLast


   }


   public static Node findElement(Node head, int n){

     //if n is not within the range of the linkedlist
     if(n < 0 || n > size()){
       throw new IndexOutOfBoundsException();
     }

     int count = 0;
     Node temp = head;

     while(temp != null){

       if(count == n){
         return temp.next;
       }
       else{
         temp = temp.next;
         count++;
       }

     }
     return head;
   }



   public static Node nthToLast(Node head, int n) {

     if (head == null || n < 1) {
      return null;

    }

      Node p1 = head;
      Node p2 = head;
      for (int j = 0; j < n - 1; ++j) { // skip n-1 steps ahead
        if (p2 == null) {
          return null; // not found since list size < n
        }
          p2 = p2.next;
      }
      while (p2.next != null) {
         p1 = p1.next;
         p2 = p2.next;
       }
      return p1;
    }



 }
