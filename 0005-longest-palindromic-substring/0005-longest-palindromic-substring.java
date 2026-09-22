class Solution {

    public static String longestPalindrome(String s) {

        String max = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > max.length()) {
                    max = s.substring(left, right + 1);
                }

                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > max.length()) {
                    max = s.substring(left, right + 1);
                }

                left--;
                right++;
            }
        }

        return max;
    }
}