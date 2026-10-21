class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < n; i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        for (int i = n; i < m; i++) {
            if (java.util.Arrays.equals(a, b)) {
                return true;
            }

            b[s2.charAt(i - n) - 'a']--;
            b[s2.charAt(i) - 'a']++;
        }

        return java.util.Arrays.equals(a, b);
    }
}