class Solution {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(removeDuplicates(nums));
    }
}