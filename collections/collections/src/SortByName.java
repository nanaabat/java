import java.util.*;
import java.lang.*;
import java.io.*;

public class SortByName implements Comparator<Student>{

  public int compare(Student a , Student b){

    return a.name.compareTo(b.name);
  }
}
