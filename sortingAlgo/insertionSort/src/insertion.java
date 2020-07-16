/**
 * Insertion Sort
 * @author  Nana Aba Turkson
 * @version 12th July, 2020
 */



 public class insertion{


   public static void main(String [] args){

     insertion sort = new insertion();


     int [] arr = {4,5,2,5,3,9,1};

     System.out.println(sort.toString(arr) + "\n");
     sort.insertionSort(arr);
     System.out.println(sort.toString(arr));


   }

   public String toString(int [] arr){
     String str = "";

     for(int s: arr){
       str += s +  " ";
     }

     return str;
   }

   public void insertionSort(int [] arr){


        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
   }
 }
