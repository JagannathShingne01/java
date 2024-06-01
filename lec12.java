//1)Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
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

//2) input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
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
// same question using String Builder method lec-13
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String js = sc.next();
       StringBuilder sb = new StringBuilder(js);
       for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)=='e'){
               sb.setCharAt(i, 'i');
           }
       }
       System.out.println(sb);
       
    }
}


// 3)Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Email:");
      String email = sc.next();
       String username = "";
      for(int i=0;i<email.length();i++){
          if(email.charAt(i) == '@'){
            break;
          }else{
              username += email.charAt(i);
          }
      }
      System.out.println("Username is: "+username);
   
    }
}
// same question using String Builder method lec-13
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String email = sc.next();
       StringBuilder sb = new StringBuilder(email);
       for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)=='@'){
               sb.delete(i, sb.length());
           }
       }
       System.out.println(sb);
       
    }
}
