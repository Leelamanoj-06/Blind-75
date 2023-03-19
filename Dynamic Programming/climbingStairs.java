class Solution {
    public int climbStairs(int n) {
        //If there are one or two steps we can climb 1 step only in one way and 2 steps only in two ways
        //So, we're returning n in these cases
        if (n <= 2){
            return n;
        } 
        //Initialize one to 1 and two to 2
        int one = 1, two = 2;
        //Loop through 2 as we took care of first two cases
        //Update temp, one, two through out the loop
        //temp contains all the possible ways to reach the nth step @ 1 step at time
        //one contains all the possible ways to reach the nth step @ 2 steps at time
        //So, your two contains the sum of one and two step possibilities at every nth step as you loop through  
        for(int i = 2; i < n; i ++) {
            int temp = one; 
            one = two; 
            two = temp + two;
        }
        //Returning two returns all the possibile ways to reach nth step
        return two;
    }
}
/* 
Time Complexity = O(n)
Space Complexity = O(1)
*/
