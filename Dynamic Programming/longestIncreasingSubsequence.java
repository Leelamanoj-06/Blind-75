import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        //Initialize n with length of nums
        int n = nums.length;
        //Initialize a dp array of size n to store the longest length at every ith position
        int [] dp = new int[n];
        //Initialize longest subsequence length as 1 initially
        int lsLength = 1;
        //Fill dp array with all 1's 
        Arrays.fill(dp,1);
        //Looping through n elements 
        for(int i=1;i<n;i++){
            //We will loop through 0 to i at every point of i
            for(int j=0;j<i;j++){
                //if nums[i]>nums[j] we will find the max of dp[j]+1,dp[i]
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                    //if dp[i] is greater than lsLength we will assign dp[i] to lsLength
                    if(dp[i]>lsLength){
                        lsLength = dp[i];
                    }
                }
            }
        }
        //returning lsLength will give us longest increasing subsequence length
        return lsLength;
    }
}
/*
Time Complexity = O(n^2)
Space Complexity = O(n)
*/