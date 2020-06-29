import java.util.*;

public class test{


  public static void main(String [] args){

  int [] arr = new int[3];
  int [] err = new int[3];

  int t = 0;
  arr[++t] = 6;
  arr[++t] = 7;
  for (int i : arr){
    System.out.print(i + " ");
  }

  System.out.println(" ");

  int i = 0;
  err[i++] = 8;
  err[i++] = 9;
  for (int u : err){
    System.out.print(u + " ");
  }
  System.out.println(" ");






  }
}
