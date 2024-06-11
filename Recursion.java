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

//Find The First And Last occurance of element in String.
class Recursion {
    public static int first = -1; // constat at every level of recursion
    public static int last = -1;
    
    public static void func(int idx, String src, char element){
        if(src.length() == idx){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = src.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last=idx;
            }
        }
        func(idx+1, src, element);
    }
    public static void main(String[] args) {
        String src = "ashhaajjsansoa";
       func(0, src ,'a');
    }
}
