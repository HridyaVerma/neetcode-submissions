class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=2*n;
        
        int[] ans = new int[m];
        int s=0;
        int f=s+n;
        for(int i=0;i<n;i++)
        {
            ans[s]=nums[i];
            ans[f]=nums[i];
            s++;
            f++;    
        }
        return ans;
    }
}