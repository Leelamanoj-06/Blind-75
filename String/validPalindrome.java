package String;

class Solution {
    public boolean isPalindrome(String s) {
        //We will return True directly if the given String is empty
        if(s.isEmpty()){
            return true;
        }
        //Initialize start to 0 and last to the length of the string
        int start = 0;
        int last = s.length()-1;
        //Iterate from both the ends until you meet
        while(start<=last){
            //Before you check for the characters at either ends to be same
            //You should remove special characters if they're present and move your pointer
            //Convert the character to lower case before you check for the similarity
            //If you find that the characters are not same you will return false
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast)){
                last--;
            }else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                last--;
            }
        }
        //Returning true means it's palindrome
        return true;
    }
}
/*
Time Complexity = O(n)
Space Complexty = O(1)
*/
