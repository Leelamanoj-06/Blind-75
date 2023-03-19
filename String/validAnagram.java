package String;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        //Initialize a HashMap with character and Integer
        HashMap<Character, Integer> map = new HashMap<>();
        //Insert all the characters of first string s in the hashmap with the count
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            //If the character is already present in the map increase the character count by 1
            if(map.get(ch)!=null){
                map.put(ch, map.get(ch)+1);
            }
            //Else insert the character with count 1 as this is the first time we're inserting this character
            else{
                map.put(ch,1);
            }
        }
        //Loop through all the characters of t string
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            //if the character is present in the hashmap
            if(map.get(ch)!=null){
                //if the character is present only once remove it from hashmap
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                //if the character is present more than once reduce the count by 1
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            //if the character is not found in the hashmap it means that the character is missing 
            //You can directly return false
            else{
                return false;
            }
        }
        //If map is empty it means that all the characters were found in both the strings and they're anagrams
        return map.isEmpty();
    }
}
/*
Time Complexity = O(n);
Space Complexity = O(n);
*/
