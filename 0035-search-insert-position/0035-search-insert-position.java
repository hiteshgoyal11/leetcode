class Solution {
    public static int searchInsert(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        while(si <= ei) {
            int mid = si + (ei-si) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                ei = mid-1;
            } else {
                si = mid+1;
            }
        }
        return si;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(searchInsert(nums, target));
    }
}