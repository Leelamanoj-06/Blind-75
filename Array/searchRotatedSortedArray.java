package Array;

class Solution {
    public int search(int[] nums, int target) {
        //Initialize low to start of the array
        int l = 0;
        //Initialize high to end of the array
        int h = nums.length - 1;
        //Use binary search to search the target
        while(l<=h){
            //Find the mid
            int m = l + (h-l)/2;
            //if your mid is the target return the mid as it is going to be your target index
            if(nums[m] == target){
                return m;
            }
            //If low is less than or equal to mid 
            if(nums[l]<=nums[m]){
                //You're doing because your terminating reference for one part of array 
                //to not to be considered is target
                //If your target is greater than nums[l] and target is less than mid move high to mid-1
                if(nums[l]<=target && target<nums[m]){
                    //set your high to mid-1
                    h=m-1;
                }else{
                    //set your low to mid+1
                    l=m+1;
                }
            }else{
                //If your target is greater than nums[l] and target is less than mid move low to mid+1
                if(nums[m]<target && target<=nums[h]){
                    //set your low to mid+1
                    l=m+1;
                }else{
                    //set your high to mid-1
                    h=m-1;
                }
            }
        }
        //If your search element is not found return -1
        return -1;
    }
}

/*
Time Complexity = O(n)
Space Complexity = O(1) 
*/
