/**
 * ListNode.java - will be implemented by DoubleLinkedListNode
 *
 * @author Nana Aba Turkson
 * @version 18th June 2020
 */

 public class Node<T> implements ListNode<T>{

   public Node<T> previous;
   public Node<T> next;   //holds
   public T data;


   public Node(){}


   public Node(T data){
     this.data = data;
   }

   /**
    * Sets the data
    *
    * @param data data
    */

   public void setData(T data){
     this.data = data;
   }


   /**
    * Gets the data
    *
    * @return data
    */

    public T getData(){
      return data;
    }

    /**
     * Sets the next node
     *
     * @param node the nextNode
     */

     public void setNext(Node<T> next){
       this.next = next;
     }


     /**
      * Gets the next node
      *
      * @return next node
      */
      public Node<T> getNext (){
        return next;
      }


      /**
       * Sets the previous node
       *
       * @param node the previousNode
       */

       public void setPrevious(Node<T> previous){
         this.previous = previous;
       }


       /**
        * Gets the previous node
        *
        * @return previous node
        */

        public Node<T> getPrevious (){
          return previous;
        }


 }
