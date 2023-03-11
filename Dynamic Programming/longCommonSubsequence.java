/* We're solving this problem assuming that we have one string as a row and another string as a column
 * So, we're finding the lengths of both the given texts and we keep one text length to iterate over other text's characters.
 * We should initialize two arrays named curr and prev with length m or n, make sure you initialize both arrays with m or both arrays with n where m and n are lengths of text 1 and 2 respectively
 * If you have initialized arrays with length m then iterate over the text of length m for n times and vice versa.
 * While you iterate over the text of length m for n times reinstate the curr array elements with all 0's
 * While iterating over the text of length m and consider i as your n iterator and j as your m iterator 
 * If you find a match at curr[j] th position then add 1 to the diagonal value which will be your prev[j+1] to curr[j]
 * Else find the maximum of curr[j+1] and prev[j] and store it in curr[j]
 * Copy all the contents of curr to prev
 * When you are done iterating for n times return curr[0]
 */

import java.util.Arrays;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int [] curr = new int [m+1];
        int [] prev = new int [m+1];
        Arrays.fill(curr, 0);
        Arrays.fill(prev, 0);

        for(int i=n-1; i>=0; i--){
            Arrays.fill(curr, 0);
            for(int j=m-1;j>=0; j--){
                if(text1.charAt(j)==text2.charAt(i)){
                    curr[j] = prev[j+1] + 1;
                }else{
                    curr[j] = Math.max(curr[j+1],prev[j]);
                }
            }
            prev = curr.clone();
        } 
        return curr[0];
    }
}