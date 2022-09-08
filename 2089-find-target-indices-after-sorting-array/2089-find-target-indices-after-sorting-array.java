class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(target == nums[i])
            {
                myList.add(i);
            }
        }
        return myList;
        
    }
}