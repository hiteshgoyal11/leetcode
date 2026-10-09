class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--) {
            s1 += s.charAt(i);
        }
        if(s.equals(s1)) {
            return true;
        }
        return false;
    }
}