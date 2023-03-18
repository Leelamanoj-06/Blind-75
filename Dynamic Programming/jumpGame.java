/* To solve this problem initially you will set your pointer to the end of the given array
 * You will have to reach from the beginning of the array to the end of the array by taking nums[i] steps at each point of i
 * If you can reach the end of the array you've to return true
 * We're initializing the pointer to the last index of the array(but not the last element of the array)
 * Now we start looking from last but second index if we can reach the end of the array
 * So from every ith index we will check if we can reach our pointer
 * So every nums[i] will tell you how many steps can be taken from that index
 * So at every i you will check if we can reach p by adding i to the nums[i] which will give max possible steps that can be taken from i
 * If nums[i] is greater than p or equal to p means that you can reach your p or even reach a point beyond p if i+nums[i] is greater than p
 * You will assign i value to p if you meet the above condition
 * At last you will check if your p has reached the starting index which is 0
 * if it reaches you will return true else returns false where you cannot reach the starting index
 */

/* Time Complexity = O(n) 
 * Space Compleity = O(1)
*/




class Solution {
    public boolean canJump(int[] nums) {
        int p = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=p){
                p=i;
            }
        }
        return p==0;
    }
}