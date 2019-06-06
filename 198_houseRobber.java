import java.lang.*;
import java.util.*;

//memoized and iterative
class Solution {
    public int rob(int[] nums) {
        return Solution.robHelperMeme(nums);
    }
    
    public static int robHelperMeme(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] memoRob = new int[nums.length];
        memoRob[0] = nums[0];
        memoRob[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++){
            memoRob[i] = Math.max(memoRob[i-2]+nums[i], memoRob[i-1]);
        }
        return memoRob[nums.length-1];
    }
    
}
