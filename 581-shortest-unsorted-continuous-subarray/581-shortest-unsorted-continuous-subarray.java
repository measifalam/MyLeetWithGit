class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
      
      int start = nums.length, end=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]!=copy[i])
        {
          start = Math.min(start,i);
          end = Math.max(end,i);
        }
      }
      return (end-start>=0? end-start+1:0);
    }
}