class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;

        // Count zeros and find the product of all non-zero elements
        for (int n : nums) {
            if (n == 0) {
                zeroCount++;
                continue;
            }
            product = product * n;
        }

        // Populate the output array based on the number of zeros
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                // If there is more than one zero, every single product becomes 0
                nums[i] = 0;
            } else if (zeroCount == 1) {
                // If there is exactly one zero, only the zero position gets the product
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            } else {
                // Standard case with no zeros (uses division)
                nums[i] = product / nums[i];
            }
        }
        return nums;                       
    }
}

