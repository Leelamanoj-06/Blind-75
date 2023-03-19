import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        //Consider you have m rows of n columns
        //To solve this problem we're taking a previous array of size n with all 1's in it
        //The reason why we have populated the previous array with 1's is that from the mth row you can only 
        //move towards your right towards our destination 
        //So, you will only be able to move one step forward at this position
        //So, we're initializing prev array with 1's
        int [] prev = new int [n];
        Arrays.fill(prev,1);
        //So, for m rows we've to compute all the possible steps that should be taken to reach the destination
        for(int i=0;i<m-1;i++){
            //At every ith row of m rows you will initialize a curr array with all 1's (We do this from bottom to top)
            int [] curr = new int [n];
            Arrays.fill(curr,1);
            //Now, you will start from n-2 as your last curr[n-1] will have 1 and that's because you can only have one 
            //way to travel to destination i.e., only moving down to reach destination and same happens with all 
            //the elements at the last position in each row as you can only travel downwards
            //We will compute curr[j] as prev[j] plus curr[j+1] which are the elements that are present 
            //right next curr[j+1] and towards down as prev[j]
            //We're doing the above because you can only travel towards right or downwards 
            for(int j=n-2;j>=0;j--){
                curr[j] = prev[j]+curr[j+1];
            }
            //copying curr to prev to access the last row
            prev = curr.clone();
        }
        //returning prev[0] as it holds the total steps that should be taken to reach destination
        return prev[0];
    }
}
/*
Time Complexity = O(mn)
Space Complexity = O(n)
*/