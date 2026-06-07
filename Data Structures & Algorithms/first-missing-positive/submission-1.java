class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int positive=1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(!map.contains(nums[i]))
            {
                map.add(nums[i]);
            }
        }

        int min_positive=1;

        while(map.contains(min_positive))
        {
            min_positive++;
        }

        return min_positive;

        
    }
}