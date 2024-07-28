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
