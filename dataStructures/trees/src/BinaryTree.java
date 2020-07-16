/**
 *
 * @author Nana Aba Turkson
 * @version 11 July, 2020
 */


 public class BinaryTree{

   Node root;

   public void add(int key, String name){

     Node newNode = new Node(key, name);

     if(root == null){

       root = newNode;
     }

     else{

       Node temp = root;
       Node parent;

       while(true){

          parent = temp;

         if(key < temp.leftChild){


           temp = temp.leftChild

           if(temp == null){

             parent.leftchild = newNode;
           }


         }
         else{

           temp = temp.rightChild;

           if(temp == null){
             parent.rightChild = newNode;
           }


         }




       }
     }


   }


   public void inOrderTransverse(Node temp){

     if(temp != null){

       inOrderTransverse(temp.leftChild);
       System.out.println(temp);
       inOrderTransverse(temp.rightChild);
     }
   }


   public void preOrderTransverse(Node temp){

     if(temp != null){

       System.out.println(temp);
       preOrderTransverse(temp.leftChild);
       preOrderTransverse(temp.rightChild);
     }
   }



   public void postOrderTransverse(Node temp){

        if(temp != null){

          System.out.println(temp);
          postOrderTransverse(temp.leftChild);
          postOrderTransverse(temp.rightChild);
        }
      }



  public int height(Node root){


    if(root == null){
      return 0;
    }

    int lHeight = height(root.leftChild);
    int rHeight = height(root.rightChild);


    if(lHeight > rHeight) return(lHeight+1);
    else{
      return(rHeight+1);
    }
  }



  public void printGivenLevel(Node root, int level){

    if(root == null){
      return;
    }
    if(level == 1){
      System.out.print(root.key + " ");
    }
    else if(level > 1 ){
      printGivenLevel(root.left, level-1);
      printGivenLevel(root.right, level-1);
    }
  }

  public void printLevelOrder(){

    int h = height(root);
    int i;

    for(i = 1; i <= h; i++){

    }
  }


   public static void main(String [] args){

   }


   class Node{
     int key;  //data
     String name;
     Node leftChild;  //leftchild = null
     Node rightChild;  //rightchild = null


     //constructor
     Node(int key, String name){
       this.key = key;
       this.name = name;
     }


     public String toString(){
       return name + " has a key " + key;
     }






   }
 }
