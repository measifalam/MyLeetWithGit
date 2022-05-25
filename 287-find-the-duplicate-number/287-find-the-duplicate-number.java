class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
          if(!mySet.add(nums[i]))
          { 
            return nums[i];
          }
        }
      return 2;
    }
}