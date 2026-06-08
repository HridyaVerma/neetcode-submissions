class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> map= new HashSet<>();

        Arrays.sort(nums);

        if(n==0)
        {
            return 0;
        }

        int count=1;
        int maxcount=1;

        for( int i=0;i<n;i++)
        {
         if(!map.contains(nums[i]))
         {
            map.add(nums[i]);
         }
        }
        

        for(int i=1;i<n;i++) // i=0,1,2,3,4
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }

            if(nums[i]==nums[i-1]+1)
            {
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else
            {
                count=1;
            }
        }

        return maxcount;
    }
}
