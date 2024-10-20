class Solution {
    public int maxArea(int[] height) {
        int max_area=Integer.MIN_VALUE;
        int curr_area=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            curr_area=Math.min(height[i],height[j])*(j-i);
            max_area=Math.max(curr_area,max_area);
            if(height[i]<height[j])
            {
                i++;}
            else {
                j--;
                }


        }
        return max_area;
        
        
    }
}