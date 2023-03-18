/* The idea here is to keep track of current profits and previous profits
 * Initially you will set the result, previous maximum and current maximum at nums[0]
 * If you have only house you will only be able to rob one house and thats going to be your maximum profit
 * If you have more than one house you will update the result value to the max value of nums[0] and nums[1]
 * You're doing the above because you should either start from the very first house if it holds the maximum profit
 * Else you will start robbing from the second house if it holds the maximum profit
 * Based on the first house you're going to update previous maximum and current maximum
 * Your previous maximum will be your current maximum which is actually your first house as you're setting it initially 
 * Your current maximum will the max of your first house or second house
 * So, you now have your result, current maximum and previous maximum set
 * You're already done finding the maximum profit in first two houses
 * Now, we're starting to search for the maximum profit starting from the 3rd house 
 * So, you should loop through index 2 to length - 1
 * Everytime you loop through and search for houses you will update your result to the maximum profit
 * You're updating your maximum profit by adding the present house profit to the previous profit which 
 * will hold the maximum profit value until the last before house but the current as you've to rob alternate houses
 * You will now find the max of present house value + prev max and current max 
 * The above will give the maxmimum profit of all the houses thet were robbed until now
 * Update the prev max as your current profit and current profit to the result value as it will the maximum profit until now
 */

/* Time Complexity = O(n)
 * Space Complexity = O(1)
 */



class Solution {
    public int rob(int[] nums) {
        int prevMax = 0;
        int result = 0;
        int currMax = 0;
        if(nums.length >= 1){
            result = nums[0];
            prevMax = nums[0];
            currMax = nums[0];
        }
        if(nums.length > 1){
            result = Math.max(nums[0],nums[1]);
            if(result>currMax){
                prevMax = currMax;
                currMax = result;
            }
        }

        for(int i=2;i<nums.length;i++){
            result = Math.max(nums[i]+prevMax,currMax);
            prevMax = currMax;
            currMax = result;
        }

        return result;

    }
}