class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length - 1;
        int n2 = nums2.length - 1;

        int[] temp = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        return findMedianSortedArrays(nums1, nums2, i, j, temp, k);
    }

    public static double findMedianSortedArrays(
            int[] nums1, int[] nums2,
            int i, int j,
            int[] temp, int k) {

        // nums1 finished
        if (i > nums1.length - 1) {
            while (j < nums2.length) {
                temp[k] = nums2[j];
                j++;
                k++;
            }

            return findMedian(temp);
        }

        // nums2 finished
        if (j > nums2.length - 1) {
            while (i < nums1.length) {
                temp[k] = nums1[i];
                i++;
                k++;
            }

            return findMedian(temp);
        }

        // Both arrays still have elements
        if (nums1[i] <= nums2[j]) {
            temp[k] = nums1[i];

            return findMedianSortedArrays(
                    nums1, nums2, i + 1, j, temp, k + 1
            );

        } else {
            temp[k] = nums2[j];

            return findMedianSortedArrays(
                    nums1, nums2, i, j + 1, temp, k + 1
            );
        }
    }

    public static double findMedian(int[] temp) {

        int n = temp.length;

        if (n % 2 != 0) {
            return temp[n / 2];
        } else {
            return (temp[n / 2 - 1] + temp[n / 2]) / 2.0;
        }
    }
}