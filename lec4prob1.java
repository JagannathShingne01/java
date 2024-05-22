
//Print all even numbers till n.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number");
    int a = sc.nextInt();
    int b;
    for(int i = 0; i<a; i++){
        if(i%2==0){
            System.out.println(i);
        }
    }
    }
}