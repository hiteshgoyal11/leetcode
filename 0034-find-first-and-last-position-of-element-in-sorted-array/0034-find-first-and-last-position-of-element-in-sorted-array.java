class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {

        int si = 0;
        int ei = nums.length - 1;
        int first = -1;

        while(si <= ei) {

            int mid = si + (ei - si) / 2;

            if(nums[mid] == target) {
                first = mid;
                ei = mid - 1;       // search left
            }
            else if(nums[mid] > target) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;
            }
        }

        return first;
    }

    public int findLast(int[] nums, int target) {

        int si = 0;
        int ei = nums.length - 1;
        int last = -1;

        while(si <= ei) {

            int mid = si + (ei - si) / 2;

            if(nums[mid] == target) {
                last = mid;
                si = mid + 1;       // search right
            }
            else if(nums[mid] > target) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;
            }
        }

        return last;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        int result[] = new Solution().searchRange(nums, target);
        System.out.print("[" +result[0]+ ", " +result[1]+ "]");
    }
}