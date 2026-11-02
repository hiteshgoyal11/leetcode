class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        int i = 0;

        while(i < nums.length) {
            if(nums[i] == 1) {
                count++;
            }
            if(maxCount < count) {
                maxCount = count;
            }
            if(nums[i] == 0) {
                count = 0;
            }
            i++;
        }
        return maxCount;
    }
}