import java.util.*;
import java.lang.*;
import java.io.*;


public class Main{

  public static void main(String [] args){

    ArrayList<Student> studentList = new ArrayList<Student>();
    studentList.add(new Student(111, "bbb", "london"));
    studentList.add(new Student(131, "aaa", "nyc"));
    studentList.add(new Student(121, "ccc", "jaipur"));


    System.out.println("Unsorted");
    for(int i = 0; i < studentList.size(); i ++){
      System.out.println(studentList.get(i));
    }

    Collections.sort(studentList, new SortByRoll());


    System.out.println("\nSorted by rollno ");
    for(int i = 0; i < studentList.size(); i ++){
      System.out.println(studentList.get(i));
    }


    Collections.sort(studentList, new SortByName());

    System.out.println("\nSorted by name");
    for(int i = 0; i < studentList.size(); i++){
      System.out.println(studentList.get(i));
    }

    Collections.sort(studentList,new SortByAddress());

    System.out.println("\nSorted by address");
    for(int i=0; i < studentList.size(); i++){
      System.out.println(studentList.get(i));
    }


    System.out.println("\n");
    char like = 65;
    char you = 66;
    float ji = 3.45f;
    double ui = 3.45d;
    System.out.println(like);
    System.out.println(" ");
    System.out.println(you);
    System.out.println(" ");
    System.out.println(ji);
    System.out.println(" ");
    System.out.println(ui);




  }
}
