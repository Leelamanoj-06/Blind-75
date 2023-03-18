package Array;

class Solution {
    public int maxArea(int[] height) {
        //set your low pointer at the start of the array
        int l = 0;
        //set your high pointer at the end of the array
        int h = height.length - 1;
        //set you initial max area to 0
        int maxArea = 0;
        //You will keep lopping until your high is greater than low
        //Our idea here is to find the maximum area between any two low and high pointers
        //Finding the maximum area will give us the maximum water that we can fill in a container
        //We're considering each height[i] as the depth of our container
        //We're assuming the difference between high and low pointers as width of our container
        while(l<h){
            //We will find the maximum possible water that we can fill
            //To compute we should first find the minimum of heights l and h
            //As we can only fill water to a point where both sides of the container are equal
            //Multiplying height with the breadth will give us the maximum area
            int currArea = Math.min(height[l],height[h])*(h-l);
            //If your current Area is greater the maxArea
            if(currArea>maxArea){
                //Assign Current Area to Max Area
                maxArea=currArea;
            }
            //We will move our low if height of l is lesser than height of h
            //We're doing this because we're in search of higher lengths 
            //which will obviously give us more area
            if(height[l]<height[h]){
                //Moving low towards the right
                l=l+1;
            }else{
                //Moving high towards the left
                h=h-1;
            }
        }
        //returning the max area will give us the container with maximum water
        return maxArea;
    }
}

/*
Time Complexity = O(n);
Space Complexity = O(1);
*/
