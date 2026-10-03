class Solution {
    public int missingNumber(int[] nums) {
        boolean mn = false;
        int i;
        for(i = 0; i <= nums.length; i++) {
            
            mn = false;

            for(int j = 0; j < nums.length; j++) {
                if(i == nums[j]) {
                    mn = true;
                    break;
                }
            }

            if(mn == false) {
                return i;
            }
        }

        return -1;
    }
}