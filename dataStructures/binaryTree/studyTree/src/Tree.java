/**
 * Tree.java
 * @author  Nana Aba Turkson
 * @version 5th July, 2020
 */




public class Tree{

  Node root;


  public static class Node{

    int key;
    Node left, right;

    public Node(int key){
      this.left = this.right = null;
      this.key = key;

    }
  }



  //constrcutor
  public Tree(int item){
    root = new Node(item);
  }

  //parameterless constructor
  public Tree(){
    root = null;
  }




  //the driver
  public static void main(String [] args){

    Tree tree = new Tree();

    //root
    tree.root = new Node(1);


    //children
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);


    //children of children
    tree.root.left.left = new Node(4);
  }
}
