package Array;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Initialize a hashset to store all the nums elements
        HashSet <Integer> set = new HashSet<>();
        //Loop through nums to check if the element is already present in the hashset
        //If the element is not present in hashset insert the element into hashset
        //If the element is already present in the hashset it means that you've a duplicate
        for(int i=0; i<nums.length; i++){
            //checking if element is already present in hashet
            if(set.contains(nums[i])){
                //returning true as the hashset contains a duplicate
                return true;
            }
            //Adding element into hashset as it is not present in the hashset
            set.add(nums[i]);
        }
        //returning false since no duplicate is caught in any of the above steps
        return false;
    }
}

/*
Time Complexity = O(n);
Space Complexty = O(1);
*/