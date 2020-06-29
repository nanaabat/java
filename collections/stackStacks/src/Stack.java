public interface Stack<E>{

  /**
   * Returns the number of elements in the stacj
   * @return number of elements in the stack
   */
   int size();

   /**
    * Tests whether the stack empty
    * @return true if the stack is empty, false otherwise
    */
   boolean isEmpty();

    /**
     * Inserts an element at the top of the stack
     * @param e the element to be inserted
     */
    void push(E e);


     /**
      * Returns, but does not remove, the element at the top of the stack.
      * @return top element in the stack(or null if empty)
      */
     E top();

     /**
       * Returns and returns the element at the top of the stack.
       * @return top element in the stack(or null if empty)
       */
     E pop();
}
