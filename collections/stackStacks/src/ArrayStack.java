/**
 * Some stack using Arrays
 * @author Nana Aba Turkson/
 * @version June,28 2020
 */


 public class ArrayStack<E> implements Stack<E> {

   //fields
   public static final int CAPAPCITY = 1000;      //default array capacity
   public E[] data;        //gemeric array used for storage
   private int t = -1;            //index of the top element in stack

   //constructor
   public ArrayStack(){                    //construct stack with given capacity
     this(CAPAPCITY);
   }

   public ArrayStack(int capacity){      //construct stack with given capacity
    // this.data = new E[capacity];  //safe case; compiler may give a warning
   }


   public int size(){
     return (t + 1);
   }


   public boolean isEmpty(){
     return (t == 1);
   }

   public void push(E e) throws IllegalStateException{

     if(size() == data.length) throw new IllegalStateException("Stack is full");
     data[++t] = e;
   }


   public E top(){
     if(isEmpty()) return null;
     return data[t];
   }


   public E pop(){
     if(isEmpty()) return null;
     E answer = data[t];
     data[t] = null;
     t --;
     return answer;
   }
 }
