class Solution {
    public void reverseString(char[] s) {
        this.helper(s, 0);
    }
    
    public static void helper(char[] s, int n) {
        if (n == s.length/2) {
            return;
        }
        char temp1, temp2;
        temp1 = s[n];
        temp2 = s[s.length-n-1];
        s[n] = temp2;
        s[s.length-n-1] = temp1;
        n = n + 1;
        helper(s, n);
    }
}
