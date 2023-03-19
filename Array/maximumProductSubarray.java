package Array;

class Solution {
    public int maxProduct(int[] nums) {
        //Initialize global max as -10 as your least possible input is -10
        int globalMax = -10;
        //Initialize currentMin and currentMax as 1
        int currentMin = 1;
        int currentMax = 1;
        //Iterating through the input you will compute the currentMin, currentMax, globalMax as follows
        for(int i=0;i<nums.length;i++){
            //Storing currentMax and currentMin in temp because currentMin value will 
            //Change before we compute currentMax
            int temp1 = currentMax;
            int temp2 = currentMin;
            //Calculating currMin, currMax and globalMax
            //Input Array            2                 3                    -2                       4   
            //currMin = 1     MIN(2,2,2) = 2     MIN(3,6,6) = 3     MIN(-2,-6,-12) = -12      MIN(4,-48,-8) = -48
            //currMax = 1.    MAX(2,2,2) = 2     MAX(3,6,6) = 6     MAX(-2,-6,-12) = -2       MAX(4,-48,-8) = 4
            //globalMax=-10   MAX(-10,2) = 2     MAX(2,6) = 6       MAX(-2,6) = 6             MAX(4,6) = 6
            //Computing currentMin by finding the minimum of your nums[i], currentMin*nums[i] and currentMax*nums[i]
            currentMin = Math.min(nums[i],Math.min(temp2*nums[i],temp1*nums[i]));
            //Computing currentMax by finding the maximum of your nums[i], currentMin*nums[i] and currentMax*nums[i]
            currentMax = Math.max(nums[i],Math.max(temp2*nums[i],temp1*nums[i]));
            //If your currentMax is greater than globalMax assign currentMax to your global max
            globalMax = Math.max(globalMax,currentMax);
        }
        //returning globalMax will give us the maximum product
        return globalMax;
    }
}
/*
Time Complexity = O(n)
Space Complexity = O(1)
*/
