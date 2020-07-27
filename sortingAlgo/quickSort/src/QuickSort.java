/**
 * Quick sort - another way of sorting an algorithm
 * @author Nana Aba Turkson
 * @version 26th July, 2020
 */


import java.util.*;

 public class QuickSort{


   public static void main(String [] args){

     QuickSort sort = new QuickSort();

     int [] arr = {34,2,56,3,4,67,89,90,0,2};
     System.out.println(sort.toString(arr));
     System.out.println(" ");
     sort.quicksort(arr, 0, arr.length - 1);
     System.out.println(sort.toString(arr));



   }


   public String toString(int [] arr){

     String str = "";
     for(int s: arr){
       str += s + " ";
     }

     return str;
   }


   public void swap(int [] arr, int indexOne,int indexTwo){
     int temp = arr[indexOne];
     arr[indexOne] = arr[indexTwo];
     arr[indexTwo] = temp;
   }


   public void quicksort(int arr[], int low, int high){

     if(low < high){

       //partition the array
       int pivotPosition = partition(arr, low, high);

       //recursion
       quicksort(arr, low, pivotPosition - 1);
       quicksort(arr, pivotPosition+1, high);
     }
   }


   public int partition(int[] arr, int low, int high){

     //int pivot = arr[high];
     //Random Number
     Random rand = new Random();
     int random = rand.nextInt((high - low) + 1) + low;

     //swaqp the high with the Random
     swap(arr, random, high);


     //for loop to go through the element
     int j = low - 1;
     for(int i = low; i < high; i++){

       //if the element being compared to is lower then the pivot position then swap
       if(arr[i] < arr[high]){
         j++;
         swap(arr, j, i);

       }
     }

     swap(arr, j+1, high);

     return j + 1;
   }
 }
