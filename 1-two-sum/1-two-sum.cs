public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Dictionary<int,int> Dict = new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++)
        {
            if(Dict.ContainsKey(target-nums[i]))
            {
                arr[1]=i;
                arr[0]=Dict[target-nums[i]];
            }
            else
            {
                Dict[nums[i]]=i;
            }
        }
        return arr;
    }
}