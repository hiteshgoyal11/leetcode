class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            if(count > maxCount) {
                maxCount = count;
            }
            if(nums[i] == 0) {
                count = count;
                count = 0;
            }
        }
        return maxCount;
    }
}