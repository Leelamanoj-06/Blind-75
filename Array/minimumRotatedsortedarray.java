package Array;

class Solution {
    public int findMin(int[] nums) {
        //Initialize your low to start of the array
        int l = 0;
        //Initialize your hight to the end of the array
        int h = nums.length-1;
        //If your array is sorted and rotated n times it will give you original array
        //First element in a regualar sorted is always smaller than the last element 
        //and it is the minimum of all the elements in the array
        //You can directly return the first element in this case as it will be the smallest
        if(nums[l]<=nums[h]){
            //Returning nums[l] as it the smallest of all the elements
            return nums[l];
        }
        //Looping through the elements to find the dip in the rotated sorted array
        //Element at the point of the dip is going to be the minimum of all the rotated sorted array
        //We search for the dip using binary search
        //Mid is going to give us the dip element which is going to be 
        //the minimum element of all in the array
        //Binary Search
        while(l<=h){
            //Finding the mid
            int mid = (l+(h-l)/2);
            //if nums[mid] is greater than nums[mid+1] 
            //it means that your current mid is greater than (mid+1)th element which means you've found dip
            //The following condition will be satisfied only at the point where the dip is found
            if(nums[mid]>nums[mid+1]){
                //If found we will return the (mid+1)th element
                return nums[mid+1];
            }
            //Removing the left side of nums as all the elements are lower than the mid
            if(nums[l]<=nums[mid]){
                //Moving low to mid+1
                l = mid+1;
            //Removing the right side of the nums as all the elements are higher than the mid
            }else{
                //Moving high to mid-1
                h = mid-1;
            }
        }
        return 0;
    }
}

/*
Time Complexity = O(n)
Space Complexity = O(1)
*/
