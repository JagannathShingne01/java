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


