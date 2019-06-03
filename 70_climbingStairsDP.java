class Solution {
    
    private int[] memo; 
    
    public int climbStairs(int n) {
        if ((n == 0) || (n == 1)) return 1;
        memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;
        climbStairsHelper(n, memo);
        return memo[n];
    }
    private void climbStairsHelper(int n, int[] arr) {
        for (int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2]; 
        }
        return;
    }
}
