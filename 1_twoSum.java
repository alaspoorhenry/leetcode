class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sizeOfNums = nums.length;
        int ret[] = new int[2];
        for (int i = 0; i<sizeOfNums; i++){
            ret[0] = i;
            for (int j = 0; j<sizeOfNums; j++){
                if (nums[i]+nums[j] == target&&j != i){
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return null;
    }
}
