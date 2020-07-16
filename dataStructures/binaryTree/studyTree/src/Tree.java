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



  public Node addRecursion(Node current, int value){

    if(current == null){
      return new Node(value);
    }

    if(value < current.key){
      current.left = addRecursion(current.left, value);
    }

    else if (value > current.key){
      current.right = addRecursion(current.right, value);
    }
    else{
        //value already exists
        return current;
    }
    return current;
  }


  public void add(int value){
    root = addRecursion(root, value);
  }





  //finding element
  private boolean containsNodeRecursive(Node current, int value){

    if(current == null){
      return false;
    }

    if(value == current.key){
      return true;
    }

    return value < current.key
      ? containsNodeRecursive(current.left, value)
      : containsNodeRecursive(current.right, value);
  }


  public boolean containsNode(int value){
    return containsNodeRecursive(root, value);
  }



  public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements(){

    BinaryTree bt = createBinaryTree();

    assertTrue(bt.containsNode(6));
    assertTrue(bt.containsNode(4));
    assertFalse(bt.containsNode(1));

    }



    //deleting an element
    private Node deleRecursive(Node current, int value){

      if(current == null){
        return null;
      }

      if(value = current.key){

      }

      if(value < current.value){
        current.left = deleteRecursive(current.left, value);
        return current;
      }

      current.right = deleteRecursive(current.right, value);
      return current;
    }

    
}
