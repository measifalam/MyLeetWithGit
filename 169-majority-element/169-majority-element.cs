public class Solution {
    public int MajorityElement(int[] nums) {
        int len = nums.Length;
        int majority=nums[0];
        int count=1;
        
        for(int i=0;i<len;i++)
        {
            if(nums[i]==majority)
            {
                count=count+1;
            }
            else
            {
                count=count-1;
                if(count==0)
                {
                    majority=nums[i];
                    count=1;
                }
            }
        }
        return majority;
    }
}