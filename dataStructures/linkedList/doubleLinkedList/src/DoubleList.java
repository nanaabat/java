/**
 * List.java - an abstract class that will be implemented by the DoubleLinkedList
 * @author Nana Aba Turkson
 * @version 18th June, 2020
 *
 */

 import java.util.*;

 public class DoubleList<T> implements List<T> {

   public Node<T> head;  //head of the LinkedList
   public Node<T> tail;  //tail of the LinkedList
   public int size; //track the size of the list


   /**
    * Constructs the DoubleList
    */

    public DoubleList(){
      this.head = null;
      this.tail = null;
      this.size = 0;
    }

    public DoubleList(T d){

      head = new Node<T>(d);
      tail = new Node<T>(d);
    }

   /**
    * Adds an element to the beginning of the list
    * @param d data
    */
    public void add(T d){
      //create a newwNode
      Node<T> newNode = new Node<T>(d);

      if(isEmpty()){    //list is empty
        tail = newNode;
      }
      else{
        head.setPrevious(newNode);
      }
      newNode.setNext(head);
      head = newNode;
      head.setData(newNode.getData());
      size ++;
    }

    /**
     * Checks if the list if empty or not
     *
     * @return true or false
     */

     public boolean isEmpty(){
      return head == null;
    }


    /**
     * Checks the size of the list
     *
     * @return size of the list
     */
     public int size (){
      return size;
    }


    public void addIndex(T d, int index){


      Node<T> newNode = new Node(d);
      int count = 1;

      if( index < 0 || index > size()){
        throw new IndexOutOfBoundsException();
      }

      if(index == 0){
        tail = newNode;
        newNode.setNext(head);
        head = newNode;
      }

      else{
          Node<T> temp = head.next;
          Node<T> prevNode = head;
          while(temp!= null || index == count ){

            if(count == index){
              newNode.setPrevious(temp.getPrevious());
              newNode.setNext(temp);
              temp.getPrevious().setNext(newNode);
              temp.setPrevious(newNode);
              temp = newNode;
              size++;
              break;
            }

            prevNode = prevNode.getNext();
            temp = temp.getNext();
            count++;


          if(prevNode.getNext() == null  && count == index ){

            newNode.setPrevious(prevNode);
            prevNode.setNext(newNode);
            tail = newNode;
            size++;
            break;
          }
        }
        }
      }

    public void addLast(T d){

      Node<T> newNode = new Node(d);

      if(isEmpty()){
        head = newNode;
      }
      else{
        newNode.setPrevious(tail);
      }
      tail.setNext(newNode);
      tail = newNode;
      //tail = newNode;
    }


    public T get(int index){

      T result = null;

      if(index < 0 || index > size()){
        throw new IndexOutOfBoundsException();
      }

      else{

        Node<T> temp = head;
        int count = 0;

        while(temp != null || index == count){

          if(index  == count){
            result = temp.getData();
            return result;
          }

          temp = temp.getNext();
          count ++;
        }

      }
      return result;
    }

    public T deleteFirst(T d){
      return null;
    }
    public T deleteLast(T d){
      return null;
    }

    public T delete(int index){
      return null;
    }
    public int delete(T d){
      return 0;
    }

    public void displayForward(){

      if(isEmpty()){
        return ;
      }
      else{
        Node<T> temp = head;
        while(temp != null){
          System.out.print(temp.getData() + " -> ");
          temp = temp.getNext();
        }
      }

    }

    public void displayBackwards(){

      if(isEmpty()){
        return ;
      }

      else{
        Node<T> temp = tail;
        while(temp != null){
          System.out.println("<-" + temp.getData() + " ");
          temp = temp.getPrevious();
        }
      }

    }

    public String toString(){

         String str = "";

         if(head != null){
             Node<T> temp = head;
             while(temp.getNext() != null){
                 str = str + temp.getData().toString() + "->";
                 temp = temp.getNext();

             }
             str = str + temp.getData().toString();
         }

         return str;

     }




    public void add(T d, int index){

    }

    public static void main(String [] args){

      DoubleList<Integer> list = new DoubleList();

      System.out.println(" ");

      list.add(5);
      list.add(6);
      list.add(8);

      System.out.println("Initial List: " + list);
      System.out.println(" ");

      list.addIndex(7, 3);
      list.addIndex(8, 4);
      list.addIndex(4, 0);
      list.add(2);

      System.out.println("Final List after AddAtIndex: " + list);
      System.out.println("\n");

      list.addLast(9);

      System.out.println("Final List: " + list);
      System.out.println("\n");


      System.out.println("Element: " + list.get(1));
      System.out.println("\n");

      list.addLast(10);

      System.out.println("Final List: " + list);
      System.out.println("\n");
    }


//got some work to be done - just elminating elements that I do not want to elminate


 }
