/**
 * Implement a simple stack and linkedlist problem
 * @author Nana Aba Turkson
 * @version 23th June, 2020
 */


import java.util.Stack;
import java.util.*;

public class StackDemo{

	public static void main(String [] args){

		Stack<String> stack = new Stack<String>();
		LinkedList<String> list = new LinkedList<String>();



		//adding elements the stack list
		stack.push("first");
		stack.push("second");
		stack.push("third");
		stack.push("fourth");
		stack.push("fifth");

		System.out.println(" ");
		System.out.println("Stack: " + stack);
		System.out.println(" ");


		//adding elements to the linkedList
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");

		System.out.println(" ");
		System.out.println("LinkedList: " + list);
		System.out.println(" ");



		Queue theQueues = new Queue();
		theQueues.enqueue("first");







	}



}
