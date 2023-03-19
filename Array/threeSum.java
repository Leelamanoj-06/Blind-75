package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Initialize a result list of type list of lists as you're required to return all triplets that sum upto 0
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length - 1;
        //Sort the nums array before you start finding triplets
        Arrays.sort(nums);
        //loop through the nums array 
        for(int i=0;i<n-1;i++){
            if(i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n;
            int target = 0 - nums[i];
            while(j<k){
                if(nums[j]+nums[k]==target){
                    List<Integer> dummyList = Arrays.asList(nums[i],nums[j],nums[k]);
                    result.add(dummyList);
                    while(j<k && nums[j]==nums[j+1]){
                        j+=1;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k-=1;
                    }
                    j+=1;
                    k-=1;
                }else{
                    if(target < (nums[j]+nums[k])){
                        k-=1;
                    }else{
                        j+=1;
                    }
                }
            }
        }
        return result;
    }
}

/* Time Complexity = O(n^2)
Space Complexity = O(n)
*/
