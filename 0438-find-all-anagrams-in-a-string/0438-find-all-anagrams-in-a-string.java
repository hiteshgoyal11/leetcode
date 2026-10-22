class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] count = new int[26];

        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            count[s.charAt(i) - 'a']--;
        }

        if (isZero(count)) {
            ans.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            count[s.charAt(i - p.length()) - 'a']++;
            count[s.charAt(i) - 'a']--;

            if (isZero(count)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }

    public boolean isZero(int[] count) {
        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}