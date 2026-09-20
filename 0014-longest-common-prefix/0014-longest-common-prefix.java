class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        for(int i=0; i<strs[0].length(); i++) {
            for(int j=1; j<strs.length; j++) {
                if(i >= strs[j].length()) {
                    return ans;
                }
                if(strs[0].charAt(i) != strs[j].charAt(i)) {
                    return ans;
                }
            }
            ans = ans + strs[0].charAt(i);
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i=0; i<n; i++) {
            strs[i] = sc.next();
        }
        String result = longestCommonPrefix(strs);
        System.out.print(result);
    }
}