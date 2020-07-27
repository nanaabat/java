import java.util.*;


public class mergessort{

  public static void main(String[] args) {

    mergessort sort = new mergessort();

    int [] arr = {38, 27, 43, 3, 9, 82, 10};
    mergesort(arr, arr.length);

  }

  public String toString(int [] arr){
    String str = "";

    for(int s: arr){
      str += s +  " ";
    }

    return str;
  }


  public static void mergesort(int[] arr, int len){

    if(len < 2){
      return;
    }

    int mid = len/2;
    int [] leftarr = new int[mid];
    int [] rightarr = new int[len - mid];

    int k = 0;
    for(int i = 0; i < arr.length ; i ++){
      if(i < mid){
        leftarr[i] = arr[i];
      }
      else{
        rightarr[k] = arr[i];
        k++;
      }
    }

    for(int s: leftarr){
      System.out.print(s + " ");
    }

    System.out.print("\n");

    for(int t: rightarr){
      System.out.print(t + " ");
    }


  }

}
