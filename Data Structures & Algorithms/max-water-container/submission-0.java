class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int water = 0;
        while(left < right)
        {
            water = Math.max(water , Math.min(heights[left],heights[right]) * (right-left));
            if(heights[left] > heights[right])
            right--;
            else
            left++;
        }
        return water;
    }
}
