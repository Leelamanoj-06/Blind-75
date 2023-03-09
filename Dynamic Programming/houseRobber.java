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