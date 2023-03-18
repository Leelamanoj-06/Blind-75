package Array;
import java.util.HashMap;
import java.util.Map;

/*Inroder to solve this problem we use Hashmap to store the values of the nums array 
Initially you push all the values of the nums along with their index into the hashmap 
as we are required to return indices of two numbers that sum up to the given target 
using a for loop. So, all the nums elements are now pushed into the hashmap along 
with thier indices. You now compute the complement for each element in the nums array
using a for loop and check if that value is present as a element in the hashmap, if you
find an element in hashmap that is equal to the computed complement whose index is not 
as same as the element for which you complemented you're done and you're required to 
return the indices of the element that you complimented and also the index of the compliment itself*/

/* Time Complexity = O(n) 
 * Space Complexity = O(n)
*/

class blind75{
    static int[] twoSum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)&&map.get(complement)!=i){
                return new int[] {i,map.get(complement)};
            }
        }
        return null;
    }
public static void main(String[] args){
    int [] nums = {2,7,11,5};
    int target = 9; 
    int [] res = twoSum(nums, target);
    System.out.println("["+res[0]+","+res[1]+"]");
}
}
