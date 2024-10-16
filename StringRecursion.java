public class StringRecursion {
    public static void main(String[] args) {
        System.out.println(skipApple( "abbapplecab"));
    }

  // skip char using in argument
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char CH = up.charAt(0);

        if(CH == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p + CH, up.substring(1));
        }
    }

  // skip char using body of function
    static String skipBody(String up){
        if(up.isEmpty()){
           return " ";
        }
        char CH = up.charAt(0);
        if(CH == 'a'){
            return skipBody(up.substring(1));
        }else{
            return CH + skipBody( up.substring(1));
        }
    }

// skip string
    static String skipApple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple( up.substring(1));
        }
    }
}
