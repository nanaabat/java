/**
 * Some stuffs
 * @author Nana Aba Turkson
 * @version 28th June 2020
 */

 public class Test{

   public static boolean isMatched(String expression){
     final String opening = "({[";
     final String closing = ")}]";
     Stack < Character> buffer = new LinkedStack<>();
     for (char c : expression.toCharArray()){

       if(opening.indexOf(c) != -1)
          buffer.push(c);
        else if(closing.indexOf(c) != -1){
          if(buffer.isEmpty())
              return false;
          if(closing.indexOf(c) != opening.indexOf(buffer.pop()))
              return false;
        }
     }
     return buffer.isEmpty();
   }


   public static boolean isHTMLMatched(String html){

     Stack<String> buffer = new LinkedStack<>();

     int j = html.indexOf("<");   //the index of <
     while(j != -1){
       int k = html.indexOf(">", j+1);  //if j is not equal to -1, then find > after the index of j+1
       if(k == -1){  //if there is no >, return false;
         return false;
       }   //if there is a >, then
       String tag = html.substring(j+1, k);  //get the string between j+1(after j = <) and k

       if(!tag.startsWith("/"))  //if the string starts with /
          buffer.push(tag);     //push the tag
       else{
          if(buffer.isEmpty())
            return false;
          if(!tag.substring(1).equals(buffer.pop())) //not equals
            return false;
       }
       j = html.indexOf('<', k+1);
     }
     return buffer.isEmpty();
   }


   public static void main(String [] args){

     System.out.println("True/False: " + isHTMLMatched("<body></body"));
     System.out.println("True/False: " + isHTMLMatched("<body></body>"));
     System.out.println("True/False: " + isHTMLMatched("<></>"));
   }

 }
