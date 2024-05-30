//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Size:");
      int size = sc.nextInt();
      
      String arrayString[] = new String[size]; 
      int totalLength=0;
      for(int i=0;i<size;i++){
          arrayString[i] = sc.next();
          totalLength += arrayString[i].length();
      }
     System.out.println(totalLength);
    }
}

// input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("String:");
      String name = sc.next();
       String result = "";
      for(int i=0;i<name.length();i++){
          if(name.charAt(i) == 'e'){
              result += "i";
          }else{
              result += name.charAt(i);
          }
      }
      System.out.println(result);
   
    }
}
