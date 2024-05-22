
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        System.out.println("Enter Any Opration (-,+,*,/)");
        char opt = sc.next().charAt(0);
        double minus = a - b;
        double plus = a + b;
        double multiy = a * b;
        double divide = a / b;
        switch (opt) {
            case '-': {

                System.out.println(minus);
                break;
            }
            case '+': {

                System.out.println(plus);
                break;

            }
            case '*': {

                System.out.println(multiy);
                break;

            }
            case '/': {

                System.out.println(divide);
                break;

            }
            default: {
                System.out.println("kuch nahi hua");
            }
        }

    }
}
