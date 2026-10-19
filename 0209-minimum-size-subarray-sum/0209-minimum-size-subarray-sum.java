class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = 0;
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            count++;

            while(sum >= target) {
                min = Math.min(min, count);
                sum -= nums[left];
                left++;
                count--;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}