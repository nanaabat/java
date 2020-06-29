/**
 * Design a Queue data Structure to get mininimum or maximum in 0(1) time
 * which also support enqueue, deque, getMin() or getMax() where getMin() operation takes 0(1)
 * @author Nana Aba Turkson
 * @version 26th June, 2020
 */


 public class theQueue{


   //fields
   int front; //front of the queue
   int rear; //back of the queue
   int size; //size of queue - this is to make sure that the queue is not full
   int capacity; //size of the queue
   int array[]; //array to store the items


   //Constructor: construct theQueue class
   public theQueue(int capacity){

     this.capacity = capacity;
     this.front = this.size = 0;
     rear = capacity - 1;
     array = new int [this.capacity];

   }


   /**
    * isFull(): checks if the queue is full
    * @return true/false
    */

   public boolean isFull(){

     return size == capacity;
   }



   /**
    * isEmpty(): checks if the queue is empty
    * @return true/false
    */

   public boolean isEmpty(){

      return size == 0;
   }


   /**
    * Enqueue() : adds an item to the queue
  //  * @param item data
    */
  // public void enqueue(int data){

      //adds to the last elemeent in the queue

      //when the queue is isEmpty
  //    if(isEmpty()){
  //      a[++front] = item;
  //    }
      //when the queue is full
      //when the queue has some members in the queue

  // }



   /**
    * Dequeue() : removes an item to the queue
    */
  // public void dequeue(){}


   /**
    * getMin(): returns the min number
    * @return minimum number
    */
//   public int getMin(){}


   /**
    * getMax(): returns the max number
    * @return maximum number
    */
  // public int getMax(){}


  //driver
  // public static void main(String [] args){

  // }




 }
