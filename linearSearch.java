//1) finding idx at
class HelloWorld {
     public static int leFun(int arr[], int target){
        for(int idx = 0;idx<arr.length;idx++){
            int element = arr[idx];
            if(element == target){
                return idx;
            }
        }
        return -1;
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,5,6,7};
        int target = 7;
        int tp = leFun(arr,target);
        System.out.println(target+"at inndx postion : "+tp);
    }
}

//2) search in String
class HelloWorld {
     public static boolean search(String str, char target){
        for(int idx = 0;idx<str.length();idx++){
            if(target == str.charAt(idx)){
                return true;
            }
        }
        return false;
     }
    public static void main(String[] args) {
        String str = "jagannath";
        char target = 'j';
        
        System.out.println(search(str,target));
    }
}

// min NUM in array
class HelloWorld {
     public static int leFun(int arr[]){
        int minNum = arr[0]; 
        for(int idx = 0;idx<arr.length;idx++){
            if(minNum>arr[idx]){
                minNum = arr[idx];
            }
        }
        System.out.println(minNum);
        return -1;
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,5,6,-7};
     
        int tp = leFun(arr);
       
    }
}
 //max NUM in 2D array
class HelloWorld {
     public static int leFun(int arr[][]){
        int maxNum = arr[0][0]; 
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(maxNum<arr[i][j]){
                maxNum = arr[i][j];
            }
            }
        }
        System.out.println(maxNum);
        return -1;
     }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,-1},{3,2,3,0,10}};
        int tp = leFun(arr);
       
    }
}
