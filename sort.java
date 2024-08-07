//https://leetcode.com/problems/missing-number/
//Cycle Sort
//268. Missing Number
//nums = [9,6,4,2,3,5,7,0,1]
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i<n){
            int correct = nums[i];
            if(nums[i]< n && nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return n;
    }
}

//442 find all the duplicate in array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i= 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        } 
        return ans;
    }
}

//645 set mismatch
//https://leetcode.com/problems/set-mismatch/
class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0; 
        while(i<nums.length){
            int c = nums[i]-1; 
            if(nums[c] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[] {nums[j], j+1};
            }
        }
        return new int[] {-1, -1};
    }
}

//41 First missing Positive
//https://leetcode.com/problems/first-missing-positive/
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c = nums[i] -1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[c]){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
