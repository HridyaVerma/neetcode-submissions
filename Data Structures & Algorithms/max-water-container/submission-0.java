class Solution {
    public int maxArea(int[] heights) {

        int n=heights.length;
        int left=0;
        int right=n-1;
        int localmax=0;
        int maximum=0;

        while(left<right)
        {
            int width=right-left;
            if(heights[left]<=heights[right])
            {
                localmax=heights[left]*width;
                maximum=Math.max(localmax,maximum);
                left++;
            }
            else
            {
                localmax=heights[right]*width;
                maximum=Math.max(localmax,maximum);
                right--;
            }
        }

        return maximum;
    
        
    }
}
