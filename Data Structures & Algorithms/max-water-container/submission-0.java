class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int len= j-i;
            int breadth=Math.min(heights[i],heights[j]);
            int area= len*breadth;
            maxArea=Math.max(maxArea,area);
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }

            
        }
        return maxArea;
    }
}
