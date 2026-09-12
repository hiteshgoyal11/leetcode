class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        for(int i=0; i<n; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[2*n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int ans[] = obj.shuffle(nums, n);

        System.out.println(Arrays.toString(ans));
    }
}