// Tower Of Hanoi
class Recursion {
public static void towerOfHanoi(int n, String src, String helper, String dest){
    if(n==1){
        System.out.println("transfer "+n+ " from "+src+ " to "+dest );
        return;
    }
    towerOfHanoi(n-1,src,dest,helper);
    System.out.println("transfer "+n+ " from "+src+ " to "+dest );
    towerOfHanoi(n-1,helper,src, dest);
}
    public static void main(String[] args) {
    int n = 3;
    towerOfHanoi(n, "S","H","D");
    }
}

// Print a String in reverse
class Recursion {
    public static void func(String word, int idx){
        if(idx == 0){
            System.out.print(word.charAt(idx));
            return;
        }
         System.out.print(word.charAt(idx));
        func(word, idx-1);
    }
    public static void main(String[] args) {
    String word = "abcs";
    func(word, word.length()-1);
    }
}
