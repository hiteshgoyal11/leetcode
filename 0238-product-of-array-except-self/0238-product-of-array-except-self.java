class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int prod = 1;
        // product calculate
        for(int i=0; i<nums.length; i++) {
            answer[i] = prod;
            prod *= nums[i];
        }
        prod = 1;
        for(int i=n-1; i>=0; i--) {
            answer[i] *= prod;
            prod *= nums[i];
        }
        return answer;
    }
}