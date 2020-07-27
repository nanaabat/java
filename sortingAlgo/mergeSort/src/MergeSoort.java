/**
 * Some basic merge sort shit
 * @author  Nana Aba Turkson
 * @version 26th July, 2020
 */

 public class MergeSoort{

   public static void main(String[]args){

     MergeSoort sort = new MergeSoort();
     int [] arr = {34,56,23,56,3,45,90,0,23,56,46};
     System.out.println(sort.toString(arr));
     sort.mergesort(arr,arr.length);
     System.out.println(" ");
     System.out.println(sort.toString(arr));
     System.out.println(" ");


   }


   public String toString (int [] arr){

     String str = "";

     for(int s: arr){
       str += s + " ";
     }

     return str;
   }


   public void mergesort(int [] arr, int len){

     //base case
     if(len < 2){

       return ;

     }
     //find the middle ground
     int mid = (len)/2;


     //setting arrays
     int [] leftarr = new int[mid];
     int [] rightarr = new int[len - mid];


     //diving the array into the left and right array
     int k = 0;
     for(int i = 0; i < arr.length; i++){
       if(i < mid){
         leftarr[i] = arr[i];
         System.out.println("Left Shit shit");
         System.out.println(toString(leftarr));
         System.out.println(" ");

       }

       else{
       rightarr[k] = arr[i];
       k++;
       System.out.println("Right Shit shit");
       System.out.println(toString(rightarr));
       System.out.println(" ");}

     }
     mergesort(leftarr, mid);
     mergesort(rightarr, len - mid);
     merge(leftarr, rightarr, arr, mid, len-mid);

   }


   public void merge(int[] leftarr, int [] rightarr, int [] arr, int leftsize, int rightsize){

     //some indeces;
     int l = 0, r = 0, i = 0;


     System.out.println(" ");
     System.out.println("\nLeft Shit");
     System.out.println(toString(leftarr));
     System.out.println("\nRight Shit");
     System.out.println(toString(rightarr));
     System.out.println("\nArr Shit");
     System.out.println(toString(arr));
    // System.out.println("Middle" + mid);

    while(l < leftsize && r < rightsize){

      if(leftarr[l] < rightarr[r]){
          arr[i++] = leftarr[l++];
      }else{
      arr[i++] = rightarr[r++];}
    }


    while(l < leftsize){
      arr[i++] = leftarr[l++];
    }

    while(r < rightsize){
      arr[i++] = rightarr[r++];
    }
  }

 }
