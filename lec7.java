//Make a function to check if a given number n is even or not.
import java.util.*; 
class HelloWorld {
    public static void checkEvenNum(int a){
        if(a%2==0){
            System.out.println(a + " is even number");
        }else{
            System.out.println(a + " is NOT a even number");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       checkEvenNum(a);
    }
}



