class Solution {
     public int findTargetSumWays(int[] nums, int target) {
        return countTarget(nums, 0, 0, target);
    }
    
    public int countTarget(int[] nums, int pos, int sum, int target) {
        if (nums.length == pos) {
            return sum == target ? 1 : 0;
        }
        return countTarget(nums, pos + 1, sum + -nums[pos], target)
            + countTarget(nums, pos + 1, sum + nums[pos], target);
    }
}