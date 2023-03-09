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