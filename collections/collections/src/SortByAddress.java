import java.util.*;
import java.lang.*;
import java.io.*;


public class SortByAddress implements Comparator<Student>{


  public int compare(Student a, Student b){
    return a.address.compareTo(b.address);
  }

}
