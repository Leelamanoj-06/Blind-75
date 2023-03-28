package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// test commit
/*Our idea here is to sort all the strings in the strs
Keeping the sorted value as key and inserting all the strings into the lists
that correspond to the sorted string keeps all the similar anagrams
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a hashmap of strings and list of strings
        HashMap<String, List<String>> map = new HashMap<>();
        // Loop through all the strings in strs
        for (int i = 0; i < strs.length; i++) {
            // Convert the strings in strs to character array inorder to sort them
            char[] charArray = strs[i].toCharArray();
            // Sort the character array for every strs[i]
            Arrays.sort(charArray);
            // Convert the sorted character array to a string
            String sortedStr = new String(charArray);
            // If the sorted string is not found in the HashMap
            if (map.get(sortedStr) == null) {
                // Insert the sortedStr as key and create a empty list as a value for that key
                map.put(sortedStr, new ArrayList<String>());
            }
            // Insert the sortedStr as a key and the actual string inside the list
            map.get(sortedStr).add(strs[i]);
        }
        // returning all the values of strings as list of strings
        return new ArrayList<>(map.values());
    }
}

/*
 * Time Complexity = O(n);
 * Space Complexity = O(n);
 */
