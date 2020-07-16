import java.util.*;
import java.lang.*;
import java.io.*;


public class SortByRoll implements Comparator<Student>{

    //Used for sorting n ascending order of roll number
    public int compare(Student a, Student b){
      return a.rollno - b.rollno;
    }




}
