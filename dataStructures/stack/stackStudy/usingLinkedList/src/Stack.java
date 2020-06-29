/**
 * Implement a basic stack class using linked list
 * @author Nana Aba Turkson
 * @version 22 June, 2020
 */



public class Stack{

	StackNode root;

	public Stack(){}


	class StackNode{
		int data;
		StackNode next;


		public StackNode(int data){
			this.data = data;
			this.next = null;
		}

	}


	public boolean isEmpty(){
		return root == null;
	}

	public int pop()
	{
		int popped = Integer.MIN_VALUE;

		if(isEmpty()){
			System.out.println( "Stack is Empty");
		}
		else{
			popped = root.data;
			root = root.next;
		}
		return popped;
	}

	public int peek(){
		if(isEmpty()){
			System.out.println( "Stack is Empty");
			return Integer.MIN_VALUE;
		}
		else{
			return root.data;
		}
	}


	public String toString(){

		String str = "";
		StackNode temp = root;

		while(temp != null){
			str = str + temp.data;
			pop();
			temp = root;
		}
		return str;
	}


	void  push(int element){

		StackNode newNode = new StackNode(element);

		if(isEmpty()){
			root = newNode;
		}

		else{
			StackNode temp = root;
			root = newNode;
			temp.next = newNode;
		}
			System.out.println(element + " pushed to stack");
		}


		public static void main(String [] args){
			Stack stack = new Stack();

			stack.push(1);
			stack.push(2);
			stack.push(3);

			System.out.println(stack.pop());
			System.out.println(stack.peek());

			System.out.println("List: " + stack);

		}

	}
