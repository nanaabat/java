/**
 * @author Nana Aba Turkson
 * @version July, 12, 2020
 */

//this worst time complexity : n^2
// average complexity: n^2
// best complexity: n
// space complexity: 1

public class bubble{

  public static void main(String [] args){

    bubble sort = new bubble();

    int [] arr = {4,5,2,5,3,9,1};
    int [] rur = {9,2,0,1,2,3,4,7,8,0};

    System.out.println(sort.toString(arr) + "\n");
    sort.bubbleort(arr);
    System.out.println(sort.toString(arr));

    System.out.println(sort.toString(rur) + "\n");
    sort.bubbleort(rur);
    System.out.println(sort.toString(rur));

  }

  public String toString(int [] arr){
    String str = "";

    for(int s: arr){
      str += s +  " ";
    }

    return str;
  }


  public void bubbleSort(int [] arr){

    int size = arr.length;

    for(int i = 0; i < size ; i ++){
      for(int j = i+1; j < size; j ++){

        if(arr[j] < arr[i]){

          int temp;
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }

      }
    }
  }



  public void bubbleort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
