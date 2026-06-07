class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int curr=nums[0];
        int location=0;
            int j=0;
       
        for(int i=0;j<n;i++)
        { 
         
            int currentposition=i;
            int currentvalue=nums[i];

            do{
                int nextposition=((currentposition+k)%n);
                
                int temp=nums[nextposition];
                nums[nextposition]=currentvalue;
                currentvalue=temp;
                

                currentposition=((currentposition+k)%n);
                j++;
            }
            while(i!=currentposition);
        }


    }
}