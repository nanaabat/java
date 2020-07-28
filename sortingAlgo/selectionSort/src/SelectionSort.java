/**
 * Selection Sort - basics
 * @author: Nana Aba Turkson
 * @version: 27th July, 2020
 */

 public class SelectionSort{

   public static void main(String [] args){

     SelectionSort sort = new SelectionSort();
     int [] arr = {34,2,4,76, 4,0,2,75,45,34,23};
     System.out.println("Array: ");
     System.out.println(sort.toString(arr));
     System.out.println(" ");
     sort.selectionsort(arr);
     System.out.println("Sorted Array: ");
     System.out.println(sort.toString(arr));
     System.out.println(" ");


   }


   public void selectionsort(int arr[]){

     int length = arr.length;


     //loop through the arr
     for(int i = 0; i < length - 1; i ++){

       int minIndex = i; //index to track the minimum number

       //transversing through the array again
       for(int j = i + 1; j < length; j ++){

         //checking for the min number
         if( arr[j] < arr[minIndex]){

           minIndex = j; }

           //swaping occurs
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
         }
       }


     }

   


   public String toString(int [] arr){

     String str = "";

     for(int s: arr){
       str += s + " ";
     }

     return str;
   }



 }
