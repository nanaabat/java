/**
 * Implement a basic stack class using arrays
 * @author: Nana Aba Turkson
 * @version: 22th June, 2020
 */

import java.util.*;

public class Stack{

	//fields
	static final int MAX = 6;
	int top;
	int a[] = new int [MAX]; //because we are using the array, the size of the array has to be fixed.

	//constructor
	public Stack(){}


	/**
	 * Checks if the list is empty
	 */
	public boolean isEmpty(){
		return (top < 0);
	}



	/**
	 * Adds an element to the stack
	 * @param element element
	 */
	public boolean push(int element){

		if(top >= (MAX - 1)){
			return false;
		}

		else{
			a[++top] = element;
			System.out.println(element + " pushed into stack");
			return true;
		}

	}

	/**
	 * Removes an element from the stack
	 */
	public  int pop(){

		if(top < 0){
			return 0;
		}
		else{
			return a[top --];
		}


	}

	public String toString(){

		String str = "";

		for (int s: a){

			str = str  + s + " ";
		}

		return str;
	}

	 /**
	  * Returns element at the top of the stack
	  */

	public int peek(){

		if(top < 0){
			return 0;
		}
		else{
			//System.out.println("Element at the top:");
			int x = a[top];
			return x;
		}
	}

	//main driver code
	public static void main( String [] args){

		Stack stack = new Stack();

		//add elements
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println(" ");
		System.out.println("Initial List: \n" + stack);
		System.out.println(" ");
		System.out.println("Element to be removed: \n"+ stack.pop());
		System.out.println(" ");
		System.out.println("Element at the top: \n" + stack.peek());

	}

}
