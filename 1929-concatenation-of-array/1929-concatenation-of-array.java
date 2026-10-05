class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        Scanner sc = new Scanner(System.in);
        int ans[] = new int[2*n];
        for(int i=0; i<n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}